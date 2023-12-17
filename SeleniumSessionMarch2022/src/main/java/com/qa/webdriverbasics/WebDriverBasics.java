package com.qa.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch the web browser

		//ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");// enter the url

		String title = driver.getTitle();

		System.out.println("title of the page is:" + title);

		// verification point:checkpoint

		if (title.equals("Google")) {
			System.out.println("title is correct");
		} else {
			System.out.println("title is incorrect");
		}
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
	}
}