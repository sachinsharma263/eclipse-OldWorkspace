package com.qa.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");

		String title = driver.getTitle();
		System.out.println("title is: " + title);

		if (title.equals("Google")) {
			System.out.println("title is correct");
		} else {
			System.out.println("title is incorrect");
		}
		System.out.println(driver.getCurrentUrl());

		driver.quit();

	}

}
