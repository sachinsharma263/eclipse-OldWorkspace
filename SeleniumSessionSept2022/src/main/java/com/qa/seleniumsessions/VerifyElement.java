package com.qa.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/signup");

		driver.findElement(By.linkText("Sign in")).click();

		try {
			Thread.sleep(3000);
		} catch (Exception e) { // TODO: handle exception }

		}

		WebElement signUpLink = driver.findElement(By.linkText("Sign up"));

		if (signUpLink.isDisplayed()) {
			System.out.println("element present");
		} else {
			System.out.println("element not present");
		}
		
		if(driver.findElements(By.linkText("Sign up")).size()>0)
			{
			System.out.println("hurry found");
			};
	}
}
