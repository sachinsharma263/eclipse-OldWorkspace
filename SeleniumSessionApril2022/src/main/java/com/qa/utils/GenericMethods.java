package com.qa.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * to overcome noisy code/repetative code we have to create generic methods
 * advantage of generic method is reusability,code looks vey neat and clean and not noisy
 * This methods are so generic that can be used for any web applications
 * here we have created our own wrappers/utilities
 * we have wrapped driver find element method/api with our own get element method
 * we have wrapped driver click api/method with our own doclick method
 */
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
		By loginBtn = By.id("loginBtn");
		By SignUp = By.linkText("Sign up2");

		/*
		 * // create the web element by using by locator WebElement email =
		 * driver.findElement(username); WebElement pwd = driver.findElement(password);
		 * WebElement loginButton = driver.findElement(loginBtn); WebElement signUpLink
		 * = driver.findElement(SignUp);
		 * 
		 * // perform action on the web element email.sendKeys("test@gmail.com");
		 * pwd.sendKeys("test@123"); loginButton.click();
		 * 
		 * This is not the way we work in real time project, we have to create generic
		 * methods
		 */

		doSendKeys(driver, username, "test@gmail.com");
		doSendKeys(driver, password, "test@123");
		doClick(driver, loginBtn);

		if (doIsDisplayed(driver, SignUp)) {
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
			System.out.println("some error occured while creating the web element : " + locator);
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
	 * This method is used to check whether element is present or not
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static boolean doIsDisplayed(WebDriver driver, By locator) {
		return getElement(driver, locator).isDisplayed();
	}

	/**
	 * This method is used to get the text
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static String doGetText(WebDriver driver, By locator) {
		return getElement(driver, locator).getText();
	}
}
