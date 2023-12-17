package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.utils.AppConstants;
import com.qa.utils.ElementUtil;

public class LoginPageTest {

	WebDriver driver;
	ElementUtil util;

	By emailId = By.id("_username");
	By password = By.id("_password");
	By loginBtn = By.xpath("//input[@type='submit']");

	By signUpNowLink = By.linkText("Sign Up Now");

	By homePageHeader = By.xpath("//span[text()='Homepage']");

	@BeforeMethod
	@Parameters({ "browser", "url" })
	public void setUp(String browserName, String appUrl) {

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println(browserName + " not found");
			try {
				throw new Exception("NoSuchBrowserFound");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();

			}
		}

		driver.get(appUrl);
		driver.manage().window().maximize();

		util = new ElementUtil(driver);

	}

	@Test(priority = 1, enabled = true)
	public void verifyLoginPageTitleTest() {
		String title = util.doGetTitle();
		Assert.assertEquals(title, AppConstants.LOGIN_PAGE_TITLE);
	}

	@Test(priority = 2, enabled = true)
	public void verifySignUpLinkTest() {
		Assert.assertTrue(util.doIsDisplayed(signUpNowLink));
	}

	@Test(priority = 3, enabled = true)
	@Parameters({ "email", "password" })
	public void loginTest(String email, String pass) {
		util.doSendKeys(emailId, email);
		util.doSendKeys(password, pass);
		util.doClick(loginBtn);

		String homePageHedareText = util.doGetText(homePageHeader);

		Assert.assertEquals(homePageHedareText, AppConstants.HOME_PAGE_HEADER);

	}

	@AfterMethod
	public void tearDown() {
		util.doQuit();
	}
}
