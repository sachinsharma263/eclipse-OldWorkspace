package com.qa.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");

		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");

		// WebDriver driver = new ChromeDriver(co);
		WebDriver driver = new FirefoxDriver(fo);

		driver.get("http://www.google.com");

		System.out.println("page title is: " + driver.getTitle());
	}
}
