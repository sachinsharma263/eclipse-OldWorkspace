package com.qa.testngsessions;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority = 0)
	public void test1() {
		System.out.println("test1");
	}

	@Test(priority = -1)
	public void test2() {
		System.out.println("test2");
	}

	@Test(priority = 2)
	public void test4() {
		System.out.println("test4");
	}

	@Test(priority = 4)
	public void test3() {
		System.out.println("test3");
	}

	@Test(priority = 5, enabled = false)
	public void test5() {
		System.out.println("test5");
	}

	@Test
	public void test6() {
		System.out.println("test6");
	}
	
	public void test7() {
		System.out.println("test7");
	}
}
