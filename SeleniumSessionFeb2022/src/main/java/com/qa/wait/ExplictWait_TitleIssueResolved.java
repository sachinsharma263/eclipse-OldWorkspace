package com.qa.wait;

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

		driver.get("http://app.hubspot.com/signup");

		// WebDriverWait wait = new WebDriverWait(driver, 10);
		// wait.until(ExpectedConditions.titleContains("Get"));

		System.out.println(presenceOfTitle(driver, 10, "Get started with HubSpot2"));
		// org.openqa.selenium.TimeoutException:
																					
		// Expected
		// condition failed: waiting for title to contain
		// "Gett". Current title: "Get started with HubSpot"
		// (tried for 10 second(s) with 500 milliseconds
		// interval)

		driver.findElement(By.linkText("Sign in")).click();
	}

	public static String presenceOfTitle(WebDriver driver, int time, String title) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
	}
}