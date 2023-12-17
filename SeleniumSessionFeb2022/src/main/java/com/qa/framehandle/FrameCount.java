package com.qa.framehandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameCount {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.londonfreelance.org/courses/frames/");

		List<WebElement> frameList = driver.findElements(By.tagName("frame"));

		System.out.println("total number of frames: " + frameList.size());

		driver.switchTo().defaultContent();
	}

}
