package com.qa.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/signup");

		driver.findElement(By.linkText("Sign in")).click();

		Thread.sleep(5000);

		// By locators
		By email = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");
		By SignUp = By.linkText("Sign up");

		// webelement and actions
		// driver.findElement(email).sendKeys("");

		// webelement
		// WebElement element = driver.findElement(password);

		// actions
		// element.sendKeys("");

//		getElement(driver, email).sendKeys("Test@gmail.com");
//		getElement(driver, password).sendKeys("Test");
//		doClick(driver, loginBtn);

		doSendKeys(driver, email, "Test@gmail.com");
		doSendKeys(driver, password, "Test@gmail.com");
		doClick(driver, loginBtn);

		if (isDisplayed(driver, SignUp)) {
			String text = getText(driver, SignUp);
			System.out.println(text);
		}

	}

	/**
	 * This method is used to create web element on the basis of By locators
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
			System.out.println("some exception occured while creating element " + locator);
		}
		return element;
	}

	/**
	 * This is used to click on an element
	 * 
	 * @param driver
	 * @param locator
	 */
	public static void doClick(WebDriver driver, By locator) {
		getElement(driver, locator).click();
	}

	/**
	 * This is used to pass the values
	 * 
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void doSendKeys(WebDriver driver, By locator, String value) {
		getElement(driver, locator).sendKeys(value);
	}

	/**
	 * This is used for getting the text
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static String getText(WebDriver driver, By locator) {
		return getElement(driver, locator).getText();
	}

	/**
	 * This is used to verify whether element is displayed or not
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static boolean isDisplayed(WebDriver driver, By locator) {
		return getElement(driver, locator).isDisplayed();
	}
}
