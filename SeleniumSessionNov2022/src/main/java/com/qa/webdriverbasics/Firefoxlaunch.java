package com.qa.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Firefoxlaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		//WebDriver d=new SafariDriver();
				
		driver.get("http://google.com");
		
		

	}

}
