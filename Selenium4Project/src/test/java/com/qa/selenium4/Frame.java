package com.qa.selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		//driver.switchTo().frame("packageFrame");
		
		WebElement frame=driver.findElement(By.name("packageFrame"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//span[text()='Alert']")).click();
		
		driver.switchTo().defaultContent();
	}
}
