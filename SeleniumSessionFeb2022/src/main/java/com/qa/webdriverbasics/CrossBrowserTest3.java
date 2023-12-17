package com.qa.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * we are passing browser name through command line argument
 */
public class CrossBrowserTest3 {

	public static void main(String[] args) {

		WebDriver driver = null;
		String browserName = args[0];
		switch (browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
			driver = new FirefoxDriver();

		default:
			System.out.println(browserName + " not found");
			break;
		}
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
