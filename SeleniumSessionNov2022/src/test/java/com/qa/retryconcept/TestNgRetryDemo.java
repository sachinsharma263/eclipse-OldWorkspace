package com.qa.retryconcept;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.utils.RetryAnalyzer;

public class TestNgRetryDemo {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void test1() {
		System.out.println("test1");
		int i=9/0;
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void test2() {
		System.out.println("test2");
		Assert.assertTrue(false);
	}
}
