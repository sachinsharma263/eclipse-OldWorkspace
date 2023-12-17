package com.qa.methodoverloading;
/**
 * Polymorphism- poly means many 
 * morphism-many forms
 * Ploymorphism in java can be achieved by either method overloading or method overriding
 * Method Overloading-is within class when we have different methods but with same name
 * different parameters
 * diff types of parameter
 * diff sequence of parameters
 * method overloading is also called compile time polymorphism because at time time compiler decides which method to call, compiler is not confused
 * super happy taking decesion.At compile time compiler binds method against statement to call method.
 * also called early binding
 * @author Dell
 *
 */
public class Login {

	public void login()
	{
		System.out.println("login with 0 param");
	}
	public void login(int otp)
	{
		System.out.println("login with 1 param");
	}
	public void login(String username,String password)
	{
		System.out.println("login with 2 param");
	}
	public void login(String username,Long phnNumber)
	{
		System.out.println("login with 2 param");
	}
	public int login(Long phnNumber,String username)
	{
		System.out.println("login with 2 param");
		return 1;
	}
}
