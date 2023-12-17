package com.qa.framehandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandle {

	public static void main(String ar[]) {
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");

		List<WebElement> frameList = driver.findElements(By.tagName("frame"));

		System.out.println("total number of frames on web page: " + frameList.size());

		// driver.switchTo().frame(2);
		// driver.switchTo().frame("main");

		WebElement frameElement = driver.findElement(By.name("main"));
		driver.switchTo().frame(frameElement);

		String text = driver.findElement(By.xpath("//h2[text()='Title bar ']")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
	}
}
