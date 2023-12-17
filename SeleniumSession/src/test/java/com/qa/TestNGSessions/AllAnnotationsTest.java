package com.qa.TestNGSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllAnnotationsTest {

	WebDriver driver;

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("before Class");
	}

	@BeforeMethod
	public void setUp() {
		System.out.println("BeforeMethod");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://trcrm.com/login/en");
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	public void verifySignUpLinkTest() {
		System.out.println("Test");
		Assert.assertTrue(driver.findElement(By.linkText("Sign Up Now")).isDisplayed());
	}

	@Test(priority = 1, enabled = true)
	public void verifyTitleTest() {
		System.out.println("Test2");
		String title = driver.getTitle();
		Assert.assertEquals(title, "CRM Login CRM | Customer Relationship Management TRCRM");
	}

	@Test(priority = 3, enabled = false)
	public void loginTest() {

		driver.findElement(By.id("_username")).sendKeys("sachinsharma263@gmail.com");
		driver.findElement(By.id("_password")).sendKeys("swift2994");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Homepage']")).getText(), "Homepage");
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("afterMethod");
		driver.quit();
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
	}
}
