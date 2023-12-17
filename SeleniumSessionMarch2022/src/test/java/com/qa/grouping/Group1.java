package com.qa.grouping;

/*
 * when we do manual testing we have so much of flexibilty to organize the test case.
 * suppose we have 1000 test cases and we are categorising or segrating test cases into smoke sanity and regression etc.
 * As and when requirement comes and when we have x`x`urgent release  we dnt have time then we can execute tc cases having critical functionalty or if have time
 * we can execute regression.As a manual testing we have so much of flexibility which test cases to execeute.Similar thing we have applied in automation by
 *  using concept of group.
 * Grouping-is a feature in testng where we can assign tests to one or more groups
 * during execution we can define which group to include or exclude
 * this makes test mgmt and execution very easy and efficient
 * grouping gives flexibility where we can partition out tests
 * segerating test on the basis of functionality or modules
 * 
 * suppose we have test1 to test 7
 * we seggreate out test into groups like test1 and test2 to sanity
 * test 1 to test 7 to regression
 */
import org.testng.annotations.Test;

public class Group1 {

	@Test(groups = "sanity")
	public void test1() {
		System.out.println("test1");
	}

	@Test(groups = {"sanity","regression"})
	public void test2() {
		System.out.println("test2");
	}

	@Test(groups = "regression")
	public void test3() {
		System.out.println("test3");
	}
	@Test()
	public void test4() {
		System.out.println("test4");
	}
	
}
