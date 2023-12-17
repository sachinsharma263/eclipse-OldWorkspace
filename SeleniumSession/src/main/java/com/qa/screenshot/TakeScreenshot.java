package com.qa.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {
	
	

	public static void takeScreenshot(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File f = ts.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(f, new File("./Screenshot/screenshot.png"));
		} catch (IOException e) {
			System.out.println("Exception while taking screenshot");
			e.printStackTrace();
		}
	}
	
	public static void takeScreenshot(WebDriver driver,String name) {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File f=ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(f, new File("./Screenshot/" +name+".png"));
		} catch (IOException e) {
			System.out.println("Excepetion occured while creating screenshot");
			e.printStackTrace();
		}
	}
}
