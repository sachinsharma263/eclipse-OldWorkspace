package com.qa.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class SendKeysAndClickByActions {

	public static void main(String[] args) {
		
		By username = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");

		System.setProperty("Webdriver.gecko.driver", "D:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://app.hubspot.com/login");

		doActionSendKeys(driver, username, "test@gmail.com");
		doActionSendKeys(driver, password, "test@123");
		doActionClick(driver, loginBtn);

	}

	public static void doActionSendKeys(WebDriver driver, By locator, String value) {
		Actions action = new Actions(driver);
		action.sendKeys(getElement(driver, locator), value).build().perform();
	}

	public static void doActionClick(WebDriver driver, By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(driver, locator)).build().perform();
	}
	public static WebElement getElement(WebDriver driver,By locator) {
		WebElement element=driver.findElement(locator);
		return element;
	}

}
