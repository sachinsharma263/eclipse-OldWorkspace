package com.qa.framehandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import org.openqa.selenium.WebElement;

public class FrameCount {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");

		List<WebElement> frameList=driver.findElements(By.tagName("frame"));
		
		System.out.println("total number of frames on the web page is: "+frameList.size());
	
	
	}

}
