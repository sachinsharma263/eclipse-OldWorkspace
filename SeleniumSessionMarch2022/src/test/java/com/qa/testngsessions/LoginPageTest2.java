package com.qa.testngsessions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest2 {

	WebDriver driver;
	By username = By.id("_username");
	By password = By.id("_password");
	By loginBtn = By.cssSelector("input[type='submit'][value='Login']");
	By signUpNow = By.linkText("Sign Up Now");
	
	By homePageHeader=By.xpath("//span[text()='Homepage']");

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://trcrm.com/login/en");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void verifySignUpNowLinkTest() {

		assertTrue(driver.findElement(signUpNow).isDisplayed());
	}
	@Test(priority = 2)
	public void verifyLoginPageTitleTest() {
		String title=driver.getTitle();
		assertEquals(title, "CRM Login CRM | Customer Relationship Management TRCRM");
	}
	@Test(priority = 3)
	public void loginTest() {
		driver.findElement(username).sendKeys("sachinsharma263@gmail.com");
		driver.findElement(password).sendKeys("swift2994");
		driver.findElement(loginBtn).click();
		
		String homePageHeaderValue=driver.findElement(homePageHeader).getText();
		Assert.assertEquals(homePageHeaderValue, "Homepage");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
