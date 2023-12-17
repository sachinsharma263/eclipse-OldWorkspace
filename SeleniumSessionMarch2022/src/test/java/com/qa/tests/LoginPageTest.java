package com.qa.tests;

import org.apache.log4j.Logger;
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

import com.qa.util.AppConstants;
import com.qa.util.ElementUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {

	WebDriver driver;
	ElementUtil util;

	By username = By.id("_username");
	By password = By.id("_password");
	By loginBtn = By.cssSelector("input[type='submit'][value='Login']");
	By signUpNow = By.linkText("Sign Up Now");

	By homePageHeader = By.xpath("//span[text()='Homepage']");

	@BeforeTest
	@Parameters({ "browser", "url" })
	public void setUp(String browserName, String url) {

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equals("safari")) {
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new SafariDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			System.out.println(browserName + " not found");
			try {
				throw new Exception("NoSuchBrowserFound");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		driver.get(url);
		driver.manage().window().maximize();

		util = new ElementUtil(driver);

	}

	@Test(priority = 1)
	public void verifySignUpNowLinkTest() {
		// Assert.assertTrue(driver.findElement(signUpNow).isDisplayed());
		Assert.assertTrue(util.isDisplayed(driver, signUpNow));
	}

	@Test(priority = 2)
	public void verifyLoginPageTitleTest() {
		Assert.assertEquals(util.doGetTitle(driver), AppConstants.LOGIN_PAGE_TITLE);
	}

	@Test(priority = 3)
	@Parameters({ "username", "password" })
	public void loginPageTest(String email, String pwd) {
		util.doSendKeys2(username, email);
		util.doSendKeys2(password, pwd);
		util.doClick(driver, loginBtn);

		Assert.assertEquals(util.doGetText(driver, homePageHeader), AppConstants.HOME_PAGE_HEADER);
	}

	@AfterTest
	public void tearDown() {
		util.quit();
	}
}
