package com.qa.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * approach 1,2 and 3 are noisy,code is not neat and clean,repetative code
 * to overcome noisy code/repetative code we have to create generic methods
 * advantage of generic method is reusability,code looks vey neat and clean and not noisy
 * This methods are so generic that can be used for any web applications
 * here we have created our own wrappers/utilities
 * we have wrapped driver find element method/api with our own get element method
 * we have wrapped driver click api/method with our own doclick method
 */
public class GenericMethods {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/signup");

		driver.findElement(By.linkText("Sign in")).click();

		Thread.sleep(3000);

//		// 1 approach
//		driver.findElement(By.id("username")).sendKeys("");
//		driver.findElement(By.id("password")).sendKeys("");
//
//		// 2 approach
//		WebElement emailId = driver.findElement(By.id("username"));
//		WebElement pass = driver.findElement(By.id("password"));
//		WebElement loginButton = driver.findElement(By.id("loginBtn"));
//
//		emailId.sendKeys("");
//		pass.sendKeys("");
//		loginButton.click();

		// 3 approach
		// create By locators
		By email = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");
		By signUpLink = By.linkText("Sign up");

		// create the web element by using by locator

//		WebElement emailId=driver.findElement(email);
//		WebElement pass=driver.findElement(password);
//		WebElement loginButton=driver.findElement(loginBtn);

		// perform action on above web elements
//		emailId.sendKeys("");
//		pass.sendKeys("");
//		loginButton.click();

		// This is not the way we work in real time project, we have to create generic
		// methods
		// we are using same driver method/api like driver.findelement again and again
		// ,also other driver api repeated task,this is not the way we work in
		// real time project,we have to create generic methods/utilities

		// 4 approach- create the By locator
		// use generic methods to create web element and perform action

		doSendkeys(driver, email, "test@gmail.com");
		doSendkeys(driver, password, "test@123");
		doClick(driver, loginBtn);

		if (doDisplayed(driver, signUpLink)) {
			String text = doGetText(driver, signUpLink);
			System.out.println(text);
		}

	}

	/**
	 * This method is use to create the web element on the basis of By locator
	 * 
	 * @param driver
	 * @param locator
	 * @return web element
	 */
	public static WebElement getElement(WebDriver driver, By locator) {

		WebElement element = null;
		try {
			return driver.findElement(locator);
		} catch (Exception e) {
			System.out.println("some exception occured while creating the web element: " + locator);
		}
		return element;
	}

	/**
	 * This method is use to pass the values
	 * 
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void doSendkeys(WebDriver driver, By locator, String value) {

		getElement(driver, locator).sendKeys(value);
	}

	/**
	 * This method is used to check whether element is present or not
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static boolean doDisplayed(WebDriver driver, By locator) {
		return getElement(driver, locator).isDisplayed();
	}

	/**
	 * This method is use to click on the web element
	 * 
	 * @param driver
	 * @param locator
	 */
	public static void doClick(WebDriver driver, By locator) {
		getElement(driver, locator).click();
	}

	/**
	 * This method is used to get the text
	 * 
	 * @param driver
	 * @param locator
	 * @return text
	 */
	public static String doGetText(WebDriver driver, By locator) {
		return getElement(driver, locator).getText();
	}
	

}
