package com.qa.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendkeysAndClickByActions {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/signup");

		driver.findElement(By.linkText("Sign in")).click();

		Thread.sleep(3000);

		By username = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");

		WebElement emailID = driver.findElement(username);
		WebElement pwd = driver.findElement(password);
		WebElement loginButton = driver.findElement(loginBtn);

//		Actions action = new Actions(driver);
//
//		action.sendKeys(emailID, "test@gmail.com").build().perform();
//		action.sendKeys(pwd, "test@gmail").build().perform();
//		action.click(loginButton).build().perform();

		doActionSendkeys(driver, emailID, "test@gmail.com");
		doActionSendkeys(driver, pwd, "test@gmail");
		doActionClick(driver, loginButton);

	}

	public static void doActionSendkeys(WebDriver driver, WebElement element, String value) {
		Actions action = new Actions(driver);
		action.sendKeys(element, value).build().perform();
	}

	public static void doActionClick(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.click(element).build().perform();
	}
}
