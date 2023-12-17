package com.qa.ActionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));

		Actions action = new Actions(driver);

		action.contextClick(rightClickMe).build().perform();

		List<WebElement> optionList = driver
				.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[@class]/span"));

		System.out.println(optionList.size());

		for (int i = 0; i < optionList.size(); i++) {
			String text = optionList.get(i).getText();
			System.out.println(text);
			if (text.equalsIgnoreCase("copy")) {
				optionList.get(i).click();

				break;

			}

		}
	}
}