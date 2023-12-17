package com.qa.selenium4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;

public class Googlelaunch {

	public static void main(String[] args) {

		

		ChromeOptions co = new ChromeOptions();
		String path = SeleniumManager.getInstance().getDriverPath(co);
		System.out.println(path);
		
		//co.setHeadless(true);
		co.addArguments("--headless=new");
		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com");

		System.out.println(driver.getTitle());
	}
}
