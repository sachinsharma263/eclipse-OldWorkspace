package com.qa.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplictWait_TitleIssueResolved {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/signup");
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.titleIs("Get started with HubSpot"));
		wait.until(ExpectedConditions.titleContains("Get started"));
		
		driver.findElement(By.linkText("Sign in")).click();
}
}