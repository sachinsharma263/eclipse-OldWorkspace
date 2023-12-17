package com.qa.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendkeysAndClickByActions {

	public static void main(String[] args) throws InterruptedException {

		By username = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/signup");

		driver.findElement(By.linkText("Sign in")).click();

		Thread.sleep(3000);

		Actions action = new Actions(driver);

		/*
		 * WebElement email=driver.findElement(username); WebElement
		 * pass=driver.findElement(password); WebElement
		 * loginButton=driver.findElement(loginBtn);
		 * 
		 * action.sendKeys(email, "test@gmail.com").build().perform();
		 * action.sendKeys(pass,"test@123").build().perform();
		 * action.click(loginButton).build().perform();
		 */
		WebElement email = getElement(driver, username);

		WebElement pass = getElement(driver, password);

		WebElement loginButton = getElement(driver, loginBtn);

		doActionSendKeys(driver, email, "test@gmail.com");
		doActionSendKeys(driver, pass, "test@123");
		doActionClick(driver, loginButton);

	}

	public static void doActionSendKeys(WebDriver driver, WebElement element, String value) {
		Actions action = new Actions(driver);
		action.sendKeys(element, value).build().perform();
		
	}

	public static void doActionClick(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.click(element).build().perform();
	}

	public static WebElement getElement(WebDriver driver, By locator) {
		return driver.findElement(locator);
	}

}
