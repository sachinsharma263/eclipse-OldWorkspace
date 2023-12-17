package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpTest2 {

	WebDriver driver;

	By signUpLink = By.linkText("Sign Up Now");

	By signUpNow = By.xpath("//h3[text()='Sign Up Now!']");

	@BeforeTest
	@Parameters({"url"})
	public void setUp(String appUrl) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get(appUrl);
		driver.manage().window().maximize();

		driver.findElement(signUpLink).click();
	}

	@Test(priority = 1)
	public void verifySignUpNowPageTitleTest() {
		Assert.assertEquals(driver.getTitle(), "Trial Membership CRM | Customer Relationship Management TRCRM");
	}

	@Test(priority = 2)
	public void verifySignUpNowTest() {
		Assert.assertTrue(driver.findElement(signUpNow).isDisplayed());
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
