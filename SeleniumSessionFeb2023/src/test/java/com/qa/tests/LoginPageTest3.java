package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.utils.AppConstants;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LoginPageTest3 {

	WebDriver driver;

	By email = By.id("_username");
	By password = By.id("_password");
	By loginBtn = By.xpath("//input[@type='submit']");

	By SignUpNow = By.linkText("Sign Up Now");

	@BeforeMethod
	@Parameters({ "browser", "url" })
	public void beforeTest(String browserName, String appUrl) {

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("safari")) {
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new SafariDriver();
		} else {
			System.out.println(browserName + " not found");
			try {
				throw new Exception("BrowserNotFound");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		driver.get(appUrl);
		driver.manage().window().maximize();

	}

	@Test(priority = 1, enabled = true)
	public void verifyLoginPageTitleTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, AppConstants.LOGIN_PAGE_TITLE);
	}

	@Test(priority = 2, enabled = true)
	public void verifySignUpNowLinkTest() {
		Assert.assertTrue(driver.findElement(SignUpNow).isDisplayed());
	}

	@Test(priority = 3, enabled = true)
	@Parameters({ "username", "password" })
	public void loginTest(String username, String pass) {
		driver.findElement(email).sendKeys(username);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginBtn).click();
	}

	@AfterMethod
	public void afterClass() {
		driver.quit();

	}
}
