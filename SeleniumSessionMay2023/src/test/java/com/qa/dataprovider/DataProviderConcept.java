package com.qa.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.excel.ExcelUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderConcept {

	WebDriver driver;
	
	By username = By.id("_username");
	By password = By.id("_password");
	By loginBtn = By.xpath("//input[@type='submit']");

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://trcrm.com/login/en");
	}

	@DataProvider
	public Object[][] getTestData() {
		Object data[][] = ExcelUtil.getData();
		return data;
	}

	@Test(dataProvider = "getTestData")
	public void loginTest(String email, String pwd) {
		driver.findElement(username).sendKeys(email);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginBtn).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
