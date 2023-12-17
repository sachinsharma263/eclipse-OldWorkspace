package com.qa.tests;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class LoginPageTest2 {

	WebDriver driver;

	By email = By.id("_username");
	By password = By.id("_password");
	By loginBtn = By.xpath("//input[@type='submit']");

	By SignUpNow = By.linkText("Sign Up Now");

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://trcrm.com/login/en");
		driver.manage().window().maximize();

	}

	@Test(priority = 1,enabled = true)
	public void verifyLoginPageTitleTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "CRM Login CRM | Customer Relationship Management TRCRM");
	}

	@Test(priority = 2,enabled = true)
	public void verifySignUpNowLinkTest() {
		Assert.assertTrue(driver.findElement(SignUpNow).isDisplayed());
	}

	@Test(priority = 3,enabled = true)
	public void loginTest() {
		driver.findElement(email).sendKeys("sachinsharma263@gmail.com");
		driver.findElement(password).sendKeys("swift2994");
		driver.findElement(loginBtn).click();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();

	}
}
