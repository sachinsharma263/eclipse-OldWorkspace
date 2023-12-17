package com.qa.dataprovider;

import org.testng.annotations.Test;

import com.qa.excel.ExcelUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class DataProviderConcept {

	WebDriver driver;
	By username = By.id("_username");
	By passwod = By.id("_password");
	By loginBtn = By.xpath("//input[@type='submit']");

	@Test(dataProvider = "dp")
	public void loginTest(String email, String pass) {
		driver.findElement(username).sendKeys(email);
		driver.findElement(passwod).sendKeys(pass);
		driver.findElement(loginBtn).click();
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();

		driver.get("https://trcrm.com/login/en");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

	@DataProvider
	public Object[][] dp() {
		Object data[][] = ExcelUtil.getData();
		return data;
	}
}
