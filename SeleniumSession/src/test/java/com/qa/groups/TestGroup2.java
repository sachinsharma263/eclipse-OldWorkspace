package com.qa.groups;

import org.testng.annotations.Test;

public class TestGroup2 {

	@Test(groups = "smoke")
	public void tc_04() {
		System.out.println("smoke..tc_04");
	}

	@Test(groups = "regression")
	public void tc_05() {
		System.out.println("regression..tc_05");
	}

	@Test(groups = "smoke")
	public void tc_06() {
		System.out.println("smoke..tc_06");
	}
}
