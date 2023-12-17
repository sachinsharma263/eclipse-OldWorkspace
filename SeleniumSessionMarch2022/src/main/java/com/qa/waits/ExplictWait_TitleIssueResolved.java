package com.qa.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplictWait_TitleIssueResolved {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

//		WebDriverWait wait = new WebDriverWait(driver, 10);

		driver.get("http://app.hubspot.com/signup");

//		wait.until(ExpectedConditions.titleContains("Get2"));

		System.out.println(presenceOfTitle(driver, "Get2", 10));// org.openqa.selenium.TimeoutException: Expected
																// condition failed: waiting for title to contain
																// "Get2". Current title: "Get started with HubSpot"
																// (tried for 10 second(s) with 500 milliseconds
																// interval)

		driver.findElement(By.linkText("Sign in")).click();
	}

	public static String presenceOfTitle(WebDriver driver, String title, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.titleContains(title));

		return driver.getTitle();
	}
}
