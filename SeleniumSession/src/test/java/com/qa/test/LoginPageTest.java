package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.listerners.FailedScreenshotListener;
import com.qa.screenshot.TakeScreenshot;
import com.qa.util.JiraPolicy;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginPageTest {

	WebDriver driver;

	@BeforeTest
	@Parameters({ "url", "browser" })
	public void setUp(String url, String browser) throws Exception {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println(browser + " is not found");
			throw new Exception("NoSuchBrowserException");
		}

		driver.get(url);
		
//		TakeScreenshot.takeScreenshot(driver);
//		TakeScreenshot.takeScreenshot(driver, "trcm");
	}

	@Test(priority = 1)
	public void verifyPageTitleTest() {
		Assert.assertEquals(driver.getTitle(), "CRM Login CRM | Customer Relationship Management TRCRM");
	}

	@Test(priority = 2)
	public void verifySignUpLinkTest() {

		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Sign Up Now']")).isDisplayed());
	}

	@Test(priority = 3)
	@Parameters({ "username", "password" })
	public void doLoginTest(String userName, String password) {

		driver.findElement(By.id("_username")).sendKeys(userName);
		driver.findElement(By.id("_password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Homepage']")).getText(), "Homepage");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
