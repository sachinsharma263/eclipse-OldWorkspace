package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpNowTest {
	
	WebDriver driver;
	
	By Signup=By.linkText("Sign Up Now");
	By SignUpNow=By.xpath("//h3[text()='Sign Up Now!']");
	
	
	@BeforeTest
	@Parameters({"browserName","url"})
	public void setUp(String browserName,String url)
	{
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
	        driver=new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
	        driver=new FirefoxDriver();
		} else{
			System.out.println(browserName+" not found");
		}
		driver.get(url);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
	}
	@Test(priority = 1)
	public void signUpLinkClickTest()
	{
	driver.findElement(Signup).click();
	String SignUpNowVal=driver.findElement(SignUpNow).getText();
	Assert.assertEquals(SignUpNowVal, "Sign Up Now!");
		
}
	
	
	
	
	@AfterTest
	public void tearDown() {
		//driver.quit();
	}

}
