package com.qa.abstractclass;

public class TestPage {

	public static void main(String[] args) {
		
		LoginPage lp=new LoginPage();
		lp.header();
		lp.footer();
		lp.privacyPolicy();
		lp.logo();
		
		System.out.println("---------");
		Page p=new LoginPage();
		p.header();
		p.footer();
		p.privacyPolicy();
		p.logo();
		
		//new Page();
		
		System.out.println("---------");
		
		new HomePage().privacyPolicy();
		new HomePage().logo();
	}

}
