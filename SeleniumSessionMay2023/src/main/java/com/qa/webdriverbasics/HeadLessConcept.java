package com.qa.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");

		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");

		//WebDriver driver = new FirefoxDriver(fo);
		
		WebDriver driver = new ChromeDriver(co);

		driver.get("http://google.com");

		System.out.println(driver.getTitle());

	}
}
