	package com.qa.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");
		
		//WebDriver driver=new ChromeDriver(co);
		
		FirefoxOptions fo=new FirefoxOptions();
		fo.addArguments("--headless");
		
		WebDriver driver=new FirefoxDriver(fo);	
		
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
