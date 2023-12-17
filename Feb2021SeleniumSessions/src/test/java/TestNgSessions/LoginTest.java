package TestNgSessions;

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
import org.testng.annotations.Test;

import SeleniumSessions.Firefox;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	WebDriver driver;
	
	By username=By.id("username");
	By password=By.id("password");
	By loginBtn=By.id("loginBtn");
	By Signup=By.linkText("Sign up");
	By Signin=By.linkText("Sign in");
	
	//@BeforeTest
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.firefoxdriver().setup();
		
		
        
        driver=new FirefoxDriver();
		driver.get("https://app.hubspot.com/signup");
		driver.findElement(Signin).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	
		
	}
	@Test(priority = 1)
	public void signUpLinkTest()
	{
	Assert.assertTrue(driver.findElement(Signup).isDisplayed());
		
	}
	@Test(priority = 2)
	public void pageTitleTest() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "HubSpot Login");
	}
	@Test(priority = 3)
	public void loginTest() {
		driver.findElement(username).sendKeys("sachinsharma263@gmail.com");
		driver.findElement(password).sendKeys("Bholababa@1");
		driver.findElement(loginBtn).click();
	
	}
	//@AfterTest
	@AfterMethod
	public void tearDown() {
		
		//driver.quit();
	}
	
}
