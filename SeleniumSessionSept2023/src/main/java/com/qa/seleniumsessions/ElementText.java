package com.qa.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementText {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");

		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("test@gmail.com");
		driver.findElement(By.id("loginBtn")).click();
		
		Thread.sleep(3000);
		
		String text=driver.findElement(By.className("private-alert__inner")).getText();
		
		System.out.println(text);
		
		String text2=driver.findElement(By.className("private-alert__body")).getText();
		
		System.out.println(text2);

	}

}
