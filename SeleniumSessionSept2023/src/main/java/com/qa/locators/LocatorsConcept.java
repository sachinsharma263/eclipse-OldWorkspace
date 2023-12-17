package com.qa.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * so far we have seen or work with method or api with respect to driver
 * 
 */
public class LocatorsConcept {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		
		

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/signup");

		driver.findElement(By.linkText("Sign in")).click();

		Thread.sleep(3000);

		// 8 types of locators

		// 1. id

		// 1st approach :creating webelement and performing action in same line
		/*
		 * driver.findElement(By.id("username")).sendKeys("test@gmail.com");
		 * driver.findElement(By.id("password")).sendKeys("test123");
		 * driver.findElement(By.id("loginBtn")).click();
		 */
		

		// 2nd approach: creating web element and assigning to webelement variable
		// Perform action on webelement in another line
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
		

		username.sendKeys("test@gmail.com");
		password.sendKeys("test123");
		loginBtn.click();

		// 2.name
		driver.findElement(By.name("username"));

		// 3.classname
			driver.findElement(By.className("login-email"));

		// 4.xpath: address of web element inside the DOM, but its not a property
		driver.findElement(By.xpath("//*[@id=\"username\"]"));// *[@id="password"]

		// 5.cssselectors:its a locator but not an element property
		driver.findElement(By.cssSelector("#username"));

		// 6. linkText:only for links
		// html tag should be <a>
		//you have to use text of the link
		driver.findElement(By.linkText("Sign up")).click();

		// 7.partial link text: only for links but you can pass partial text of the
		// link
		driver.findElement(By.partialLinkText("Sign")).click();

		// 8.tagname
		driver.findElement(By.tagName("a"));
		
		

	}

}  
