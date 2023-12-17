package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.listerners.FailedScreenshotListener;
import com.qa.util.JiraPolicy;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SignUpPageTest {

	WebDriver driver;

	@BeforeTest
	@Parameters({"url","browser"})
	public void setUp(String url,String browser) throws Exception {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println(browser + " is not found");
			throw new Exception("NoSuchBrowserException");
		}
		driver.get(url);
		
		}
	
	@JiraPolicy(logTicketReady = true)
	@Test
	public void verifySignUpNowTest() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Sign Up Now']")).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.findElement(By.xpath("//h3[text()='Sign Up Now!']")).getText(), "Sign Up Now!2"); 
	}
}
