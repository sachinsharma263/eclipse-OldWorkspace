package com.qa.screenshotfailedtest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

//@Listeners(CustomListener.class)
public class ScreenshotTest extends Base {

	@BeforeMethod
	public void name() {
		initilization();
	}
	@AfterMethod
	public void name2()
	{
		driver.quit();
	}
	@Test
	public void screenShotTest1() {
		org.testng.Assert.assertEquals(true, false);
	}
	@Test
	public void screenShotTest2() {
		org.testng.Assert.assertEquals(true, false);
	}
	@Test
	public void screenShotTest3() {
		org.testng.Assert.assertEquals(true, false);
	}
}
