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

public class SignUpTest {

	WebDriver driver;
	ElementUtil util;

	By signUpNowLink = By.linkText("Sign Up Now");
	By signUpNow = By.xpath("//h3[text()='Sign Up Now!']");

	@BeforeTest
	@Parameters({ "browser", "url" })
	public void setUp(String browserName, String appUrl) {
		switch (browserName) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println(browserName + " not found");
			try {
				throw new Exception("NoSuchBrowserFound");

			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			break;
		}

		driver.get(appUrl);
		driver.manage().window().maximize();

		util = new ElementUtil(driver);

		util.doClick(signUpNowLink);
	}

	@Test(priority = 1, enabled = true)
	public void verifySignUpPageTitleTest() {
		String title = util.doGetTitle();
		Assert.assertEquals(title, AppConstants.SIGN_UP_PAGE_TITLE);
	}

	@Test(priority = 2, enabled = true)
	public void verifySignUpNowTest() {
		
		Assert.assertTrue(util.doIsDisplayed(signUpNow));
	}

	@AfterTest
	public void tearDown() {
		util.doQuit();
	}
}
