package com.qa.dataprovider;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.util.ExcelUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderConcept {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://trcrm.com/login/en");
		driver.manage().window().maximize();
		
	}
	@DataProvider
	public Object[][] getTestData() {
		Object[][] data = null;
		try {
			data = ExcelUtil.getData();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

	@Test(dataProvider = "getTestData")
	public void loginTest(String username,String password) {
		
		driver.findElement(By.id("_username")).sendKeys(username);
		driver.findElement(By.id("_password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
