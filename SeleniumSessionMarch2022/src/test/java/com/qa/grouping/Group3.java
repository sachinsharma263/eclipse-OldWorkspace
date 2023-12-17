package com.qa.grouping;

import org.testng.annotations.Test;

public class Group3 {

	@Test(groups = {"smoke","regression"})
	public void test() {
		System.out.println("test");
	}
}
