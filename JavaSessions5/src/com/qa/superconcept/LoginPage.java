package com.qa.superconcept;

public class LoginPage extends Page{
	static {
		System.out.println("static block2");

	}
	public LoginPage()
	{
		
		System.out.println("LoginPage default const");
	}
	public LoginPage(String title)
	{
		super(title);
		super.getName();
		System.out.println("LoginPage param const");
	}
	public void className()
	{
		//super();
		super.getName();
		System.out.println("className");
	}
	
}
