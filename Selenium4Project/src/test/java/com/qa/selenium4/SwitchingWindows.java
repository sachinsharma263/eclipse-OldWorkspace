package com.qa.selenium4;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchingWindows {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.google.com/");
		
		String parentWindow=driver.getWindowHandle();
		
		System.out.println("parentWIndow: "+parentWindow);

		driver.navigate().to("https://automationstepbystep.com/");
		
		String childWindow=driver.getWindowHandle();
		
		System.out.println("parentWIndow: "+parentWindow+"\n"+"childWindow: "+childWindow);
		
		//driver.get() window id created, when we navigate then window id will remain same as new window didnt open

		
	}

}
