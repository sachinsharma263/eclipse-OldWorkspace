package com.qa.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplictWait_TimeOutNoSuchException {

	public static void main(String[] args) {

		By username = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");
		By signIn = By.linkText("Sign in");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/signup");

		WebDriverWait wait = new WebDriverWait(driver, 0);
		/**
		 *  org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by:
		 *   By.id: username (tried for 0 second(s) with 500 milliseconds interval)
		 *    org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#username"}
		 */
		wait.until(ExpectedConditions.presenceOfElementLocated(signIn));

		driver.findElement(signIn).click();

		driver.findElement(username).sendKeys("test@gmail.com");

	}
}
