package com.qa.superconcept;
/*
 * super keyword is use to call parent class constructor as well as parent class method
 * invoke or call parent class constructor
 * 
 * https://www.geeksforgeeks.org/super-keyword/
 */
public class Page {

	String pageTitle;

	
	public Page() { System.out.println("Page--default const"); }
	 

	public Page(String pageTitle) {
	
		System.out.println("Page--1 param const");
		this.pageTitle = pageTitle;//this keyword mainly represents the current instance/object of a class
	}
	public void getName() {
		System.out.println("getName");
	}

}
