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

		/*
		 * WebElement username = driver.findElement(By.id("username")); WebElement
		 * password = driver.findElement(By.id("password")); WebElement loginBtn =
		 * driver.findElement(By.id("loginBtn"));
		 */

		By username = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");

		/*
		 * Actions actions = new Actions(driver); actions.sendKeys(username,
		 * "test@gmail.com").build().perform();
		 * 
		 * actions.sendKeys(password, "test@123").build().perform();
		 * 
		 * actions.click(loginBtn).build().perform();
		 */

		doActionsSendKeys(driver, getElement(driver, username), "test@gmail.com");
		doActionsSendKeys(driver, getElement(driver, password), "test@123");
		doActionsClick(driver, getElement(driver, loginBtn));

	}

	public static void doActionsSendKeys(WebDriver driver, WebElement element, String value) {

		Actions actions = new Actions(driver);
		actions.sendKeys(element, value).build().perform();
	}

	public static void doActionsClick(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.click(element).build().perform();
	}

	public static WebElement getElement(WebDriver driver, By locator) {

		return driver.findElement(locator);
	}
}