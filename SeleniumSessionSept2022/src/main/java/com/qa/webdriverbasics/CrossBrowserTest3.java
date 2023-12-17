package com.qa.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * cross browser test by using switch through command line argument
 */
public class CrossBrowserTest3 {

	public static void main(String[] args) {

		String browsername = args[0];
		WebDriver driver = null;

		switch (browsername) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", "D:/msedgedriver.exe");
			break;

		default:
			System.out.println(browsername + " not found");
			break;
		}

		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());

	}

}
