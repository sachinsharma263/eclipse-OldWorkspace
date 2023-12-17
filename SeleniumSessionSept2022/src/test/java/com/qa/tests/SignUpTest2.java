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

import com.qa.util.AppConstants;
import com.qa.util.ElementUtil;
import com.qa.util.JavaScriptUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpTest2 {

	WebDriver driver;
	ElementUtil util;
	JavaScriptUtil jsUtil;

	By signUpNowLink = By.linkText("Sign Up Now");
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

		default:
			System.out.println(browserName + "not found ");

			try {
				throw new Exception("NOSUCHBROWSERFOUND");
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}

		driver.get(appUrl);
		driver.findElement(signUpNowLink).click();
		driver.manage().window().maximize();

		util = new ElementUtil(driver);
		jsUtil = new JavaScriptUtil(driver);
	}

	@Test(priority = 1)
	public void verifySignUpNowPageTitleTest() {
		String title = util.doGetTitle();
		Assert.assertEquals(title, AppConstants.SIGN_UP_NOW_PAGE_TITLE);
	}

	@Test(priority = 2)
	public void verifySignUpNowTest() {
		String text = util.doGetText(signUpNow);
		Assert.assertEquals(text, AppConstants.SIGN_UP_NOW);
	}

	@AfterTest
	public void tearDown() {

		util.doQuit();
	}

}
