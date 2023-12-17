package com.qa.wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplictWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		//WebDriverWait wait = new WebDriverWait(driver, 30);

		driver.get("http://app.hubspot.com/signup");

		driver.findElement(By.linkText("Sign in")).click();

		// wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
		// wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));

		presenceOfElementLocated(driver, 10, By.id("username"));

		driver.findElement(By.id("username")).sendKeys("test@gail.com");
		driver.findElement(By.id("password")).sendKeys("test@123");
		driver.findElement(By.id("loginBtn")).click();
	}

	public static void presenceOfElementLocated(WebDriver driver, int time, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

}
