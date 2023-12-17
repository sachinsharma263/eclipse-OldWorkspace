package com.qa.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplictWaitConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

		driver.get("https://app.hubspot.com/signup");

		driver.findElement(By.linkText("Sign in")).click();//e1
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);//nullify implict wait

		driver.findElement(By.id("username")).sendKeys("test@gmail.com");//e2
		
		driver.findElement(By.id("password")).sendKeys("test@123");//e3
		
		driver.findElement(By.id("loginBtn")).click();//e4
		
		

	}

}
