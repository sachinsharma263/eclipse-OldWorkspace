package com.qa.seleniumsessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		takescreenshot(driver);
	}
	
	public static void takescreenshot(WebDriver driver) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File f=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f, new File("./Screenshot/screenshot.png"));
		
		System.out.println("screenshot captured");
	}

}
