package TestNgSessions;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
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

import SeleniumSessions.Firefox;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest3WithAllAnnotations {
	
	/*
	 * BS
	 * BT
	 * BC
	 * 
	 * BM
	 * T1
	 * AM
	 * 
	 * AC
	 * AT
	 * AS
	 
	 */

	WebDriver driver;
	
	By username=By.id("_username");
	By password=By.id("_password");
	By loginBtn=By.xpath("//input[@type='submit']");
	By Signup=By.linkText("Sign Up Now");
	By homePage=By.xpath("//span[text()='Homepage']");
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before suite");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before test");
	}

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class");
	}
	@BeforeMethod
	public void setUp()
	{
		System.out.println("before method");
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		driver.get("https://trcrm.com/login/en");
		//driver.findElement(Signin).click();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public void test1()
	{
		System.out.println("test method 1");
	
		
	}
	@Test
	public void test2()
	{
		System.out.println("test method 2");
	
		
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("after test");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after suite");
	}
	
}
