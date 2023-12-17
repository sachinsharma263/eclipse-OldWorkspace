package com.qa.grouping;

import org.testng.annotations.Test;

public class TestGroup2 {
	@Test(groups = {"smoke"})
	public void tc_05(){
		System.out.println("tc_05");
	}
	@Test(groups = {"sanity"})
	public void tc_06(){
		System.out.println("tc_06");
	}
	@Test(groups = {"smoke","regression"})
	public void tc_07(){
		System.out.println("tc_07");
	}
}
