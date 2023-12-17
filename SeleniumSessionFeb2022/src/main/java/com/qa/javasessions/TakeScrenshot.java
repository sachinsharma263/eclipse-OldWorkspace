package com.qa.javasessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScrenshot {

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");

		/*
		 * File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 * String path = System.getProperty("user.dir") + "/screenshots/" +
		 * System.currentTimeMillis() + ".png"; try { FileUtils.copyFile(src, new
		 * File(path)); } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		new TakeScrenshot().getScreenshot(driver);
	}
	public void getScreenshot(WebDriver driver)
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"/screenshot/"+System.currentTimeMillis()+".png";
		
		try {
			FileUtils.copyFile(src, new File(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
