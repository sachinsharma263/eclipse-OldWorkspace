package com.qa.methodoverloading;

/*
 * Polymorphism- poly means many 
 * morphism-many forms
 * Ploymorphism in java can be achieved by either method overloading or method overriding
 * Method Overloading-is within class when we have different methods but with same name
 * different parameters
 * diff types of parameter
 * diff sequence of parameters
 * method overloading is also called compile time polymorphism because at time time compiler decides which method to call, compiler is not confused
 * super happy in taking decesion which method to call.At compile time compiler binds method against statement to call method.
 * also called early binding
 * 
 * we will overload login method,login is an overloaded method
 * Method Overloading:within the same class,when we have different methods with same name but 
 * with different param
 * different types of param
 * different sequence of param 
 */
public class LoginPage {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();
		lp.login();
		lp.login(999999999);
		lp.login("", "");

	}

	public void login() {
		System.out.println("login with 0 param");
	}

	public boolean login(String username, String password) {
		System.out.println("login with 2 param");

		return true;
	}

	public void login(String username, long phoneNumber) {

	}

	public void login(long phoneNumber, String username) {

	}

	public void login(int otp) {
		System.out.println("login with 1 param");
	}

}
