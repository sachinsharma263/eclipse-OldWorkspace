package com.qa.polymorphism.methodoverloading;

/*
 * login() method-different forms/many forms/behaviour
 */
public class LoginPage {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.login();// compiler is super happy here,this is so easy for me to decide which method to
					// call,compiler binds which method to call at this line of code,compiler is
					// taking decision at compile time so this is called compile
		// time polymorphism
		lp.login(99999, " ");
		lp.login("", 999999);
	}

	public void login() {

		System.out.println("logoin with 0 param");
	}

	public boolean login(String username, String password) {

		System.out.println("logoin with 2 param");
		return true;
	}

	public void login(String username, long phn) {

		System.out.println("logoin with 2 param");
	}

	public void login(long phn, String username) {

		System.out.println("logoin with 2 param");
	}

}
