package com.qa.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * simulate Browser back and forward button
 * back and forward simulation is happening
 * 
 * @author Dell
 *
 */
public class NavigationConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");

		System.out.println(driver.getTitle());

		driver.navigate().to("http://www.amazon.com");

		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
	}
}
