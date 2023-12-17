package com.qa.testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 * @BeforeTest
 * @AfterTest
 */
public class LoginPageTest2 {

	WebDriver driver;
	
	By emailId = By.id("_username");
	By password = By.id("_password");
	By loginBtn = By.xpath("//input[@type='submit']");

	By signUpNowLink = By.linkText("Sign Up Now");
	By homePaheHeader=By.xpath("//span[text()='Homepage']");

	@BeforeTest
	public void setUp() {
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
	public void verifySignUpLinkTest() {
		Assert.assertTrue(driver.findElement(signUpNowLink).isDisplayed());
	}

	@Test(priority = 3,enabled = true)
	public void loginTest() {
		driver.findElement(emailId).sendKeys("sachinsharma263@gmail.com");
		driver.findElement(password).sendKeys("swift2994");
		driver.findElement(loginBtn).click();
		
		Assert.assertEquals(driver.findElement(homePaheHeader).getText(), "Homepage");
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
