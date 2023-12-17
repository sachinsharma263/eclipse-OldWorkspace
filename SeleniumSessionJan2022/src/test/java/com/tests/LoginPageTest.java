package com.tests;

import org.testng.annotations.Test;

import com.qa.util.AppConstants;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class LoginPageTest {

	WebDriver driver;
	By emaildId = By.id("_username");
	By pwd = By.id("_password");
	By loginButton = By.xpath("//input[@type='submit']");
	By homePage = By.xpath("//span[text()='Homepage']");
	By signUpLink = By.linkText("Sign Up Now");

	@BeforeTest
	@Parameters({ "browser", "url" })
	public void setUp(String browser, String url) {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println(browser + " not found");
			try {
				throw new Exception("NoSuchBrowserException");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		driver.get(url);
		driver.manage().window().maximize();

	}

	@Test(priority = 1, enabled = true)
	public void signUpLinkTest() {
		Assert.assertTrue(driver.findElement(signUpLink).isDisplayed());
	}

	@Test(priority = 2, enabled = true)
	public void pageTitleTest() {
		Assert.assertEquals(driver.getTitle(), AppConstants.LOGIN_PAGE_TITLE);
	}

	@Test(priority = 3, enabled = true)
	@Parameters({ "username", "password" })
	public void loginTest(String username, String password) {
		driver.findElement(emaildId).sendKeys(username);
		driver.findElement(pwd).sendKeys(password);
		driver.findElement(loginButton).click();
		Assert.assertEquals(driver.findElement(homePage).getText(), AppConstants.HOME_PAGE_HEADER);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
