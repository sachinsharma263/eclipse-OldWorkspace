package com.qa.testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test(priority = 1)
	public void loginTest() {
		System.out.println("login test...");
		//int n = 9 / 0;
	}

	@Test(priority = 2, dependsOnMethods = "loginTest")
	public void homeTest() {
		System.out.println("home test...");
		int n = 9 / 0;
	}

	@Test(priority = 3, dependsOnMethods = {"loginTest","homeTest"})
	public void searchTest() {
		System.out.println("search test...");
	}

}
