package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.javascriptutil.JavaScriptUtil;
import com.qa.utils.AppConstants;
import com.qa.utils.ElementUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LoginPageTest {

	WebDriver driver;
	ElementUtil util;
	JavaScriptUtil jsUtil;

	By email = By.id("_username");
	By password = By.id("_password");
	By loginBtn = By.xpath("//input[@type='submit']");

	By signUpNow = By.xpath("//a[text()='Sign Up Now']");

	@Parameters({ "browser", "url" })
	@BeforeMethod
	public void setUp(String browserName, String appUrl) {

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			System.out.println(browserName + " not found");
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
		Assert.assertTrue(util.doIsDisplayed(signUpNow));
	}

	@Parameters({ "username", "password" })
	@Test(priority = 3, enabled = true)
	public void loginTest(String username, String pwd) {
		util.doSendkeys(email, username);
		util.doSendkeys(password, pwd);
		util.doClick(loginBtn);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
