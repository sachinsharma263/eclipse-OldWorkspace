package com.qa.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeysAndClickByActions {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/signup");

		driver.findElement(By.linkText("Sign in")).click();

		Thread.sleep(3000);

		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("loginBtn"));

		/*
		 * Actions action = new Actions(driver);
		 * 
		 * action.sendKeys(username, "test@gmail.com").build().perform(); ;
		 * action.sendKeys(password, "test@123").build().perform(); ;
		 * action.click(loginButton).build().perform();
		 */
		doActionsSendkeys(driver, username, "test@gmail.com");
		doActionsSendkeys(driver, password, "test@123");
		doActionsClick(driver, loginButton);

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
