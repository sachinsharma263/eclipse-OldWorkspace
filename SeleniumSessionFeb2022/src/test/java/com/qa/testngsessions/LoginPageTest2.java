package com.qa.testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest2 {

	WebDriver driver;
	By username = By.id("_username");
	By password = By.id("_password");

	By SignUpNow = By.linkText("Sign Up Now");
	By loginButton = By.xpath("//input[@type='submit']");

	By homePageHeader = By.xpath("//span[text()='Homepage']");

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://trcrm.com/login/en");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void signUpNowLinkTest() {

		Assert.assertTrue(driver.findElement(SignUpNow).isDisplayed());
	}

	@Test(priority = 2)
	public void verifyLoginPageTitle() {
		Assert.assertEquals(driver.getTitle(), "CRM Login CRM | Customer Relationship Management TRCRM");
	}

	@Test(priority = 3)
	public void loginTest() {
		driver.findElement(username).sendKeys("sachinsharma263@gmail.com");
		driver.findElement(password).sendKeys("swift2994");
		driver.findElement(loginButton).click();

		Assert.assertEquals(driver.findElement(homePageHeader).getText(), "Homepage");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}