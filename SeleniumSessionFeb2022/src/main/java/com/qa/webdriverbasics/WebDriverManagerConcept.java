package com.qa.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {

		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.getInstance(SafariDriver.class).setup();

		// driver = new ChromeDriver();

		driver = new FirefoxDriver();

		driver.get("http://www.google.com");

		System.out.println(driver.getTitle());
	}
}
