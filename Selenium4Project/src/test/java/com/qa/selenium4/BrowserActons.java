package com.qa.selenium4;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserActons {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.get("https://www.google.com/");

		driver.navigate().to("https://automationstepbystep.com/");

		System.out.println("title is:" + driver.getTitle() + "\n" + driver.getCurrentUrl());

		driver.navigate().back();

		driver.navigate().forward();

		Thread.sleep(3000);

		driver.navigate().refresh();

		driver.quit();
	}

}
