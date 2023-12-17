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

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderConcept2 {

	WebDriver driver;

	By username = By.id("_username");
	By password = By.id("_password");
	By loginBtn = By.xpath("//input[@type='submit']");

	By homePage = By.xpath("//span[text()='Homepage']");

	ElementUtil util;
	JavaScriptUtil jsUtil;

	@BeforeMethod
	public void setUp() {

		String browserName = "chrome";

		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "safari":
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new SafariDriver();
			break;

		default:
			System.out.println(browserName + " not found");
			try {
				throw new Exception("NoSuchBrowserFound");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
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
	public void loginTest(String email, String pwd) {
		util.doSendkeys(username, email);
		util.doSendkeys(password, pwd);
		util.doClick(loginBtn);

		util.waitForPresenceOfElementcated(homePage);

		Assert.assertEquals(AppConstants.HOME_PAGE_HEADER, "Homepage");
	}

	@AfterMethod
	public void tearDown() {
		util.doQuit();
	}
}
