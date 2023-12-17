package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.utils.AppConstants;
import com.qa.utils.ElementUtil;
import com.qa.utils.GenericMethods;
import com.qa.utils.JavaScriptUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LoginPageTest {

	WebDriver driver;
	ElementUtil util;
	JavaScriptUtil jsUtil;
	WebDriverWait wait;

	By email = By.id("_username");
	By password = By.id("_password");
	By loginBtn = By.xpath("//input[@type='submit']");

	By SignUpNow = By.linkText("Sign Up Now");
	By homePageHeader = By.xpath("//span[text()='Homepage']");

	@BeforeMethod
	@Parameters({ "browser", "url" })
	public void beforeTest(String browserName, String appUrl) {

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("safari")) {
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new SafariDriver();
		} else {
			System.out.println(browserName + " not found");
			try {
				throw new Exception("BrowserNotFound");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		driver.get(appUrl);
		driver.manage().window().maximize();

		util = new ElementUtil(driver);
		jsUtil = new JavaScriptUtil(driver);

	}

	@Test(priority = 1, enabled = true)
	public void verifyLoginPageTitleTest() {
		String title = util.doGetTitle();
		Assert.assertEquals(title, AppConstants.LOGIN_PAGE_TITLE);
	}

	@Test(priority = 2, enabled = true)
	public void verifySignUpNowLinkTest() {
		Assert.assertTrue(util.doIsDisplayed(SignUpNow));
	}

	@Test(priority = 3, enabled = true)
	@Parameters({ "username", "password" })
	public void loginTest(String username, String pass) {
		util.doSendKeys(email, username);
		util.doSendKeys(password, pass);
		util.doClick(loginBtn);

		Assert.assertEquals(util.doGetText(homePageHeader), AppConstants.HOME_PAGE_HEADER);

	}

	@AfterMethod
	public void afterClass() {
		util.doQuit();

	}
}
