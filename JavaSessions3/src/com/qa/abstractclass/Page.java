package com.qa.abstractclass;

public abstract class Page {

	public Page() {
		System.out.println("Page--default const");
	}

	public abstract void header();
	
	public abstract void header(int a);

	public abstract void footer();

	public final void privacyPolicy() {
		System.out.println("Page--privacy");
	}
	public final void logo() {
		System.out.println("Page--logo");
	}
	
	//No abs method-0% abstraction
	//some abs method and some non abs method-partial abstraction
	//only abs method-100% abstraction
	
	//we can achived 0-100% abstraction whereas interface is 100% abstarction

	//se webdriver is an interface,they enforce all the abstract methods to be implemented by respective browsers.  

}
