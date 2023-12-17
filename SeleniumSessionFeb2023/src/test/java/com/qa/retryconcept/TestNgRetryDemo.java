package com.qa.retryconcept;

import org.testng.annotations.Test;

import com.qa.utils.RetryAnalyzer;

public class TestNgRetryDemo {
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void test1() {
		System.out.println("test1");
		int i = 9 / 0;
	}

	@Test
	public void test2() {
		System.out.println("test2");
	}
}
