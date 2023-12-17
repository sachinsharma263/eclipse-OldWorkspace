package com.qa.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.utils.GenericMethods;

public class ExplictWait_TitleIssueResolved {
	public static void main(String[] args) throws InterruptedException {

		By username = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");

		By signInLink = By.linkText("Sign in");

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/signup");

		ExplictWaitConcept.waitForPresenceOfElementLocated(driver, signInLink, 20);

		GenericMethods.doClick(driver, signInLink);

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("HubSpot"));

		System.out.println(driver.getTitle());

	}
}
