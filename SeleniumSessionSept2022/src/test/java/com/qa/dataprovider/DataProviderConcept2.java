package com.qa.dataprovider;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.util.AppConstants;
import com.qa.util.ElementUtil;
import com.qa.util.ExcelUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderConcept2 {

	WebDriver driver;
	ElementUtil util;

	By emailId = By.id("_username");
	By password = By.id("_password");
	By loginBtn = By.xpath("//input[@type='submit']");

	By homePageHeader = By.xpath("//span[text()='Homepage']");

	@BeforeMethod
	public void setUp() {
		
		String browserName="chrome";
		
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case "safari":
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver=new SafariDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;

		default:
			System.out.println(browserName+" not found");
			try{
				throw new Exception("NoSuchBrowserFound");
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
			break;
		}
		
		driver.get("https://trcrm.com/login/en");
		driver.manage().window().maximize();

		util = new ElementUtil(driver);

	}

	@DataProvider
	public Object[][] getTestData() {
		Object[][] data = null;
		try {
			data = ExcelUtil.getData();
		} catch (InvalidFormatException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return data;
	}

	@Test(dataProvider = "getTestData")
	public void loginTest(String username, String pwd) {

		util.doSendKeys(emailId, username);
		util.doSendKeys(password, pwd);
		util.doClick(loginBtn);

		String homePageHeadetText = util.doGetText(homePageHeader);

		Assert.assertEquals(homePageHeadetText, AppConstants.HOMEPAGE_HEADER);
	}

	@AfterMethod
	public void tearDown() {
		util.doQuit();
	}
}
