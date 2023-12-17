package com.qa.selenium4;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTestWithExtensions {

	@Test
	public void addExtensions() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addExtensions(new File("./extensions/AdBlock.crx"),
				new File("./extensions/SelectorsHub 4.7.8.0.crx"));
		WebDriver driver = new ChromeDriver(co);

		driver.get("https://amazon.in");

	}
	@Test
	public void stopAds() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addExtensions(new File("./extensions/AdBlock.crx"));
		WebDriver driver = new ChromeDriver(co);

		driver.get("https://app.hubspot.com/signup");

	}
}
