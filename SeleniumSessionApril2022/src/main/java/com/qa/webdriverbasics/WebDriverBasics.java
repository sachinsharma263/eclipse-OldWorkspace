package com.qa.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");// set the system property-configure
																				// executable or binary file
		WebDriver driver = new ChromeDriver();// launch the web browser- google chrome

		// ChromeDriver driver=new ChromeDriver();

		driver.get("http://www.google.com");// launch the url -prototype method inside webdriver but implementation
											// inside chromedriver. through top or up casting we can access the
											// overidden method i.e get()

		String title = driver.getTitle();// get the title
		System.out.println("title of web page is: " + title);

		// Automation Testing: Automation+verification
		// when we include automation with verification point is called automation
		// testing

		// verification point:checkpoint
		if (title.equals("Google")) {
			System.out.println("correct title");
		} else {
			System.out.println("incorrect title");
		}

		System.out.println(driver.getCurrentUrl());

		driver.quit();

	}

}
