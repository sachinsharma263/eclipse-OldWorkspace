package com.qa.framehandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * some web elements are directly present on web page which we can access easily but some elements are present inside frame.
 * frame is also part of DOM, also called web element.to interact elements present inside frame first we need to switch driver control to 
 * frame and then interact with web element
 * driver.switchTo().frame(frame)-overloaded method- index, id or name and web element
 */
public class FrameHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.londonfreelance.org/courses/frames/");

		// String text=driver.findElement(By.xpath("//h2[text()='Title bar
		// ']")).getText();

		WebElement frame = driver.findElement(By.name("main"));

		/*
		 * driver.switchTo().frame(0); driver.switchTo().frame("main");
		 */
		driver.switchTo().frame(frame);

		String text = driver.findElement(By.xpath("//h2[text()='Title bar ']")).getText();

		System.out.println(text);
	}

}
