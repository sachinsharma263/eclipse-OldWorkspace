package com.qa.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Implicit wait is not a good practice because it applied for all the web elements by default
 * global wait only for web elements,not for title
 * although it is dynamic in nature,if element found in 5 sec then rest 5 sec can be ignored
 * whenever we use driver api like find element and find elements then implicit wait will be applied
 */
public class ImplictWaitConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);// applied for all the web elements by default
		// global wait

		driver.get("http://app.hubspot.com/signup");

		driver.findElement(By.linkText("Sign in")).click();

		// Thread.sleep(3000);//static wait-pause for 5 sec

		driver.findElement(By.id("username")).sendKeys("test@gmail.com");

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);// nullify implicit wait

		driver.findElement(By.id("password")).sendKeys("test@123");

		// e3
		// e4

	}

}
