package com.qa.abstractclass;

public abstract class Page {

	public Page() {

		System.out.println("Page--default const");
	}

	public abstract void header();

	public abstract void header(String s);

	public abstract void footer();

	public final void privacyPolicy() {
		System.out.println("Page--privacyPolicy");
	}

	public final void logo() { // logo will remain same in all pages so we have define in Page class and tis
								// method is final,no one can override and changes business
		// logic. all subclasses can use and consume this logo method.no need to write
		// seperate logic
		System.out.println("Page--logo");
		if (false) {
			System.out.println();
		}
		System.exit(0);
	}
	// No abs method-0% abstraction
	// some abs methods and some non abs methods-partial abstraction
	// all abs methods-100% abstraction

	// we can achieve 0to100% abstraction but interface is 100% abstraction

	// when use interface and abstract class
	// whenever we have t use partial abs we can use abstract class.Here we have
	// more flexibility. this are methods u have to use and this u have to define
	// ur own.But in interface u hav to use same concept/feature but business logic
	// will be yous.wheneer u have to define very strict rule just like selenium
	// webdriver use interface.
	// webdriver says i dnt want to take any rsponsibity for any web browser because
	// i dnt know how business logic will behave in different browser
	//se guys give these are concept/feature and u have to implement this.respective browser classes fine i will use these features but business logic
	//will be ours.
}
