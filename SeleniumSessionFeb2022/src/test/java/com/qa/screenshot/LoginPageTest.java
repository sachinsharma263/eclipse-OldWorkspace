package com.qa.screenshot;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest extends Base {

	@BeforeTest
	public void setUp() {
		init_driver();
	}

	@Test
	public void loginTest() {
		driver.findElement(By.id("username"));
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
