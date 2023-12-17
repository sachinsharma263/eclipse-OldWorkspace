package com.qa.TestNGSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.constants.AppConstant;
import com.qa.excel.ExcelUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	WebDriver driver;

	@BeforeTest
	public void setUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://trcrm.com/login/en");
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	public void verifySignUpLinkTest() {
		Assert.assertTrue(driver.findElement(By.linkText("Sign Up Now")).isDisplayed());
	}

	@Test(priority = 1)
	public void verifyTitleTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "CRM Login CRM | Customer Relationship Management TRCRM");
	}

	@DataProvider()
	public Object[][] getData() {
		Object data[][] = ExcelUtil.getData(AppConstant.TESTDATA_SHEET_NAME);
		return data;
	}

	@Test(priority = 3)
	public void loginTest() {

		driver.findElement(By.id("_username")).sendKeys("sachinsharma263@gmail.com");
		driver.findElement(By.id("_password")).sendKeys("swift2994");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Homepage']")).getText(), "Homepage");
	}

	@Test(priority = 4, dataProvider = "getData")
	public void dataProviderTest(String name, String email, String mobile) {
		System.out.println(name + " " + email + " " + mobile + "\t");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
