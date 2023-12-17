package com.qa.grouping;

import org.testng.annotations.Test;

public class TestGroup1 {
	@Test(groups = { "smoke","windows.reg" })
	public void tc_01() {
		System.out.println("tc_01--smoke");
	}

	@Test(groups = { "sanity" ,"windows.reg"})
	public void tc_02() {
		System.out.println("tc_02--sanity");
	}
	@Test(groups = {"smoke","regression"})
	public void tc_03() {
		System.out.println("tc_03--smoke,regression");
	}
}
