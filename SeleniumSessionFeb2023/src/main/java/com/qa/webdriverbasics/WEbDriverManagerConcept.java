package com.qa.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WEbDriverManagerConcept {

	public static void main(String[] args) {

		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://google.com");

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

		WebDriverManager.getInstance(SafariDriver.class).setup();
		driver = new SafariDriver();

	}

}
