package com.qa.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Explict wait applied in the form of webdriverwait
 * Explict wait not only aplied for web elements but can also applied for non web elements like url and title
 */
public class ExplictWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		//WebDriverWait wait = new WebDriverWait(driver, 0);

		driver.get("http://app.hubspot.com/signup");

		driver.findElement(By.linkText("Sign in")).click();
		
		presenceOfElementLocated(driver, By.id("username"), 10);
		
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));

		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("test@gmail.com");
		
		
	}
	
	public static void presenceOfElementLocated(WebDriver driver,By locator,int time) {
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		
	}//internally explict wait is using by.id also
	//implict wait no timeout exception only no such element exception
	
	 
}
