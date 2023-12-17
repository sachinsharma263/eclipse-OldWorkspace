package com.qa.superconcept;

public class LoginPage extends Page {

	String title;

	public LoginPage() {
		
		System.out.println("LoginPage-default const");
	}

	public LoginPage(String title) {

		super(title);
		super.page();
			 
		this.title = title;
		System.out.println("LoginPage-parametrized const");
		System.out.println(title);
	}
	public void loginPage()
	{
		super.page();
		System.out.println("loginPage method");
	}

}
