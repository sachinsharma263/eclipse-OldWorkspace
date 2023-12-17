package com.qa.testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test(priority = 1)
	public void loginPageTest() {
		System.out.println("login test");
		//int a=9/0;
	}

	@Test(priority = 2,dependsOnMethods = "loginPageTest")
	public void homePageTest() {
		System.out.println("homePageTest");
		int a=9/0;
	}

	@Test(priority = 3,dependsOnMethods = {"loginPageTest","homePageTest"})
	public void searchTest() {
		System.out.println("contactPageTest");
	}
}
