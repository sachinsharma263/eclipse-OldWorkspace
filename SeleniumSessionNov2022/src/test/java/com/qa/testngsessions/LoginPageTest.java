package com.qa.testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 * @BeforeMethod
 * @AfterMethod
 */
public class LoginPageTest {

	WebDriver driver;

	By username = By.id("_username");
	By password = By.id("_password");
	By loginBtn = By.xpath("//input[@type='submit']");

	By signUpNowLink = By.xpath("//a[text()='Sign Up Now']");
	By homePageHeader=By.xpath("//span[text()='Homepage']");

	@BeforeMethod
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

	@Test(priority = 2)
	public void verifySignUpLinkTest() {
		Assert.assertTrue(driver.findElement(signUpNowLink).isDisplayed());
	}

	@Test(priority = 3)
	public void loginTest() {
		driver.findElement(username).sendKeys("sachinsharma263@gmail.com");
		driver.findElement(password).sendKeys("swift2994");
		driver.findElement(loginBtn).click();
		
		String homePageHeaderText=driver.findElement(homePageHeader).getText();
		
		Assert.assertEquals(homePageHeaderText, "Homepage");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
