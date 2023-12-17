package com.qa.seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://app.hubspot.com/signup");

		WebElement signIn = driver.findElement(By.linkText("Sign in"));

		if (signIn.isDisplayed()) {
			System.out.println("element is displayed");
		} else {
			System.out.println("element is not displayed");

		}

		List<WebElement> linkList = driver.findElements(By.linkText("Sign in"));

		if (linkList.size() > 0) {
			System.out.println("element is displayed");
		}

	}
}
