package com.qa.testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test(priority = 1,enabled = true,invocationCount = 1,expectedExceptions = ArithmeticException.class)
	public void loginTest() {
		System.out.println("loginTest");
		//int n = 9 / 0;
	}

	@Test(priority = 2, dependsOnMethods = "loginTest")
	public void homePageTest() {
		System.out.println("homePageTest");
		int n = 9 / 0;
	}

	@Test(priority = 3, dependsOnMethods = {"loginTest","homePageTest"})
	public void searchTest() {
		System.out.println("searchTest");
	}
}
