package com.qa.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * Explict wait applied in the form of webdriverwait
 */
public class ExplictWaitConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/signup");

		driver.findElement(By.linkText("Sign in")).click();// e1

		// WebDriverWait wait=new WebDriverWait(driver, 10);
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));

		presenceOfElementLocated(driver, By.id("username"), 10);

		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("test@123");
		driver.findElement(By.id("loginBtn")).click();

	}

	public static void presenceOfElementLocated(WebDriver driver, By locator, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}
	// internally explict wait is using by.id also
	// implict wait no timeout exception only no such element exception

}
