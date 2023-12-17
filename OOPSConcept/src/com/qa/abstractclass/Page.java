package com.qa.abstractclass;

public abstract class Page {

	int a;

	public Page() {
		System.out.println("Page--default const");
	}

	public abstract void header();

	public abstract void header(int a);// 2 abs method- overloaded

	public abstract void footer();

	public final void privacyPolicy() {
		System.out.println("Page--privacyPolicy");
	}

	public final void logo() {
		System.out.println("Page--logo");
	}
	/*
	 * this privacy policy and logo method will be used by every page,no need to
	 * give seperate business logic for each page because log and policy remains
	 * same for every page
	 */

	// no abs method-0% abstraction
	// some abs method + some non abs method-partial abstraction
	// all abs method-100% abstraction
}
