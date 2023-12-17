package com.qa.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		// we have to use chromedriver.exe or binary file in our code so we have to set
		// through system property
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch browser-google chrome

		driver.get("http://www.google.com");// enter the url-prototype method/abstarct method inside webdriver
											// interface but implementation inside chromedriver class- overriden method

		String title = driver.getTitle();

		System.out.println("page title is: " + title);

		// verification point:checkpoint
		if (title.equals("Google")) {
			System.out.println("title is correct");
		} else {
			System.out.println("title is incorrect");
		}

		// till line 20 this is called automation where we have automation step against
		// every manual test step--not automation testing but
		// when we include verification point or checkpoint with automation then it is
		// called automation testing
		// Automation + verification=Automation Testing
		//verification point is very important,without this testing is incomplete.we can use if else,assertions for verification	
		//whatever we are doing we need to verify thats it!!					

		// ultimately at the end of the day we are tester or qa guy
		
				System.out.println(driver.getCurrentUrl());
				
				driver.quit();//close the browser
	}

}
