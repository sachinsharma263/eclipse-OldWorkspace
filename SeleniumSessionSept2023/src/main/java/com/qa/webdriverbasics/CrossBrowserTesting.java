package com.qa.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTesting {

	public static void main(String[] args) {

		WebDriver driver = null;
		String browserName = "chrome";

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
			ChromeOptions co=new ChromeOptions();
			co.setBinary("D:\\chrome-win64\\chrome-win64\\chrome.exe");
			driver = new ChromeDriver(co);
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println(browserName + "not found");
		}
		driver.get("http://www.google.com");
	}

}
