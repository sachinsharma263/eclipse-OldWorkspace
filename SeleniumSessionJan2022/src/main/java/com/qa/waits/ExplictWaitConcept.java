package com.qa.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplictWaitConcept {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/signup");

		driver.findElement(By.linkText("Sign in")).click();

//		WebDriverWait wait=new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));

		presenceOfElementLocated(driver, 0, By.id("password"));
		
//		driver.findElement(By.id("password")).sendKeys("Test@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Test@gmail.com");

	}

	public static void presenceOfElementLocated(WebDriver driver, int time, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}
	
}
