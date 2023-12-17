package com.qa.groups;

import org.testng.annotations.Test;


public class TestGroup1 {

	@Test(groups = {"smoke","regression"})
	public void tc_01() {
		System.out.println("smoke..tc_01");
	}

	@Test(groups = "regression")
	public void tc_02() {
		System.out.println("regression..tc_02");
	}

	@Test(groups = "smoke")
	public void tc_03() {
		System.out.println("smoke..tc_03");
	}
	@Test
	public void tc_001() {
		System.out.println("smoke..tc_001");
	}
}
