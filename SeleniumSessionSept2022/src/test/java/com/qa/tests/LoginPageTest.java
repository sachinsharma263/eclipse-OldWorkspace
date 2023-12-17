package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.util.AppConstants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {

	WebDriver driver;

	By emailId = By.id("_username");
	By pwd = By.id("_password");
	By loginBtn = By.xpath("//input[@type='submit']");

	By signUpNowLink = By.linkText("Sign Up Now");
	By homePageHeader=By.xpath("//span[text()='Homepage']");

	@BeforeTest
	@Parameters({ "url", "browser" })
	public void setUp(String appUrl, String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println(browsername + " not found");
		}

		driver.get(appUrl);
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void verifyLoginPageTitleTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, AppConstants.LOGIN_PAGE_TITLE);
	}

	@Test(priority = 2)
	public void verifySignUpLinkTest() {
		Assert.assertTrue(driver.findElement(signUpNowLink).isDisplayed());
	}

	@Test(priority = 3)
	@Parameters({"username","password"})
	public void loginTest(String username,String password) {
		driver.findElement(emailId).sendKeys(username);
		driver.findElement(pwd).sendKeys(password);
		driver.findElement(loginBtn).click();
		
		Assert.assertEquals(driver.findElement(homePageHeader).getText(),AppConstants.HOMEPAGE_HEADER);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
