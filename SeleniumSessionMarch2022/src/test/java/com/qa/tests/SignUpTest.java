package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.util.AppConstants;
import com.qa.util.ElementUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpTest {

	WebDriver driver;
	ElementUtil util;

	By signUpNowLink=By.xpath("//a[text()='Sign Up Now']");
	By signUpNow = By.xpath("//h3[text()='Sign Up Now!']");

	@BeforeTest
	@Parameters("browser")
	public void setUp(String browserName) {
		
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
			
		case "safari":
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver=new SafariDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
			
		default:
			System.out.println(browserName+" not found");
			try {
			throw new Exception("NoSuchBrowserFound");
			}
			catch (Exception e) {
				System.out.println(browserName+" not found");
			}
			break;
		}
		
		driver.get("https://trcrm.com/login/en");
		driver.manage().window().maximize();
		
		util=new ElementUtil(driver);
		
	}

	@Test
	public void verifySignUpNowLinkTest() {
		util.doClick(driver, signUpNowLink);
		util.presenceOfElementLocated(signUpNow);
		Assert.assertEquals(util.doGetText(driver, signUpNow),AppConstants.SIGN_UP_LINK);

	}
	@AfterTest
	public void tearDown() {
		util.quit();
	}

}
