package com.qa.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/*
 * cross browser test by using switch
 */
public class CrossBrowserTest2 {

	public static void main(String[] args) {

		String browserName = "edge";

		WebDriver driver = null;

		switch (browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		case "safari":
			driver = new SafariDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", "D:/msedgedriver.exe");
			driver = new EdgeDriver();
			break;

		default:
			System.out.println(browserName + " not found");
			break;
		}
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
