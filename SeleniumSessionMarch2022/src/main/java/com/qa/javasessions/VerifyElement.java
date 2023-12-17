package com.qa.javasessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/signup");

		driver.findElement(By.linkText("Sign in")).click();

		Thread.sleep(3000);

		WebElement element = driver.findElement(By.linkText("Sign up"));

		System.out.println(element.isDisplayed());

		List<WebElement> list = driver.findElements(By.linkText("Sign up"));

		if (list.size() > 0) {

			System.out.println("element is present");
		}
	}

}
