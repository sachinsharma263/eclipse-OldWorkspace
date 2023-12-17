package com.qa.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://google.com");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().to("http://amazon.in");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
	}
}
