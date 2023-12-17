package com.qa.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationConcept {
	public static void main(String[] args) {

		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.get("http://www.google.com");

		System.out.println("getTitle:"+driver.getTitle());

		driver.navigate().to("http://www.amazon.in");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().back();
	}
}
