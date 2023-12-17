package com.qa.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WEbDriverManagerConcept {

	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.getInstance(SafariDriver.class).setup();
		WebDriverManager.edgedriver().setup();
		
		//WebDriver driver=new ChromeDriver();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://google.com");
		
		System.out.println(driver.getTitle());
	}
}
