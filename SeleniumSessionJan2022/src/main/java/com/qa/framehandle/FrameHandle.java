package com.qa.framehandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/");
	
		//driver.findElement(By.xpath("//h2[text()='Title bar ']")).getText();
		
		//driver.switchTo().frame(2);
		//driver.switchTo().frame("main");
		
		WebElement frame=driver.findElement(By.name("main"));
		
		driver.switchTo().frame(frame);
		
	
		
		String text=driver.findElement(By.xpath("//h2[text()='Title bar ']")).getText();
		
		System.out.println(text);
		
	}
}
