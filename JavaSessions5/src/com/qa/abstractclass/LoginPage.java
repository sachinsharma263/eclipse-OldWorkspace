package com.qa.abstractclass;

public class LoginPage extends Page {

	public LoginPage()
	{
		System.out.println("LoginPage--const");
	}
	@Override
	public void header() {
		System.out.println("LoginPage--header");

	}

	@Override
	public void footer() {
		System.out.println("LoginPage--footer");
	}
	@Override
	public void header(int a) {
		// TODO Auto-generated method stub
		
	}
//	@Override
//	public final void logo()
//	{
//		System.out.println("Page--logo");
//	}

}
