package com.qa.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplictWait {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://app.hubspot.com/signup");

		driver.findElement(By.linkText("Sign in"));

		// Thread.sleep(3000); //static wait-pause for 5 seconds

		driver.findElement(By.id("username")).sendKeys("Test@gmail.com");

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

		driver.findElement(By.id("password")).sendKeys("Test@gmail.com");
		;

		// e3
		// e4
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		// e5
	}
}
