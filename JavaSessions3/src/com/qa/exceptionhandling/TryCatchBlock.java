package com.qa.exceptionhandling;

public class TryCatchBlock {

	public static void main(String[] args) {

		System.out.println("A");
		try {
			int n = 9 / 0; // java.lang.ArithmeticException: / by zero
			System.out.println("B");
		} /*
			 * catch (Exception e) { // TODO: handle exception }
			 */  
		catch (NullPointerException e) {
			System.out.println("some exception occured " + e.getMessage());
			e.printStackTrace();
		} catch (Throwable e) {
		}
		System.out.println("C");

		int a[] = new int[2];
		try {
			a[2] = 1;
		} catch (Exception e) {
		}
		System.out.println("D");

	}
}
