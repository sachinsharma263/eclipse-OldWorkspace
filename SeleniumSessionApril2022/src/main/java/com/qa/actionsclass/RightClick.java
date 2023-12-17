package com.qa.actionsclass;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		// WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right
		// click me']"));
		By rightClickMe = By.xpath("//span[text()='right click me']");
		By menuList = By
				.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]");

		/*
		 * Actions action = new Actions(driver);
		 * 
		 * action.contextClick(rightClickMe).build().perform();
		 * 
		 * List<WebElement> optionsList = driver.findElements(By
		 * .xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]"
		 * ));
		 * 
		 * System.out.println(optionsList.size());
		 * 
		 * for (int i = 0; i < optionsList.size(); i++) { String text =
		 * optionsList.get(i).getText();
		 * 
		 * System.out.println(text); if (text.equalsIgnoreCase("copy")) {
		 * optionsList.get(i).click();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * // Alert alert=driver.switchTo().alert(); // alert.accept();
		 * 
		 * break;
		 * 
		 * } }
		 */

		doActionRightClick(driver, rightClickMe);

		List<WebElement> optionsList = getOptionsList(driver, menuList);

		System.out.println("total number of options: " + optionsList.size());

		for (int i = 0; i < optionsList.size(); i++) {
			System.out.println(optionsList.get(i).getText());
		}
		System.out.println("-------------------");

		for (int i = 0; i < optionsList.size(); i++) {
			String text = optionsList.get(i).getText();
			System.out.println(optionsList.get(i).getText());
			if (text.equalsIgnoreCase("copy")) {
				optionsList.get(i).click();

				Thread.sleep(3000);

				Alert alert = driver.switchTo().alert();
				alert.accept();

				//break;
			}
		}
	}

	public static void doActionRightClick(WebDriver driver, By locator) {
		Actions action = new Actions(driver);

		action.contextClick(getElement(driver, locator)).build().perform();
	}

	public static WebElement getElement(WebDriver driver, By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> getOptionsList(WebDriver driver, By locator) {
		return driver.findElements(locator);
	}

}
