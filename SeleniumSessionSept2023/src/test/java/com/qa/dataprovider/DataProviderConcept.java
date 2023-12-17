package com.qa.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.excel.ExcelUtil;

public class DataProviderConcept {
	WebDriver driver;

	By emailId = By.id("_username");
	By password = By.id("_password");
	By loginBtn = By.xpath("//input[@type='submit']");

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://trcrm.com/login/en");

	}

	@DataProvider
	public Object[][] getData() {
		Object data[][] = ExcelUtil.getData();
		return data;
	}

	@Test(dataProvider = "getData")
	public void loginTest(String email, String pass) {
		driver.findElement(emailId).sendKeys(email);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginBtn).click();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
