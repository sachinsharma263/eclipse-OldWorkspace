package com.qa.grouping;

import org.testng.annotations.Test;


public class TestGroup1 {

	@Test(groups = {"smoke"})
	public void tc_01(){
		System.out.println("tc_01");
	}
	@Test(groups = {"sanity"})
	public void tc_02(){
		System.out.println("tc_02");
	}
	@Test(groups = {"smoke","regression"})
	public void tc_03(){
		System.out.println("tc_03");
	}
	@Test
	public void tc_04(){
		System.out.println("tc_04");
	}
}
