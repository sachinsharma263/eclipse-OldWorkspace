package com.qa.dataprovider;

import org.testng.annotations.Test;

import com.qa.utils.AppConstants;
import com.qa.utils.ElementUtil;
import com.qa.utils.ExcelUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.DataProvider;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DataProviderConcept {
	WebDriver driver;
	ElementUtil util;
	By email = By.id("_username");
	By password = By.id("_password");
	By loginBtn = By.xpath("//input[@type='submit']");
	By homePageHeader=By.xpath("//span[text()='Homepage']");

	@Test(dataProvider = "getTestData",enabled = true)
	public void loginPageTest(String emailId, String pwd) {
		util.doSendKeys(email, emailId);
		util.doSendKeys(password, pwd);
		util.doClick(loginBtn);
		
		Assert.assertEquals(util.doGetText(homePageHeader), AppConstants.HOME_PAGE_HEADER);
	}

	@DataProvider
	public Object[][] getTestData() {
		Object data[][] = null;
		try {
			data = ExcelUtil.getData();
		} catch (InvalidFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

	@AfterMethod
	public void afterClass() {
		util.doQuit();

	}

	@BeforeMethod
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://trcrm.com/login/en");
		driver.manage().window().maximize();

		util = new ElementUtil(driver);

	}

}
