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

		By userName = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");
		By SignUpLink = By.linkText("Sign up");

//		WebElement emailID = driver.findElement(userName);
//		WebElement pwd = driver.findElement(password);
//		WebElement loginButton = driver.findElement(loginBtn);
//
//		emailID.sendKeys("Test@gmail.com");
//		pwd.sendKeys("test@123");
//		loginButton.click();

		doSendKeys(driver, userName, "Test@gmail.com");
		doSendKeys(driver, password, "test@123");
		doClick(driver, loginBtn);

		if (isDisplayed(driver, SignUpLink)) {
			String text = doGetText(driver, SignUpLink);
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
	public static void doSendKeys(WebDriver driver, By locator, String value) {
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
	 * This method is used to check whether element is displayed or not
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
	 * @return return the element text
	 */
	public static String doGetText(WebDriver driver, By locator) {
		return getElement(driver, locator).getText();
	}
}
