package com.qa.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysAndClickByActions {

	public static void main(String[] args) {
		By username = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");

		System.setProperty("Webdriver.gecko.driver", "D:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://app.hubspot.com/login");

		doActionSendkeys(driver, username, "test@gmail.com");
		doActionSendkeys(driver, password, "test@123");
		doActionClick(driver, loginBtn);
	}

	public static void doActionSendkeys(WebDriver driver, By locator, String value) {
		Actions action = new Actions(driver);
		action.sendKeys(getElement(driver, locator), value).build().perform();
	}

	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element = null;
		try {
			return element = driver.findElement(locator);
		} catch (Exception e) {

		}
		return element;
	}

	public static void doActionClick(WebDriver driver, By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(driver, locator)).build().perform();
	}

}
