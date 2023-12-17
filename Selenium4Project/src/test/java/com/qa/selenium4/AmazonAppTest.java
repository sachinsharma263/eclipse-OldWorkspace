package com.qa.selenium4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonAppTest {

	@Test
	public void addToCartTest() {
		System.out.println("addToCartTest");
		Assert.assertTrue(false);
	}
	@Test(enabled = true, alwaysRun = true,dependsOnMethods = "addToCartTest")
	public void paymentTest() {
		System.out.println("paymentTest");
	}
}
