package com.qa.selenium4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeElementScreenshot2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);

		//driver.get("https://app.hubspot.com/login");
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		//WebElement formElement=driver.findElement(By.id("hs-login"));
		
		WebElement tableElement=driver.findElement(By.id("customers"));
	
		
		//File src=formElement.getScreenshotAs(OutputType.FILE);
				File src=tableElement.getScreenshotAs(OutputType.FILE);
		
		try {
			//FileUtils.copyFile(src, new File("./target/register.png"));
			FileUtils.copyFile(src, new File("./target/table.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
