package com.qa.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementText {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/signup");
		
		Thread.sleep(3000);

		driver.findElement(By.linkText("Sign in")).click();

		Thread.sleep(3000);

		String text = driver.findElement(By.className("signup-link")).getText();

		System.out.println(text);

		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("test@123");
		driver.findElement(By.id("loginBtn")).click();

		Thread.sleep(3000);
		
		String text2 = driver.findElement(By.className("private-alert__inner")).getText();
		System.out.println(text2);
		if (text2.contains("This doesn't look right.")) {
			System.out.println("correct message");
		}

	}

}
