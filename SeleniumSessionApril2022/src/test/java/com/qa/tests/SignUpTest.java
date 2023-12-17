package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.utils.AppConstants;
import com.qa.utils.ElementUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpTest {

	WebDriver driver;
	ElementUtil util;
	By SignUpNowLink = By.linkText("Sign Up Now");
	By signUpNow = By.xpath("//h3[text()='Sign Up Now!']");

	@BeforeTest
	@Parameters({ "browser", "url" })
	public void setUp(String browserName, String appUrl) {

		switch (browserName) {
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
			System.out.println(browserName + " not found");
			try {
				throw new Exception("NoSuchBrowserException");
			} catch (Exception e) {
				System.out.println(browserName + " not found");
			}
			break;
		}

		driver.get(appUrl);
		driver.manage().window().maximize();
		driver.findElement(SignUpNowLink).click();

		util = new ElementUtil(driver);

	}

	@Test
	public void verifySignUpNowTest() {
		String text = util.doGetText(signUpNow);
		Assert.assertEquals(text, AppConstants.SIGN_UP_NOW);
	}

	@Test
	public void verifySignUpPageTitleTest() {
		String title = util.doGetTitle();
		Assert.assertEquals(title, AppConstants.SIGN_UP_PAGE_TITLE);
	}

	@AfterTest
	public void tearDown() {
		util.doQuit();
	}

}
