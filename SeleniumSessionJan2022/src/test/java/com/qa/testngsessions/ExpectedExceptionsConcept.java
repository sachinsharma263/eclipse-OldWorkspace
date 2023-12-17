package com.qa.testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionsConcept {

	@Test(expectedExceptions={ArithmeticException.class,NullPointerException.class})
	public void loginTest() {
		System.out.println("login test...starting");

		int a = 9 / 0;

		System.out.println("login test...ending");
	}
}
