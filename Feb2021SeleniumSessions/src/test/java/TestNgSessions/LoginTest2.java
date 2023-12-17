package TestNgSessions;

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
import org.testng.annotations.Test;

import SeleniumSessions.Firefox;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest2 {

	WebDriver driver;
	
	By username=By.id("_username");
	By password=By.id("_password");
	By loginBtn=By.xpath("//input[@type='submit']");
	By Signup=By.linkText("Sign Up Now");
	By homePage=By.xpath("//span[text()='Homepage']");
	
	//@BeforeTest
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		
		
        
        driver=new ChromeDriver();
		driver.get("https://trcrm.com/login/en");
		//driver.findElement(Signin).click();
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
	public void loginTest() {
		driver.findElement(username).sendKeys("sachinsharma263@gmail.com");
		driver.findElement(password).sendKeys("Bholababa@1");
		driver.findElement(loginBtn).click();
		String homepage=driver.findElement(homePage).getText();
		Assert.assertEquals(homepage, "Homepage");
	
	}
	//@AfterTest
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
}
