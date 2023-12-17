package com.qa.dataprovider;

import org.testng.annotations.Test;

import com.qa.excel.ExcelUtil;
import com.qa.utils.AppConstants;
import com.qa.utils.ElementUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DataProviderConcept2 {

	WebDriver driver;
	ElementUtil util;

	By username = By.id("_username");
	By passwod = By.id("_password");
	By loginBtn = By.xpath("//input[@type='submit']");

	By homePageHeader = By.xpath("//span[text()='Homepage']");

	@BeforeMethod
	public void setUp() {
		String browsername = "chrome";

		switch (browsername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "safari":
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new SafariDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			System.out.println(browsername + " not found");
			try {
				throw new Exception("NoSuchBrowserFound");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		}

		driver.get("https://trcrm.com/login/en");
		driver.manage().window().maximize();

		util = new ElementUtil(driver);

	}

	@DataProvider
	public Object[][] getTestData() {
		Object[][] data = ExcelUtil.getData();
		return data;
	}

	@Test(dataProvider = "getTestData")
	public void loginTest(String emailId, String pwd) {
		util.doSendKeys(username, emailId);
		util.doSendKeys(passwod, pwd);
		util.doClick(loginBtn);

		String homePageHeadetText = util.doGetText(homePageHeader);
		Assert.assertEquals(homePageHeadetText, AppConstants.HOMEPAGE_HEADER);
	}

	@AfterMethod
	public void tearDown() {
		util.doQuit();
	}

}
