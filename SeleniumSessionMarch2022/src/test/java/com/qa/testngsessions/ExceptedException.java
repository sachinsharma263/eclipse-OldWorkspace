package com.qa.testngsessions;

import org.testng.annotations.Test;

public class ExceptedException {
	@Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class})
	public void loginTest2() {
		System.out.println("login test started");
		int n = 9 / 0;
		System.out.println("login test end");
	}
}
