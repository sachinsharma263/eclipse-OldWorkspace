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

		Thread.sleep(5000);

		// WebElement username=driver.findElement(By.id("username"));

		// By locators
		By username = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");
		By SignUpLink = By.linkText("Sign up");

		/*
		 * WebElement emailID = driver.findElement(username); WebElement pwd =
		 * driver.findElement(password); WebElement lgnBtn =
		 * driver.findElement(loginBtn); WebElement signUp =
		 * driver.findElement(SignUpLink);
		 * 
		 * emailID.sendKeys("Test@gmail.com"); pwd.sendKeys("test@123"); lgnBtn.click();
		 */

		doSendKey(driver, username, "Test@gmail.com");
		doSendKey(driver, password, "test@123");
		doClick(driver, loginBtn);

		if (isDisplayed(driver, SignUpLink)) {
			System.out.println("verified:SignUp Link is present");
			String text = doGetText(driver, SignUpLink);
			System.out.println(text);
		}

		else
			System.out.println("SignUp Link missing");
	}

	/**
	 * This method is used to create web element on the basis of by locator
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

			System.out.println("some error occured while creting the webelement " + locator);
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
	public static void doSendKey(WebDriver driver, By locator, String value) {
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
	 * This method is used to check whether element displayed or not
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static boolean isDisplayed(WebDriver driver, By locator) {
		return getElement(driver, locator).isDisplayed();
	}

	/**
	 * This method is used for getting the text
	 * 
	 * @param driver
	 * @param locator
	 * @param value
	 * @return
	 */
	public static String doGetText(WebDriver driver, By locator) {
		return getElement(driver, locator).getText();
	}

}
