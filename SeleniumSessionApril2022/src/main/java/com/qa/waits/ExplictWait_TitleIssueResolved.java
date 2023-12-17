package com.qa.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWait_TitleIssueResolved {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/signup");

		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.titleContains("Hub2"));// Exception in thread "main"
																// org.openqa.selenium.TimeoutException: Expected
																// condition failed: waiting for title to contain
																// "Hub2". Current title: "Get started with HubSpot"
																// (tried for 10 second(s) with 500 milliseconds
																// interval)

		//presenceOfTitleContains(driver, "Get", 10);
		presenceOfTitleIs(driver, "Get started with HubSpot", 5);
		driver.findElement(By.linkText("Sign in")).click();

	}

	public static void presenceOfTitleContains(WebDriver driver, String title, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.titleContains(title));
	}
	public static void presenceOfTitleIs(WebDriver driver,String title,int time)

	{
		
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.titleIs(title));
		
	
	}
}
