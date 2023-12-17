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

public class SignUpTest {

	WebDriver driver;

	By SignUpNow = By.linkText("Sign Up Now");

	@BeforeTest
	@Parameters({ "browser", "url" })
	public void setUp(String browser, String url) throws Exception {

		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "safari":
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new SafariDriver();
			break;

		default:
			System.out.println("Please pass the correct browser name");
			throw new Exception();
		}

		driver.get(url);
		driver.manage().window().maximize();
	}

	@Test
	public void signUpLinkTest() {

		driver.findElement(SignUpNow).click();
		Assert.assertEquals(driver.findElement(By.xpath("//h3[text()='Sign Up Now!']")).getText(),
				AppConstants.SIGN_UP_LINK);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
