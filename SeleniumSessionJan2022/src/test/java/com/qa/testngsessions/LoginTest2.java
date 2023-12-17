package com.qa.testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest2 {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://trcrm.com/login/en#/");
		driver.manage().window().maximize();

	}

	@Test(priority = 2)
	public void pageTitleTest() {
		Assert.assertEquals(driver.getTitle(), "CRM Login CRM | Customer Relationship Management TRCRM");
	}

	@Test(priority = 1)
	public void signUpLinkTest() {
		Assert.assertTrue(driver.findElement(By.linkText("Sign Up Now")).isDisplayed());
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
		driver.close();
	}
}
