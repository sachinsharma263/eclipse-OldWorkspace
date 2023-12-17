package com.qa.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.util.AppConstants;
import com.qa.util.ExcelUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider {

	WebDriver driver;
	By username = By.id("_username");
	By password = By.id("_password");
	By loginBtn = By.xpath("//input[@type='submit']");

	By homePageHeader = By.xpath("//span[text()='Homepage']");

	@BeforeMethod
	@Parameters({ "browser", "url" })
	public void setUp(String browser, String appUrl) throws Exception {

		switch (browser) {
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

		default:
			System.out.println("Please pass the correct browser name");
			throw new Exception("NoSuchBrowserFound");
		}

		driver.get(appUrl);
		driver.manage().window().maximize();
	}

	@org.testng.annotations.DataProvider
	public Object[][] dp() {
		Object data[][] = ExcelUtils.getData(AppConstants.SHEET_NAME);

		return data;
	}

	@Test(dataProvider = "dp")
	public void loginTest(String email, String pwd) {
		driver.findElement(username).sendKeys(email);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginBtn).click();

		Assert.assertEquals(driver.findElement(homePageHeader).getText(), AppConstants.HOME_PAGE_HEADER);

	}

	@AfterMethod
	public void name() {
		driver.quit();
	}
}
