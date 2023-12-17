package com.qa.waits;

import java.time.Duration;

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

		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/signup");
		
		driver.findElement(By.id("hs-eu-decline-button")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0));
		/**
		 *  org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by:
		 *   By.id: username (tried for 0 second(s) with 500 milliseconds interval)
		 *    org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#username"}
		 */
		wait.until(ExpectedConditions.presenceOfElementLocated(signIn));

		driver.findElement(signIn).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(username));

		driver.findElement(username).sendKeys("test@gmail.com");

	}
/*
 * Exception in thread "main" org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.id: username (tried for 0 second(s) with 500 milliseconds interval)
	at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)
	at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)
	at com.qa.waits.ExplictWait_TimeOutNoSuchException.main(ExplictWait_TimeOutNoSuchException.java:37)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#username"}
  (Session info: chrome=114.0.5735.199)
For documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html
Build info: version: '3.141.59', revision: 'e82be7d358', time: '2018-11-14T08:17:03'
System info: host: 'SACHIN-SHARMA', ip: '192.168.117.210', os.name: 'Windows 10', os.arch: 'amd64', os.version: '10.0', java.version: '17.0.7'
Driver info: org.openqa.selenium.chrome.ChromeDriver	
 */
}

