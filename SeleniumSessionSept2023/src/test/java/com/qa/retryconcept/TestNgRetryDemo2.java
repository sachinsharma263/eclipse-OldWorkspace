package com.qa.retryconcept;

import org.junit.Assert;
import org.testng.annotations.Test;



public class TestNgRetryDemo2 {
	@Test
	public void test1() {
		Assert.assertTrue(true);
	}

	@Test
	public void test2() {
		Assert.assertTrue(false);
	}
}
