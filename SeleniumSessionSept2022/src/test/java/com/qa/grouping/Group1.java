package com.qa.grouping;

import org.testng.annotations.Test;

public class Group1 {

	@Test(groups = { "sanity" })
	public void test1() {
		System.out.println("sanity");
	}

	@Test(groups = { "sanity"})
	public void test2() {
		System.out.println("sanity");
	}

	@Test(groups = { "smoke" })
	public void test3() {
		System.out.println("smoke");
	}

	@Test(groups="regression")
	public void test4() {
		System.out.println("regression");
	}
	@Test(groups= {"smoke","regression"})
	public void test9() {
		System.out.println("smoke+regression");
	}
	@Test()
	public void test10() {
		System.out.println("test10");
	}
}
