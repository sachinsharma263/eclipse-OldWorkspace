package com.qa.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		
		//chromedriver
		WebDriverManager.chromedriver().setup();
		
		//WebDriver driver=new ChromeDriver();
		
		//driver.get("http://www.google.com");
		
		//firefoxdriver
		WebDriverManager.firefoxdriver().setup();
		//WebDriver driver=new FirefoxDriver();
		
		//driver.get("http://www.google.com");
		
		//System.out.println(driver.getTitle());
		
		//safaridriver
		WebDriverManager.getInstance(SafariDriver.class).setup();
		
		WebDriver driver=new SafariDriver();
	}
}
