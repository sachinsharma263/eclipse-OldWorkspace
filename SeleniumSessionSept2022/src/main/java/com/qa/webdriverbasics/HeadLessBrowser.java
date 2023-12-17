package com.qa.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		// driver=new ChromeDriver();

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		
		FirefoxOptions fo=new FirefoxOptions();
		fo.addArguments("--headless");
		
		

		//driver = new ChromeDriver(co);

		driver=new FirefoxDriver(fo);
		driver.get("http://www.google.com");

		System.out.println(driver.getTitle());
	}
}
