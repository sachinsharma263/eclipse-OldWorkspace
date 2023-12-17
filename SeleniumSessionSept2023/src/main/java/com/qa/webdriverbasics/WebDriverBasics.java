package com.qa.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		//co.setBinary("D:\\chrome-win64\\chrome-win64\\chrome.exe");
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("http://www.google.com");
		
		
		String title=driver.getTitle();
		
		System.out.println("title is:"+ title);
		
		if (title.equals("Google")) {
			System.out.println("correct title");
		}
		else
		{
			System.out.println("incorrect title");
		}
		
		
	}

}
