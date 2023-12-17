package com.qa.TestNGSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.constants.AppConstant;
import com.qa.excel.ExcelUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderConcept {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://trcrm.com/login/en");
		driver.manage().window().maximize();
	}

	
	@DataProvider()
	public Object[][] getData()
	{
		Object data[][]=ExcelUtil.getData(AppConstant.TESTDATA_SHEET_NAME_Login);
		return data;
	}
	@Test(priority = 4,dataProvider = "getData")
	public void loginTest(String emailID,String password) {

		
		driver.findElement(By.id("_username")).sendKeys(emailID);
		driver.findElement(By.id("_password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Homepage']")).getText(), "Homepage");
	}
	
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
