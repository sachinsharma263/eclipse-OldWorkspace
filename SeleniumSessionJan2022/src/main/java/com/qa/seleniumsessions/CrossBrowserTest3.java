package com.qa.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTest3 {
	/**
	 * Cross Browser Test through Switch
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String browsername = "edge";
		WebDriver driver = null;	

		switch (browsername) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
			driver = new ChromeDriver();	
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		case "edge":
			System.setProperty("webdriver.edge.driver", "D:/msedgedriver.exe");
			driver = new EdgeDriver();
			break;

		default:
			System.out.println(browsername + " browser not found");
			break;
		}
		
		driver.get("http://www.google.com");
	}

}
