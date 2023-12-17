package com.qa.dataprovider;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.excel.ExcelUtil;
import com.qa.utils.AppConstants;
import com.qa.utils.ElementUtil;
import com.qa.utils.JavaScriptUtil;
import com.qa.utils.RetryAnalyzer;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DataProviderConcept2 {

	WebDriver driver;
	ElementUtil util;
	JavaScriptUtil jsUtil;

	By email = By.id("_username");
	By password = By.id("_password");
	By loginBtn = By.xpath("//input[@type='submit']");

	By homePageHeader = By.xpath("//span[text()='Homepage']");

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
				System.out.println(e.getMessage());
			}
			break;
		}

		driver.get("http://www.trcrm.com/login/en");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		util = new ElementUtil(driver);
		jsUtil = new JavaScriptUtil(driver);

	}

	@DataProvider
	public Object[][] getTestData() {
		Object data[][] = ExcelUtil.getData();

		return data;
	}

	@Test(enabled = true, dataProvider = "getTestData", retryAnalyzer = RetryAnalyzer.class, description = "This method test login functionality by passing different sets of input data")
	public void loginTest(String username, String pass) {
		util.doSendKeys(email, username);
		util.doSendKeys(password, pass);
		util.doClick(loginBtn);

		util.waitForPresenceOfElementedLocated(homePageHeader);
		Assert.assertEquals(util.doGetText(homePageHeader), AppConstants.HOME_PAGE_HEADER);
	}

	@AfterMethod
	public void tearDown() {
		util.doQuit();
	}
}
