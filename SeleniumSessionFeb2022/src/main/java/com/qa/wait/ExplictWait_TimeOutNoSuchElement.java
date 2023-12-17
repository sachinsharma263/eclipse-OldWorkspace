package com.qa.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplictWait_TimeOutNoSuchElement {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/signup");

		driver.findElement(By.linkText("Sign in")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));
		/**
		 *  org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by:
		 *   By.id: username (tried for 0 second(s) with 500 milliseconds interval)
		 *    org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#username"}
		 */

		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
	}

}
