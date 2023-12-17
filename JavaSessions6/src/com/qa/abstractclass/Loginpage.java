package com.qa.abstractclass;

public class Loginpage extends Page {

	@Override
	public void header() {
		System.out.println("Loginpage--header");
	}

	@Override
	public void footer() {
		System.out.println("Loginpage--footer");
	}
//	public void logo() {Cannot override the final method from Page
//		System.out.println("Loginpage--logo");
//	}

	@Override
	public void header(String s) {
		// TODO Auto-generated method stub
		
	}
	

}
