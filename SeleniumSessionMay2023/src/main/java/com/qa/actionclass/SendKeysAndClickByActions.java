package com.qa.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysAndClickByActions {

	public static void main(String[] args) {

		By email = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");

		doActionSendKeys(driver, email, "test@gmail.com");
		doActionSendKeys(driver, password, "test@123");
		doActionClick(driver, loginBtn);

	}

	public static void doActionSendKeys(WebDriver driver, By locator, String val) {
		Actions action = new Actions(driver);
		action.sendKeys(getElement(driver, locator), val).build().perform();
	}

	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element = null;
		try {
		element= driver.findElement(locator);
		return element;
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}

	public static void doActionClick(WebDriver driver, By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(driver, locator)).build().perform();
	}
}
