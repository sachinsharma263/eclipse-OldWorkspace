package com.qa.javascriptutil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeysAndClickByJS {

	public static void main(String args[]) throws InterruptedException

	{
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

		JavaScriptUtil js = new JavaScriptUtil(driver);

		js.sendKeysUsingJSWithId("username", "test@gmail.com");
		js.sendKeysUsingJSWithId("password", "test@123");

		Thread.sleep(3000);

		// js.clickElementByJS(loginButton);

		Actions action = new Actions(driver);
		action.click(loginButton).build().perform();
	}
}
