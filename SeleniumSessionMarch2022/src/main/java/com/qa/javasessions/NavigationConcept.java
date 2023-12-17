package com.qa.javasessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * simulate browser back and forward button using selenium
 */
public class NavigationConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");

		System.out.println(driver.getTitle());

		driver.navigate().to("http://www.amazon.com");

		System.out.println(driver.getTitle());

		driver.navigate().back();

		driver.navigate().forward();

		driver.navigate().back();

		Thread.sleep(5000);

		driver.navigate().refresh();

	}

}
