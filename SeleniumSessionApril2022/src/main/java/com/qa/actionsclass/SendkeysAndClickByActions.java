package com.qa.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SendkeysAndClickByActions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://app.hubspot.com/signup");

		driver.findElement(By.linkText("Sign in")).click();

		Thread.sleep(3000);

		WebElement email = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));

		/*
		 * Actions action = new Actions(driver);
		 * 
		 * action.sendKeys(email, "test@gmail.com").build().perform();
		 * 
		 * action.sendKeys(password, "test@123").build().perform();
		 * 
		 * action.click(loginBtn).build().perform();
		 */

		doActionsSendkeys(driver, email, "test@gmail.com");
		doActionsSendkeys(driver, password, "test@123");
		doActionsClick(driver, loginBtn);

	}

	public static void doActionsSendkeys(WebDriver driver, WebElement element, String value) {
		Actions action = new Actions(driver);

		action.sendKeys(element, value).build().perform();

	}

	public static void doActionsClick(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.click(element).build().perform();
	}
}
