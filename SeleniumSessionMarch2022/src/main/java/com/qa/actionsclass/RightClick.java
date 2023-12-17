package com.qa.actionsclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		// WebElement rightClick = driver.findElement(By.xpath("//span[text()='right
		// click me']"));
		By righClick = By.xpath("//span[text()='right click me']");
		By menuList = By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span");

		/*
		 * Actions actions = new Actions(driver);
		 * 
		 * actions.contextClick(rightClick).build().perform();
		 */
		doActionRightClick(driver, righClick);

		/*
		 * List<WebElement> optionList = driver .findElements(By.
		 * xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));
		 */
		List<WebElement> optionList = getOptionsList(driver, menuList);

		System.out.println("total options are: " + optionList.size());

		for (int i = 0; i < optionList.size(); i++) {
			System.out.println(i + "-->" + optionList.get(i).getText());
		}

		System.out.println("------------");

		for (int i = 0; i < optionList.size(); i++) {
			System.out.println(i + "-->" + optionList.get(i).getText());
			String text = optionList.get(i).getText();
			if (text.equals("Copy")) {
				optionList.get(i).click();
				break;
//				Thread.sleep(3000);
//				Alert alert = driver.switchTo().alert();
//				alert.accept();
			}
		}
	}

	public static WebElement getElement(WebDriver driver, By locator) {
		return driver.findElement(locator);
	}

	public static void doActionRightClick(WebDriver driver, By locator) {
		WebElement element = getElement(driver, locator);
		Actions actions = new Actions(driver);
		actions.contextClick(element).build().perform();
	}

	public static List<WebElement> getOptionsList(WebDriver driver, By locator) {
		return driver.findElements(locator);
	}

}
