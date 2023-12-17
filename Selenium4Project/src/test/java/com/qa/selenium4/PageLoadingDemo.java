package com.qa.selenium4;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoadingDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		// co.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		// co.setPageLoadStrategy(PageLoadStrategy.EAGER);
		co.setPageLoadStrategy(PageLoadStrategy.NONE);

		WebDriver driver = new ChromeDriver(co);

		driver.get("http://google.com");

		driver.quit();
	}

}
