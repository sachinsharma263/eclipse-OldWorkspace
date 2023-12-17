package com.qa.TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	@Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class})
	public void test() {
		System.out.println("test...starting");
		
		int a=9/0;
		
		System.out.println("test...ending");
		
	}
}
