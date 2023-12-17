package com.qa.exceptionhandling;

/*
 * Requirement: can we write try without catch
 * Yes we can write try without catch,we can use finally
 * finally block will always execute whether exception occur or not
 * we can use finally but we are not catching exception,only satisfying compiler to not give syntax error so that we can execute though exception come and
 * we dnt catch
 * 
 * 
 * 
 * 
 */
public class TryCatchBlock2 {

	public static void main(String[] args) {

		int a[] = new int[2];

		try {
			a[2] = 1;//exception occurred- not handled-program terminate
			} 
		catch (Exception e) {
		} 
		finally {
			System.out.println("DB connect");

		} 
		System.out.println("A");//control wont come here

	}

}
