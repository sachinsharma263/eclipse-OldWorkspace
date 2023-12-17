package com.qa.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// WebDriver driver=new SafariDriver();

		driver.get("http://www.google.com");

		String title = driver.getTitle();

		System.out.println("title is: " + title);

		if (title.equals("Google")) {
			System.out.println("correct title");
		} else {
			System.out.println("incorrect title");
		}
		driver.quit();
	}

}
