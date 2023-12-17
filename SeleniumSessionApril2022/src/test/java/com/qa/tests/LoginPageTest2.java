package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.utils.AppConstants;
import com.qa.utils.ElementUtil;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class LoginPageTest2 {

	WebDriver driver;
	ElementUtil util;

	By emailId = By.id("_username");
	By password = By.id("_password");
	By loginBtn = By.xpath("//input[@type='submit']");

	By signUpNowLink = By.linkText("Sign Up Now");
	By homePageHeader = By.xpath("//span[text()='Homepage']");

	@BeforeTest
	@Parameters({ "browser", "url" })
	public void setUp(String browserName, String appUrl) {

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("fierfox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("safari")) {
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new SafariDriver();
		} else {
			System.out.println(browserName + " not found");
			try {
				throw new Exception("NoSuchBrowserException");

			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		driver.get(appUrl);
		driver.manage().window().maximize();
		util = new ElementUtil(driver);
	}

	@Test(priority = 1, enabled = true)
	public void verifySignUpNowLinkTest() {
		Assert.assertTrue(util.isDisplayed(signUpNowLink));
	}

	@Test(priority = 2, enabled = true)
	public void verifyLoginPageTitleTest() {
		String title = util.doGetTitle();
		assertEquals(title, AppConstants.LOGIN_PAGE_TITLE);
	}

	@Test(priority = 3)
	@Parameters({ "username", "password" })
	public void loginTest(String email, String pwd) {
		/*
		 * driver.findElement(emailId).sendKeys(email);
		 * driver.findElement(password).sendKeys(pwd);
		 * driver.findElement(loginBtn).click();
		 */
		util.doSendKeys(emailId, email);
		util.doSendKeys(password, pwd);
		util.doClick(loginBtn);

		Assert.assertEquals(util.doGetText(homePageHeader), AppConstants.HOME_PAGE_HEADER);

	}

	@AfterTest
	public void afterMethod() {
		util.doQuit();
	}

}
