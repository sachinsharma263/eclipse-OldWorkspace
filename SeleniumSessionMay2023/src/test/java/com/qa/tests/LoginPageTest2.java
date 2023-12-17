package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.javascriptutil.JavaScriptUtil;
import com.qa.utils.AppConstants;
import com.qa.utils.ElementUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginPageTest2 {

	WebDriver driver;
	ElementUtil util;
	JavaScriptUtil jsUtil;
	
	By email = By.id("_username");
	By password = By.id("_password");
	By loginBtn = By.xpath("//input[@type='submit']");

	By signUpNow = By.xpath("//a[text()='Sign Up Now']");

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://trcrm.com/login/en");
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

	@Test(priority = 3, enabled = true)
	public void loginTest() {
		util.doSendkeys(email, "sachinsharma263@gmail.com");
		util.doSendkeys(password, "swift2994");
		util.doClick(loginBtn);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
