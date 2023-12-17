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

		WebElement frame = driver.findElement(By.name("main"));

		driver.switchTo().frame(frame);

		String text = driver.findElement(By.xpath("/html/body/h2")).getText();

		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		WebElement title=driver.findElement(By.xpath("//title[text()='Sample frames page']"));
		
		System.out.println(title.getText());

		
		
		List<WebElement> list=driver.findElements(By.tagName("frame"));
		
		System.out.println(list.size());
	}
}
