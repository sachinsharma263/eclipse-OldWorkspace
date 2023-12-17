package com.qa.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {

		/*
		 * WebDriverManager.chromedriver().setup();
		 * 
		 * WebDriver driver = new ChromeDriver();
		 */
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriverManager.getInstance(SafariDriver.class).setup();
		
		//WebDriver driver =new FirefoxDriver();
		
		WebDriver driver=new SafariDriver();

		driver.get("http://www.google.com");
	}
}
