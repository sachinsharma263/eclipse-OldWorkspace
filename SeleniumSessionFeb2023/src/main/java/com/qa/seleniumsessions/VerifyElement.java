package com.qa.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");

		WebElement SignUpLink = driver.findElement(By.linkText("Sign up"));

		System.out.println(SignUpLink.isDisplayed());

		if (driver.findElements(By.linkText("Sign up")).size() > 0) {
			System.out.println("element is present");
		} else {
			System.out.println("element is not present");
		}

	}
}
