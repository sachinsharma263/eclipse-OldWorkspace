package com.qa.methodoverloading;
/**
 * Polymorphism- poly means many 
 * morphism-many forms
 * Ploymorphism in java can be achieved by either method overloading or method overriding
 * 
 * Method Overloading-is within the same class, when we have different methods with the same name but with
 * different parameters
 * diff types of parameter
 * diff sequence of parameters
 * 
 * method overloading is also called compile time polymorphism because at time time compiler decides which method to call, compiler is not confused
 * super happy taking decesion.At compile time compiler binds method against statement to call method.
 * also called early binding
 * 
 * Method Overriding- it can be achieved during inheritance When a method in a subclass has the same name, same parameters or signature, 
 * and same return type(or sub-type) as a method in its super-class, then the method in the subclass is said to override the method in the super-class.
 * Method overriding is one of the way by which java achieve Run Time Polymorphism.At run time java will decide which method to call,it is also called 
 * late binding
 * @author Dell
 *
 */
public class LoginPage {

	public static void main(String[] args) {
		
		LoginPage lp=new LoginPage();
		//lp.login();
		//lp.loginWithOtp(otp);
		//lp.loginWithUserPass(username, password);
		
		lp.login();
		lp.login("apple", "apple");
	}
//	
//	public void login()
//	{
//		//login with 0 param
//	}
//	public void loginWithUserPass(String username,String password)
//	{
//		//login with 2 param
//	}
//	public void loginWithOtp(int otp)
//	{
//		
//	}
//	//above: is this right way of writing code-the answer is no
//	//you can create many methods with different name but this is not a right practice

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

	public void login(long phone) {
		System.out.println("login with 1 param");
	}

	public void login(String username, long phone) {
		System.out.println("login with 2 param");
	}

	public void login(long phone, String username) {
		System.out.println("login with 2 param");
	}

}
