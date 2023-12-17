package com.qa.staleelementexception;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementReferenceException2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://classic.crmpro.com/index.html");

		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));

		username.sendKeys("test@gmail.com");
		password.sendKeys("test@123");

		Thread.sleep(1000);

		driver.navigate().refresh();

		Thread.sleep(1000);

		try {

			username.sendKeys("test@gmail.com");
		} catch (StaleElementReferenceException e) {
			username = driver.findElement(By.name("username"));
			username.sendKeys("test@gmail.com");
		}

	}

}
