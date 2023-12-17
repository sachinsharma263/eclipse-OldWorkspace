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

import com.qa.utils.AppConstants;
import com.qa.utils.ElementUtil;
import com.qa.utils.JavaScriptUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpTest {

	WebDriver driver;
	ElementUtil util;
	JavaScriptUtil jsUtil;

	By signUpNowLink = By.linkText("Sign Up Now");
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
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			System.out.println(browserName + " not found");
			try {
				throw new Exception("NoSuchBrowserFound");

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		}

		driver.get(appUrl);
		driver.findElement(signUpNowLink).click();
		driver.manage().window().maximize();
		
		util=new ElementUtil(driver);
		jsUtil=new JavaScriptUtil(driver);
	}

	@Test
	public void verifySignUpNowPageTitleTest() {
		String title = util.doGetTitle();
		Assert.assertEquals(title, AppConstants.SIGNUP_PAGE_TITLE);
	}

	@Test
	public void verifySignUpNowTest() {
		Assert.assertTrue(util.doIsDisplayed(signUpNow));
	}

	@AfterTest
	public void tearDown() {
		util.doQuit();
	}
}
