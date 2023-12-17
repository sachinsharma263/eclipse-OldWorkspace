package com.qa.selenium4;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchingWindows2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.google.com/");
		
		String parentWindow=driver.getWindowHandle();
		
		System.out.println(parentWindow);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		System.out.println(driver.getWindowHandle());
		
		

		
	}

}
