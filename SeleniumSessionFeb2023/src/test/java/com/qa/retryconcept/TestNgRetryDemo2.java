package com.qa.retryconcept;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qa.utils.RetryAnalyzer;

public class TestNgRetryDemo2 {

	@Test
	public void test1() {
		Reporter.log("Reporter.log test1");
		System.out.println("test1");
		int i=9/0;
	}

	@Test
	public void test2() {
		Reporter.log("test2");
		System.out.println("test2");
		Assert.assertTrue(false);
	}
}
