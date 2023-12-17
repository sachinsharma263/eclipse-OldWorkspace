package com.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {

	static WebDriver driver;
	public TakeScreenshot(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public static void takeScreenshot() {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"/screenshots/"+System.currentTimeMillis()+".png";
		try {
			FileUtils.copyFile(src, new File(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
