package com.qa.testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.waits.ExplictWaitConcept;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {

	WebDriver driver;

	By username = By.id("username");
	By password = By.id("password");
	By loginBtn = By.id("loginBtn");

	By signInLink = By.linkText("Sign in");
	By signUpLink = By.linkText("Sign up");

	@BeforeTest
	public void setUp() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/signup");
		
		ExplictWaitConcept.presenceOfElementLocated(driver, signInLink, 10);
		
		
		//Thread.sleep(3000);
		driver.findElement(signInLink).click();
	}

	@Test(priority = 1)
	public void verifySignUpLinkTest() {
		Assert.assertTrue(driver.findElement(signUpLink).isDisplayed());

	}

	@Test(priority = 2)
	public void verifyLoginPageTitleTest() {
		Assert.assertEquals(driver.getTitle(), "HubSpot Login");
	}

	@Test(priority = 3)
	public void loginTest() {
		
		ExplictWaitConcept.presenceOfElementLocated(driver, username, 10);
		driver.findElement(username).sendKeys("test@gmail.com");
		driver.findElement(password).sendKeys("test@123");
		driver.findElement(loginBtn).click();
	}

	public void tearDown() {

	}
}
