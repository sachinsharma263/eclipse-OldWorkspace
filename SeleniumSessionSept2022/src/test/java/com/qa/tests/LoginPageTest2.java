package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.javascriptutil.JavaScriptUtil;
import com.qa.util.AppConstants;
import com.qa.util.ElementUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest2 {

	WebDriver driver;
	ElementUtil util;
	JavaScriptUtil jsUtil;

	By emailId = By.id("_username");
	By pwd = By.id("_password");
	By loginBtn = By.xpath("//input[@type='submit']");

	By signUpNowLink = By.linkText("Sign Up Now");
	By homePageHeader = By.xpath("//span[text()='Homepage']");

	@BeforeTest
	@Parameters({ "url", "browser" })
	public void setUp(String appUrl, String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			System.out.println(browsername + " not found ");
			try {
				throw new Exception("NOSUCHBROWSERFOUND");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		driver.get(appUrl);
		driver.manage().window().maximize();

		util = new ElementUtil(driver);
		jsUtil = new JavaScriptUtil(driver);
	}

	@Test(priority = 1)
	public void verifyLoginPageTitleTest() {
		String title = util.doGetTitle();
		Assert.assertEquals(title, AppConstants.LOGIN_PAGE_TITLE);
	}

	@Test(priority = 2)
	public void verifySignUpLinkTest() {
		Assert.assertTrue(util.isDisplayed(signUpNowLink));
	}

	@Test(priority = 3)
	@Parameters({ "username", "password" })
	public void loginTest(String username, String password) {
		util.doSendKeys(emailId, username);
		util.doSendKeys(pwd, password);
		util.doClick(loginBtn);

		
		Assert.assertEquals(util.doGetText(homePageHeader), AppConstants.HOMEPAGE_HEADER);
		
	}

	@AfterTest
	public void tearDown() {
		util.doQuit();
	}
}
