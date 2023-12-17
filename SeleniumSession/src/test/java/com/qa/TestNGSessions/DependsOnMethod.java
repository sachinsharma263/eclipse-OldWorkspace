package com.qa.TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test(priority = 1)
	public void loginTest() {
		System.out.println("loginTest...starting");
		//int i = 9 / 0;
		System.out.println("loginTest...ending");
	}

	@Test(priority = 2, dependsOnMethods = "loginTest")
	public void homePageTest() {
		System.out.println("homePageTest");
		//int i = 9 / 0;
	}

	@Test(priority = 3, dependsOnMethods = {"loginTest","homePageTest",})
	public void searchTest() {
		System.out.println("searchTest");
	}
}
