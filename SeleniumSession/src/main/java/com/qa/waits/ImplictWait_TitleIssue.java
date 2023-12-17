package com.qa.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplictWait_TitleIssue {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		driver.get("https://app.hubspot.com/signup");
		
		System.out.println(driver.getTitle());//title is not a webelement
		
		driver.findElement(By.linkText("Sign in")).click();
		
		System.out.println(driver.getTitle());
		
		
}
}