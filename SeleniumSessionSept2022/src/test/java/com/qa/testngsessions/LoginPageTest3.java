package com.qa.testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.util.AppConstants;
import com.qa.util.ElementUtil;
import com.qa.util.JavaScriptUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest3 {

	WebDriver driver;
	ElementUtil util;
	JavaScriptUtil jsUtil;

	By emailId = By.id("_username");
	By password = By.id("_password");
	By loginBtn = By.xpath("//input[@type='submit']");

	By signUpNowLink = By.linkText("Sign Up Now");
	By homePaheHeader = By.xpath("//span[text()='Homepage']");

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://trcrm.com/login/en");
		driver.manage().window().maximize();

		util = new ElementUtil(driver);
		jsUtil=new JavaScriptUtil(driver);

	}

	@Test(priority = 1, enabled = true)
	public void verifyLoginPageTitleTest() {
		String title = util.doGetTitle();
		Assert.assertEquals(title, AppConstants.LOGIN_PAGE_TITLE);
	}

	@Test(priority = 2, enabled = true)
	public void verifySignUpLinkTest() {
		Assert.assertTrue(util.isDisplayed(signUpNowLink));
	}

	@Test(priority = 3, enabled = true)
	public void loginTest() {
		util.waitForPresenceOfElement(emailId);
		util.doSendKeys(emailId, "sachinsharma263@gmail.com");
		util.doSendKeys(password, "swift2994");
		util.doClick(loginBtn);

		Assert.assertEquals(util.doGetText(homePaheHeader), AppConstants.HOMEPAGE_HEADER);
	}

	@AfterMethod
	public void tearDown() {
		util.doQuit();
	}

}
