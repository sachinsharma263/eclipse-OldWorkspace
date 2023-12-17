package com.qa.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptAlert2 {

	public static void main(String[] args) throws InterruptedException {

		 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver =new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//button[@onClick='jsAlert()']")).click();

		Alert alert = driver.switchTo().alert();

		//alert.sendKeys("selenium");

		Thread.sleep(3000);

		alert.accept();
		
		if(driver.getPageSource().contains("You successfully clicked an alert"))
			System.out.println("correct message");
		Thread.sleep(3000);
		
		//button[@onclick='jsPrompt()']
		driver.findElement(By.xpath("//button[@onClick='jsPrompt()']")).click();
		Alert alert2 = driver.switchTo().alert();
		
		alert2.sendKeys("selenium");
		
	//	alert.accept();
		
		if (driver.getPageSource().contains("selenium")) {
			System.out.println("selenium present");
		}


	}

}
