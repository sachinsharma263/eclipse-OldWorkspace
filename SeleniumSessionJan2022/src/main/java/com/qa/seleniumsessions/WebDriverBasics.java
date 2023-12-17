package com.qa.seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		// WebDriver driver=new ChromeDriver();//launch web browser
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");// launch url

		String title = driver.getTitle();// get the title
		System.out.println("title is " + title);

		// verification:checkpoint
		// Automation+verification=Automation Testing

		if (title.equals("Google")) {
			System.out.println("correct title");
		} else {
			System.out.println("incorrect title");

		}

		System.out.println(driver.getCurrentUrl());

		// System.out.println(driver.getPageSource());

		driver.quit();// close the browser
	}
}
