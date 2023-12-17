package com.test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import SeleniumSessions.Firefox;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	WebDriver driver;
	
	By username=By.id("_username");
	By password=By.id("_password");
	By loginBtn=By.xpath("//input[@type='submit']");
	By Signup=By.linkText("Sign Up Now");
	By homePage=By.xpath("//span[text()='Homepage']");
	
	@BeforeTest
	@Parameters({"browserName","url"})
	public void setUp(String browserName,String url) throws Exception
	{
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
	        driver=new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
	        driver=new FirefoxDriver();
		} else{
			System.out.println(browserName+" not found");
			throw new Exception("NoSuchBrowserException");
		}
		
		driver.get(url);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
	}
	@Test(priority = 1)
	public void signUpLinkTest()
	{
	Assert.assertTrue(driver.findElement(Signup).isDisplayed());
		
	}
	@Test(priority = 2,enabled = true)
	public void pageTitleTest() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "CRM Login CRM | Customer Relationship Management TRCRM");
	}
	@Test(priority = 3,enabled = true)
	@Parameters({"username","password"})
	public void loginTest(String usernameVal,String passwordVal) {
		driver.findElement(username).sendKeys(usernameVal);
		driver.findElement(password).sendKeys(passwordVal);
		driver.findElement(loginBtn).click();
		String homepage=driver.findElement(homePage).getText();
		Assert.assertEquals(homepage, "Homepage");
	
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
