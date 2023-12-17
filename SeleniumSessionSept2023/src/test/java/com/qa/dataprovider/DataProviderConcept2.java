package com.qa.dataprovider;

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

import com.qa.excel.ExcelUtil;
import com.qa.javascriptutil.JavaScriptUtil;
import com.qa.utils.AppConstants;
import com.qa.utils.ElementUtil;

public class DataProviderConcept2 {

	WebDriver driver;
	ElementUtil util;
	JavaScriptUtil jsUtil;

	By emailId = By.id("_username");
	By password = By.id("_password");
	By loginBtn = By.xpath("//input[@type='submit']");

	By homePage = By.xpath("//span[text()='Homepage']");

	@BeforeMethod
	public void setUp() {

		String browserName = "chrome";

		switch (browserName) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println(browserName + " not found");
			try {
				throw new Exception("NoSuchBrowserFoundException");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			break;
		}

		driver.get("https://trcrm.com/login/en");
		driver.manage().window().maximize();

		util = new ElementUtil(driver);
		jsUtil = new JavaScriptUtil(driver);
	}

	@DataProvider
	public Object[][] getTestData() {
		Object data[][] = ExcelUtil.getData();
		return data;
	}

	@Test(dataProvider = "getTestData")
	public void loginTest(String email, String pass) {
		util.doSendKeys(emailId, email);
		util.doSendKeys(password, pass);
		util.doClick(loginBtn);

		util.waitForPresenceOfElementLocated(homePage);

		Assert.assertEquals(util.doGetText(homePage), AppConstants.HOME_PAGE_HEADER);
	}

	@AfterMethod
	public void afterMethod() {
		util.doQuit();
	}

}
