package com.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericMethods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/signup");

		driver.findElement(By.linkText("Sign in")).click();

		Thread.sleep(3000);

		// By locators
		By username = By.id("username");
		By password = By.id("password");
		By lgnBtn = By.id("loginBtn");
		By SignUp = By.linkText("Sign up");

		// create the web element by using by locator
		/*
		 * WebElement emailId = driver.findElement(username); WebElement pwd =
		 * driver.findElement(password); WebElement loginButton =
		 * driver.findElement(lgnBtn);
		 */

		// perform action on the web element
		/*
		 * emailId.sendKeys("test@gmail.com"); pwd.sendKeys("test@123");
		 * loginButton.click();
		 */

		doSendkeys(driver, username, "test@gmail.com");
		doSendkeys(driver, password, "test@123");
		doClick(driver, lgnBtn);

		if (isDisplayed(driver, SignUp)) {
			String text = doGetText(driver, SignUp);
			System.out.println(text);
		}

	}

	/**
	 * This method is used to create the web element on the basis of By locator
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
		} catch (Exception e) {
			System.out.println("some exception occured while creating the web element: " + locator);
		}
		return element;
	}

	/**
	 * This method is used to pass the values
	 * 
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void doSendkeys(WebDriver driver, By locator, String value) {
		getElement(driver, locator).sendKeys(value);

	}

	/**
	 * This method is used to click on the web element
	 * 
	 * @param driver
	 * @param locator
	 */
	public static void doClick(WebDriver driver, By locator) {
		getElement(driver, locator).click();
	}

	/**
	 * This method is used to check whether element is present or not
	 * 
	 * @param driver
	 * @param locator
	 * @return return true if element present otherwise false
	 */
	public static boolean isDisplayed(WebDriver driver, By locator) {
		return getElement(driver, locator).isDisplayed();
	}

	/**
	 * This method is used for getting the text
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static String doGetText(WebDriver driver, By locator) {
		return getElement(driver, locator).getText();
	}
}
