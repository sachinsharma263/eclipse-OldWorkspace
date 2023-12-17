package com.tests;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class SignUpTest {

	WebDriver driver;
	By signUpNowLink = By.linkText("Sign Up Now");
	By signUpNow = By.xpath("//h3[text()='Sign Up Now!']");

	@BeforeTest
	@Parameters({ "url", "browser" })
	public void setUp(String url, String browserName) throws Exception {

		System.out.println(browserName+" launched");
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println(browserName + " not found");
			throw new Exception("NoSuchBrowserException");
		}
		driver.get(url);
		driver.manage().window().maximize();

	}

	@Test
	public void verifySignUpLinkTest() {
		driver.findElement(signUpNowLink).click();
		Assert.assertTrue(driver.findElement(signUpNow).isDisplayed());
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
