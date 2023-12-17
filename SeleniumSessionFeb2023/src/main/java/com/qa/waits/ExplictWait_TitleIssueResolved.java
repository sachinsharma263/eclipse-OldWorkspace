package com.qa.waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWait_TitleIssueResolved {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");

//		WebDriverWait wait=new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.titleIs("HubSpot Login"));

		waitForTitle(driver, "HubSpot Login");

		System.out.println(driver.getTitle());
	}

	public static void waitForTitle(WebDriver driver, String title) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs(title));
	}

}
