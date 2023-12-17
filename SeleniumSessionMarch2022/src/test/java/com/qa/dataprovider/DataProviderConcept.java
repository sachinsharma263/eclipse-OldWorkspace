package com.qa.dataprovider;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import com.qa.util.AppConstants;
import com.qa.util.ElementUtil;
import com.qa.util.ExcelUtil;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class DataProviderConcept {

	WebDriver driver;
	ElementUtil util;

	By username = By.id("_username");
	By password = By.id("_password");
	By loginBtn = By.cssSelector("input[type='submit'][value='Login']");
	
	By homePageHeader = By.xpath("//span[text()='Homepage']");

	@Test(dataProvider = "dp")
	public void loginPageTest(String email, String pwd) {
		util.doSendKeys(driver, username, email);
		util.doSendKeys(driver, password, pwd);
		util.doClick(driver, loginBtn);
		
		Assert.assertEquals(util.doGetText(driver, homePageHeader), AppConstants.HOME_PAGE_HEADER);

	}

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://trcrm.com/login/en");
		driver.manage().window().maximize();

		util = new ElementUtil(driver);
	}

	@AfterMethod
	public void tearDown() {

		util.quit();
	}

	@DataProvider
	public Object[][] dp() {
		Object data[][] = null;
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
}
