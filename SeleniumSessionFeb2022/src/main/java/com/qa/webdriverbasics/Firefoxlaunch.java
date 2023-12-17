package com.qa.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Firefoxlaunch {

	public static void main(String[] args) {

		WebDriver driver = null;
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
		driver = new FirefoxDriver();

		// driver = new SafariDriver();

		driver.get("http://www.google.com");

		System.out.println(driver.getTitle());

		driver.quit();
	}

}
