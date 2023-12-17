package com.qa.selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetRectMethodConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);

		driver.get("https://app.hubspot.com/login");

		WebElement loginBtn = driver.findElement(By.id("loginBtn"));

		Rectangle rect = loginBtn.getRect();

		System.out.println(rect.getHeight() + "\t" + rect.getWidth());
		System.out.println(rect.getX() + "\t" + rect.getY());
	}
}
