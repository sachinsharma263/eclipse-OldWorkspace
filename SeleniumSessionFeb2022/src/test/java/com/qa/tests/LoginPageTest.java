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

import com.qa.util.AppConstants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {

	WebDriver driver;
	By username = By.id("_username");
	By password = By.id("_password");
	By SignUpNow = By.linkText("Sign Up Now");
	By loginButton = By.xpath("//input[@type='submit']");
	By homePageHeader = By.xpath("//span[text()='Homepage']");

	@BeforeTest
	@Parameters({ "browser", "url" })
	public void setUp(String browser, String url) throws Exception {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("safari")) {
			WebDriverManager.getInstance(ChromeDriver.class).setup();
			driver = new SafariDriver();
		} else {
			System.out.println("Please pass the correct browser name");
			throw new Exception("NoSuchBrowserException");
		}

		driver.get(url);
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void signUpNowLinkTest() {

		Assert.assertTrue(driver.findElement(SignUpNow).isDisplayed());
	}

	@Test(priority = 2)
	public void verifyLoginPageTitle() {
		Assert.assertEquals(driver.getTitle(), AppConstants.LOGIN_PAGE_TITLE);
	}

	@Test(priority = 3)
	@Parameters({ "username", "password" })
	public void loginTest(String userName, String passWord) {
		driver.findElement(username).sendKeys(userName);
		driver.findElement(password).sendKeys(passWord);
		driver.findElement(loginButton).click();

		Assert.assertEquals(driver.findElement(homePageHeader).getText(), AppConstants.HOME_PAGE_HEADER);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}