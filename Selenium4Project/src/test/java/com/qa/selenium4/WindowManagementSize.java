package com.qa.selenium4;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowManagementSize {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);

		int width = driver.manage().window().getSize().getWidth();
		int height = driver.manage().window().getSize().getHeight();

		System.out.println(width + "\n" + height);

		Thread.sleep(3000);

		driver.manage().window().setSize(new Dimension(200, 300));

	}

}
