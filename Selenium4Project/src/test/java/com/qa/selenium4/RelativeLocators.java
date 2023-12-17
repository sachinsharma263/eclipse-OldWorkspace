package com.qa.selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * RelativeLocator is introduced in selenium 4.0.0, some elements on web page which dont have specificpropert and its very hard to create xpath 
 * and css selector in that case we can see what is nearest element and then based on that we can find/identify particular element 
 * findElement accepts a new method with(By) which return a relative locator
 * 
 * 
 */
public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);

		driver.get("https://opensource-demo.orangehrmlive.com/");

		Thread.sleep(3000);

		WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));

		WebElement password = driver.findElement(RelativeLocator.with(By.tagName("input")).above(loginBtn));

		password.sendKeys("test");

		driver.navigate().to("https://classic.freecrm.com/");

		Thread.sleep(3000);

		WebElement contact = driver.findElement(By.linkText("Contact"));

		WebElement customers = driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(contact));

		customers.click();
	}
}
