package com.qa.javasessions;

/*
 * simulate Browser back and forward button
 * back and forward simulation is happening
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");

		System.out.println(driver.getTitle());

		driver.navigate().to("http://amazon.com");

		System.out.println(driver.getTitle());

		driver.navigate().back();

		driver.navigate().forward();

		//driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
	}

}
