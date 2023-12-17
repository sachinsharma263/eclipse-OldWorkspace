package com.qa.abstractclass;

public class Testpage {

	public static void main(String[] args) {
		System.exit(0);
		Loginpage lp = new Loginpage();
		lp.footer();
		lp.header();
		lp.privacyPolicy();
		lp.logo();
		
		Page p=new Loginpage();
		p.header();
		p.privacyPolicy();
		
		p.logo();
		
		//new Page(); Cannot instantiate the type Page
		//we cannot create object of abstract class but we can create constaructor of abstract class.this constractor will be call when object of child class
		//created.

	}

}
