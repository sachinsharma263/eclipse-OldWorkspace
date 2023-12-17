package com.qa.staleelementexception;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleELementReferenceException2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");

		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("sachinsharma263@gmail.com");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("test@123");

		Thread.sleep(3000);

		driver.navigate().refresh();

		Thread.sleep(3000);

		try {

			email.sendKeys("sachinsharma263@gmail.com");
		} catch (StaleElementReferenceException e) {
			email = driver.findElement(By.id("username"));
			email.sendKeys("sachinsharma263@gmail.com");
		}

	}

}
