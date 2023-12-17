package com.qa.grouping;

import org.testng.annotations.Test;

public class Group2 {

	@Test(groups = { "sanity" })
	public void test5() {
		System.out.println("sanity");
	}

	@Test(groups = { "sanity"})
	public void test6() {
		System.out.println("sanity");
	}

	@Test(groups = { "smoke" })
	public void test7() {
		System.out.println("smoke");
	}

	@Test(groups="regression")
	public void test8() {
		System.out.println("regression");
	}
}
