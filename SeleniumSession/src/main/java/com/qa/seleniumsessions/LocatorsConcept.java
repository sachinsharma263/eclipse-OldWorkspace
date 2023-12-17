package com.qa.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/signup");

		driver.findElement(By.linkText("Sign in")).click();

		Thread.sleep(5000);

		// 8 types of locators

		// 1. id
//		driver.findElement(By.id("username")).sendKeys("Sachinsharma263@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("bholababa");
//		driver.findElement(By.id("loginBtn")).click();

//		WebElement email = driver.findElement(By.id("username"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement loginBtn = driver.findElement(By.id("loginBtn"));

//		email.sendKeys("Sachinsharma263@gmail.com");
//		password.sendKeys("bholababa");
//		loginBtn.click();
		
		//2. name
		//driver.findElement(By.name("username")).sendKeys("Sachinsharma263@gmail.com");
		
		//3. classname
	//	driver.findElement(By.className("login-email")).sendKeys("achinsharma263@gmail.com");//form-control private-form__control login-email

		//4.xpath
		//driver.findElement(By.xpath("//*[@id=\"password\"]"));
		
		//5. css selector
	//	driver.findElement(By.cssSelector("#password"));
		
		//6. linktext
	//	driver.findElement(By.linkText("Sign up"));
		
		//7. partial linktext
	//	driver.findElement(By.partialLinkText("Sign"));
		
		//8. tagname
		driver.findElement(By.tagName("a")).click();
		
		}
}
