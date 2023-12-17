package com.qa.waits;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWait_TitleIssueResolved {

	public static void main(String[] args) {
	

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");
		
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.titleContains("HubSpot"));
		
		waitForTitle(driver, "HubSpot");
		
		System.out.println(driver.getTitle());

	}
	public static void waitForTitle(WebDriver driver,String title) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains(title));
	}

}
