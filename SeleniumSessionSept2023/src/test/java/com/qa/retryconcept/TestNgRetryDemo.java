package com.qa.retryconcept;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.qa.utils.RetryAnalyzer;

public class TestNgRetryDemo {
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void test1() {
		Assert.assertTrue(true);
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void test2() {
		Assert.assertTrue(false);
	}
}
