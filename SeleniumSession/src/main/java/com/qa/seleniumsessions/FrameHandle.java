package com.qa.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.londonfreelance.org/courses/frames/");

		// driver.findElement(By.xpath("/html/body/h2")).getText();

		// driver.switchTo().frame(2);
		// driver.switchTo().frame("main");

		System.out.println(driver.findElements(By.tagName("frame")).size());
		System.out.println(driver.findElement(By.tagName("frame")));

		WebElement frameElement = driver.findElement(By.name("main"));

		driver.switchTo().frame(frameElement);

		String text = driver.findElement(By.xpath("/html/body/h2")).getText();

		System.out.println(text);

		// System.out.println(driver.findElement(By.tagName("frame")));
		// WebElement element=driver.findElement(By.tagName("frame"));

		System.out.println(driver.findElements(By.tagName("frame")).size());

		driver.switchTo().defaultContent();

	}
}
