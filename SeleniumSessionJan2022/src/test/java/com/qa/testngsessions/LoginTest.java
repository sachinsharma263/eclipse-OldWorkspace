package com.qa.testngsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://trcrm.com/login/en");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
	}

	@Test(priority = 1)
	public void signUpNowTest() {
		Assert.assertTrue(driver.findElement(By.linkText("Sign Up Now")).isDisplayed());
	}

	@Test(priority = 2)
	public void pageTitleTest() {
		Assert.assertEquals(driver.getTitle(), "CRM Login CRM | Customer Relationship Management TRCRM");
	}

	@Test(priority = 3)
	public void loginTest() {
		driver.findElement(By.id("_username")).sendKeys("sachinsharma263@gmail.com");
		driver.findElement(By.id("_password")).sendKeys("swift2994");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Homepage']")).getText(), "Homepage");
	}

	@AfterTest
	public void tearDown() {

		//driver.close();
	}

}
