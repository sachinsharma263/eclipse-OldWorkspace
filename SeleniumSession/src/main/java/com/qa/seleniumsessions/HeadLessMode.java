package com.qa.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessMode {

	public static void main(String[] args) {

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");

		//driver = new ChromeDriver(co);
		
		FirefoxOptions fo=new FirefoxOptions();
		fo.addArguments("--headless");
	
		driver=new FirefoxDriver(fo);
	}
}
