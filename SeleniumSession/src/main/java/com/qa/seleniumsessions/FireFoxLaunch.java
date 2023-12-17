package com.qa.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxLaunch {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();// launch firefox

		driver.get("http://www.google.com");// launch url

		String title = driver.getTitle();
		System.out.println("title of page is:" + title);

		// verification point :checkpoints
		if (title.equals("Google")) {
			System.out.println("correct title");
		} else {

			System.out.println("incorrect title");
		}

		System.out.println(driver.getCurrentUrl());

		// System.out.println(driver.getPageSource());

		driver.quit();

	}
}
