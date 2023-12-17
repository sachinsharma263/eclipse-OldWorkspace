package com.qa.waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoadTimeOutDemo {

	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);

//		Timeouts time = driver.manage().timeouts();
//		time.pageLoadTimeout(Duration.ofSeconds(15));
		
		//driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(10));

		driver.get("https://learn-automation.com/launch-chrome-browser-using-selenium-webdriver/");

		System.out.println(driver.getTitle());

	}

}
