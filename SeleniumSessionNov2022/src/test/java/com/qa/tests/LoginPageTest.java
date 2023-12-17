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

public class LoginPageTest {

	WebDriver driver;
	ElementUtil util;
	JavaScriptUtil jsUtil;

	By emailId = By.id("_username");
	By pwd = By.id("_password");
	By loginBtn = By.xpath("//input[@type='submit']");

	By signUpLink = By.xpath("//a[text()='Sign Up Now']");
	By homePageHeader = By.xpath("//span[text()='Homepage']");

	@BeforeTest
	@Parameters({ "url", "browser" })
	public void setUp(String appUrl, String browserNme) {
		if (browserNme.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserNme.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserNme.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserNme.equalsIgnoreCase("safari")) {
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new SafariDriver();
		} else {
			System.out.println(browserNme + " not found");
			try {
				throw new Exception("NoSuchBrowserFound");
			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}

		driver.get(appUrl);
		driver.manage().window().maximize();

		util = new ElementUtil(driver);
		jsUtil = new JavaScriptUtil(driver);

	}

	@Test(priority = 1, enabled = true, description = "This test verify login page title")
	public void verifyLoginPageTitleTest() {
		String title = util.doGetTitle();
		Assert.assertEquals(title, AppConstants.LOGIN_PAGE_TITLE);
	}

	@Test(priority = 2, enabled = true, description = "This test verify sign up link is display or not")
	public void verifySignUpLinkTest() {
		Assert.assertTrue(util.doIsDisplayed(signUpLink));
	}

	@Test(priority = 3, enabled = true, description = "This test verify login functionality")
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
