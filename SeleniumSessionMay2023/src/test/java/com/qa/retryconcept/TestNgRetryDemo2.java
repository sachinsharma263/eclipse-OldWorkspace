package com.qa.retryconcept;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgRetryDemo2 {

	@Test
	public void test1() {

		System.out.println("test1");
		int i = 9 / 0;
	}

	@Test
	public void test2() {

		System.out.println("test2");
		Assert.assertTrue(true);
	}
}
