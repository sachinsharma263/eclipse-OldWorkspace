package com.qa.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.util.GenericMethods;

public class ImplictWaitConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://app.hubspot.com/signup");

		GenericMethods.getElement(driver, By.linkText("Sign in")).click();

		// Thread.sleep(3000);

		driver.findElement(By.id("username")).sendKeys("test@gmail.com");// e1
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);//nullification 

		driver.findElement(By.id("password")).sendKeys("test@123");// e2

		// e3
		// e4
		// e5
	}
}
