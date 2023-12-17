package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.utils.AppConstants;
import com.qa.utils.ElementUtil;
import com.qa.utils.JavaScriptUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpTest {

	WebDriver driver;
	ElementUtil util;
	JavaScriptUtil jsUtil;

	By signUpLink = By.linkText("Sign Up Now");
	By signUpNow = By.xpath("//h3[text()='Sign Up Now!']");

	@BeforeTest
	@Parameters({ "url", "browser" })
	public void setUp(String appUrl, String browserName) {
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

		driver.get(appUrl);
		driver.manage().window().maximize();
		driver.findElement(signUpLink).click();

		util = new ElementUtil(driver);
		jsUtil = new JavaScriptUtil(driver);
	}

	@Test(priority = 1)
	public void verifySignUpNowPageTitleTest() {
		Assert.assertEquals(util.doGetTitle(), AppConstants.SIGN_UP_NOW_PAGE_TITLE);
	}

	@Test(priority = 2)
	public void verifySignUpNowTest() {
		Assert.assertEquals(util.doGetText(signUpNow), AppConstants.SIGN_UP_NOW);
	}

	@AfterTest
	public void tearDown() {
		util.doQuit();
	}

}
