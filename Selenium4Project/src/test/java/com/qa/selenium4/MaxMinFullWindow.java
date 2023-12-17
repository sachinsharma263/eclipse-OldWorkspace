package com.qa.selenium4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MaxMinFullWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		
	
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.manage().window().minimize();
		Thread.sleep(1000);
		
		driver.manage().window().fullscreen();
		
		Thread.sleep(1000);
		
		driver.quit();
		
	
	}
	
}
