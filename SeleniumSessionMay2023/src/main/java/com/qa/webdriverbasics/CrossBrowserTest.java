package com.qa.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTest {

	public static void main(String[] args) {

		WebDriver driver = null;
		String browserName = "chrome";

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("safari")) {
			driver = new SafariDriver();
		} else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "D:/msedgedriver.exe");
			driver = new EdgeDriver();
		} else {
			System.out.println(browserName + " not found");
		}
		driver.get("http://www.google.com");
		System.out.println("title is: " + driver.getTitle());
	}

}
