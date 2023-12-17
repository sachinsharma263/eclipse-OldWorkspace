package com.qa.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitAndCloseConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		
	//	driver.quit();//org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
	
		driver.close();// org.openqa.selenium.NoSuchSessionException: invalid session id
		
		System.out.println(driver.getTitle());
	}
}
