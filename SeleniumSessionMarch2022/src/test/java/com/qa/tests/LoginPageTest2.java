package com.qa.tests;

import java.io.IOException;
import java.util.Properties;

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
import org.testng.annotations.Test;

import com.qa.util.AppConstants;
import com.qa.util.ConfigData;
import com.qa.util.ElementUtil;
import com.qa.util.TakeScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest2 {

	WebDriver driver;
	ElementUtil util;
	Properties prop;
	TakeScreenshot ts;
	
	//Logger log = Logger.getLogger(LoginPageTest.class);
	
	org.apache.logging.log4j.Logger log=org.apache.logging.log4j.LogManager.getLogger(LoginPageTest.class);
	

	By username = By.id("_username");
	By password = By.id("_password");
	By loginBtn = By.cssSelector("input[type='submit'][value='Login']");
	By signUpNow = By.linkText("Sign Up Now2");

	By homePageHeader = By.xpath("//span[text()='Homepage']");

	@BeforeTest
	public void setUp() {
		

		try {
			prop = ConfigData.getProperties();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String browserName = prop.getProperty("browserName");

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

		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();

		util = new ElementUtil(driver);
		ts=new TakeScreenshot(driver);

	}

	@Test(priority = 1)
	public void verifySignUpNowLinkTest() {
		log.debug("debug");
		for (int i = 0; i < 500; i++) {
			log.info("****************************** Starting test cases execution  *****************************************");
			log.warn("Starting test cases execution");
		}
		log.info("****************************** Starting test cases execution  *****************************************");
		log.info("****************************** verifySignUpNowLinkTest *****************************************");
		// Assert.assertTrue(driver.findElement(signUpNow).isDisplayed());
		Assert.assertTrue(util.isDisplayed(driver, signUpNow));
		log.info("****************************** ending test case *****************************************");
		log.info("****************************** verifySignUpNowLinkTest *****************************************");
	}

	@Test(priority = 2)
	public void verifyLoginPageTitleTest() {
		Assert.assertEquals(util.doGetTitle(driver), AppConstants.LOGIN_PAGE_TITLE);
	}

	@Test(priority = 3)
	public void loginPageTest() {
		util.doSendKeys2(username, prop.getProperty("username"));
		util.doSendKeys2(password, prop.getProperty("password"));
		util.doClick(driver, loginBtn);

		Assert.assertEquals(util.doGetText(driver, homePageHeader), AppConstants.HOME_PAGE_HEADER);
		
	}

	@AfterTest
	public void tearDown() {
		// util.quit();
	}
}
