package com.qa.framehandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");

		// driver.switchTo().frame(2);
		// driver.switchTo().frame("main");
		WebElement frameElement = driver.findElement(By.name("main"));
		driver.switchTo().frame(frameElement);

		String text = driver.findElement(By.xpath("//h2[text()='Title bar ']")).getText();

		System.out.println(text);

		// System.out.println(driver.getTitle());

		driver.switchTo().defaultContent();

		System.out.println(driver.findElement(By.xpath("//title[text()='Sample frames page']")).getText());

		List<WebElement> frames = driver.findElements(By.tagName("frame"));

		System.out.println("total number of frames on web page: " + frames.size());

	}
}
