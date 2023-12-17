package com.qa.tests;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class LoginPageTest3 {

	WebDriver driver;
	By email = By.id("_username");
	By password = By.id("_password");
	By loginBtn = By.xpath("//input[@type='submit']");

	By signUpNow = By.xpath("//a[text()='Sign Up Now']");

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://trcrm.com/login/en");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void verifyLoginPageTitleTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "CRM Login CRM | Customer Relationship Management TRCRM");
	}

	@Test(priority = 2)
	public void verifySignUpLinkTest() {
		Assert.assertTrue(driver.findElement(signUpNow).isDisplayed());
	}

	@Test(priority = 3)
	public void loginTest() {
		driver.findElement(email).sendKeys("sachinsharma263@gmail.com");
		driver.findElement(password).sendKeys("swift2994");
		driver.findElement(loginBtn).click();

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
