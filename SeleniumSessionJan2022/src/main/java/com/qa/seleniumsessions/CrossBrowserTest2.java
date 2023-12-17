package com.qa.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * we are passing browser name through command line arguments
 * 
 * @author Dell
 *
 */
public class CrossBrowserTest2 {

	public static void main(String[] args) {

		String browserName = args[0];
		WebDriver driver = null;
		// String browserName = "chrome";
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("safari")) {

			driver = new SafariDriver();
		} else {

			System.out.println(browserName + " is not found");
		}
		driver.get("http://www.google.com");
	}

}
