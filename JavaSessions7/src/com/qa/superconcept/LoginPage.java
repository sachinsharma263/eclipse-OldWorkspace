package com.qa.superconcept;

public class LoginPage extends Page {

	String loginPageTitle;

	public LoginPage() {
		System.out.println("LoginPage--default const");
	}
	public LoginPage(String loginPageTitle) {
		super(loginPageTitle);
		super.getName();
		System.out.println("LoginPage--1 param const");
		this.loginPageTitle = loginPageTitle;
		
	}
	
	public void getClassName() {
		//super();
		super.getName();
		System.out.println("getClassName");
	}
	
	
}
