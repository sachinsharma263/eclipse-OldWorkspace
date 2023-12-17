package com.qa.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplictWait {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/signup");
		
		String title=presenceOfTitle(driver, "Get started");
		System.out.println(title);

		driver.findElement(By.linkText("Sign in")).click();

//		WebDriverWait wait = new WebDriverWait(driver, 10);
//
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
		
		presenceOfElementLocated(driver, By.id("username"));

		driver.findElement(By.id("username")).sendKeys("Test@123");
		driver.findElement(By.id("password")).sendKeys("Test@123");

	}
	public static void presenceOfElementLocated(WebDriver driver, By locator) {
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	public static String  presenceOfTitle(WebDriver driver,String title) {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains(title));
		
		return driver.getTitle();
	}
}
