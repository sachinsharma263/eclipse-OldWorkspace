package com.qa.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxlaunch {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.google.com");

		System.out.println(driver.getTitle());

		driver.close();
	}

}
