package com.qa.TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {

	@Test(invocationCount = 10)
	public void createUser() {
		System.out.println("createUser");
	}
}
