package com.qa.TestNGSessions;

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

public class LoginTest3 {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://trcrm.com/login/en");
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	public void verifySignUpLinkTest() {
		Assert.assertTrue(driver.findElement(By.linkText("Sign Up Now")).isDisplayed());
	}

	@Test(priority = 1)
	public void verifyTitleTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "CRM Login CRM | Customer Relationship Management TRCRM");
	}

	@Test(priority = 3)
	public void loginTest() {

		driver.findElement(By.id("_username")).sendKeys("sachinsharma263@gmail.com");
		driver.findElement(By.id("_password")).sendKeys("swift2994");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Homepage']")).getText(), "Homepage");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
