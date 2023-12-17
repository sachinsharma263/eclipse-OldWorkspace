package com.qa.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * simulate browser back and forward button using selenium
 */
public class NavigationConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("http://www.amazon.in");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
	}

}
