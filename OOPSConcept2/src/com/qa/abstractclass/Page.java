package com.qa.abstractclass;

public abstract class Page {

	public Page() {
		System.out.println("Page--default");
	}

	public abstract void header();
	
	public abstract void header(int a);

	public abstract void footer();

	public final void privacyPolicy() {
		System.out.println("Page--privacyPolicy");
	}
	public final void logo() {
		System.out.println("Page--logo");
	}
	// no abs method-0% abstraction
	// some abs methods and some non abs methods-partial abstraction
	// only abs methods-100% abstraction
	// we can achieved 0 to 100 percent abstraction through abstract classes
	
	//interface is always 100 percent abstraction where we have only prototype methods
	
	//when to use interface and abstarct class?
	//whenever we have to use partial abstarction,we will always use abstract class.abstract class more popular than interface because we have 
	//more flexibilty.
	
	//privacyPolicy and logo are two important business features which will remains same in all of the pages but header and footer might be different
	//page wise
	

}
