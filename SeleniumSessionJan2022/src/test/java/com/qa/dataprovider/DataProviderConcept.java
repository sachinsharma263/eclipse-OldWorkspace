package com.qa.dataprovider;

import org.testng.annotations.Test;

import com.qa.util.ExcelUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DataProviderConcept {

	WebDriver driver;

	@DataProvider()
	public Object[][] dp() {
		Object data[][] = ExcelUtils.getData("Sheet1");

		return data;

	}

	@BeforeMethod
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://trcrm.com/login/en");
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "dp")
	public void loginTest(String username, String password) {
		driver.findElement(By.id("_username")).sendKeys(username);
		driver.findElement(By.id("_password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Homepage']")).getText(), "Homepage");

	}

	@AfterMethod
	public void afterTest() {
		driver.quit();
	}

}
