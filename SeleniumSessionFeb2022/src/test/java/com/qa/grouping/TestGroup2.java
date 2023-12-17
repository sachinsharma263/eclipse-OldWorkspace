package com.qa.grouping;

import org.testng.annotations.Test;

public class TestGroup2 {
	@Test(groups = "smoke")
	public void tc_04() {
		System.out.println("tc_04--smoke");
	}

	@Test
	public void tc_05() {
		System.out.println("tc_05");
	}
}
