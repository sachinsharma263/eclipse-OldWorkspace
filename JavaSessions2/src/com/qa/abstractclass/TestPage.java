package com.qa.abstractclass;

public class TestPage {

	public static void main(String[] args) {
		
		LoginPage lp=new LoginPage();
		lp.footer();
		lp.header();
		lp.privacyPolicy();
		lp.logo();
		
		System.out.println("------------");
//		Page p=new LoginPage();
//		p.footer();
//		p.header();
//		p.privacyPolicy();
		
		//new Page();
	}

}
