package com.qa.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxLaunch {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.google.com");
		
		driver.quit();

	}

}
