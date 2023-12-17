package com.qa.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://mrbool.com/");

		WebElement content = driver.findElement(By.xpath("//a[@class='menulink']"));

		/*
		 * Actions action = new Actions(driver);
		 * 
		 * action.moveToElement(content).build().perform();
		 */

		By contentElement = By.xpath("//a[@class='menulink']");
		By coursesElement = By.xpath("(//li//a[text()='Courses'])[2]");
		// moveToElement(driver, getElement(driver, contentElement));

		moveToElement2(driver, contentElement);

		// driver.findElement(By.xpath("(//li//a[text()='Courses'])[2]")).click();

		doclick(driver, coursesElement);

	}

	public static void moveToElement(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

	public static void moveToElement2(WebDriver driver, By locator) {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(driver, locator)).build().perform();
	}

	public static WebElement getElement(WebDriver driver, By locator) {
		return driver.findElement(locator);
	}

	public static void doclick(WebDriver driver, By locator) {
		getElement(driver, locator).click();
	}
}
