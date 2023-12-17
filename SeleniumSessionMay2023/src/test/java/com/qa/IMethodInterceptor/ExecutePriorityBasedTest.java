package com.qa.IMethodInterceptor;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(PriorityMethodInterceptorListener.class)
public class ExecutePriorityBasedTest  {

	@Test(priority = 1)
	public void loginTest() {
		System.out.println("loginTest");
	}

	@Test(priority = 2)
	public void loginPageTitleTest() {
		System.out.println("loginPageTitleTest");
	}

	@Test(priority = 1)
	public void SignUpTest() {
		System.out.println("SignUpTest");
	}
	@Test(priority = 2)
	public void SignUpTitleTest() {
		System.out.println("SignUpTitleTest");
	}
}
