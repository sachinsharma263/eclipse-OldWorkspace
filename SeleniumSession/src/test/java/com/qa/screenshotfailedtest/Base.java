package com.qa.screenshotfailedtest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.screenshot.TakeScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	static WebDriver driver;

	public static void initilization() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://trcrm.com/login/en");

	}

	public void takeScreenshot(String methodName) {
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			System.out.println("hy");
			FileUtils.copyFile(source, new File("./Screenshot/"+methodName+"_.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
