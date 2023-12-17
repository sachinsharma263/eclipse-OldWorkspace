package com.qa.polymorphism.methodoverloading;

/*
 * login method is an overloaded method
 * login method -all methods same concept/feature to login but implemntation is different
 * user is having more flexibilty now, user can login with username and password,can login with username and otp etc
 * login method is having different forms
 * return type can be different
 * 
 * */
public class LoginPage {

//	public void login() {
//		// login with 0 param
//	}
//
//	public void loginWithUserPass(String username, String password) {
//		// login with 2 param
//	}
//
//	public void loginWithOtp(int otp) {
//		// login with 1 param
//	}
	// above: is this right way of writing code-the answer is no
	// you can create many methods with different name but this is not a right
	// practice so we will overload this method

	public void login() {
		System.out.println("login with 0 param");
	}

	public void login(int otp) {
		System.out.println("login with 1 param");
	}

	public boolean login(String username, String password) {
		System.out.println("login with 2 param");

		return true;
	}

	public void login(long phn) {
		System.out.println("login with 1 param");
	}

	public void login(String username) {
		System.out.println("login with 1 param");
	}

	public void login(String username, long phn) {
		System.out.println("login with 2 param");
	}

	public void login(long phn, String username) {
		System.out.println("login with 2 param");
	}

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();
		lp.login("", "");
		lp.login();
		lp.login(123);
		lp.login("");
		lp.login(1, "");
		
	}

}
