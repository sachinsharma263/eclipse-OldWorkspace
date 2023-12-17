package com.qa.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * driver.quit()- org.openqa.selenium.NoSuchSessionException: Session ID is null.Using WebDriver after calling quit()?
 * driver.close()-org.openqa.selenium.NoSuchSessionException: invalid session id
 * 
 * quit()-method close all the web pages on browser.
 * close()-method close the current window where driver control is available.
 * @author Dell
 *
 */
public class CloseAndQuitConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		
		//driver.close();
		driver.quit();
		
		driver.getTitle();
		
		
	}
}
