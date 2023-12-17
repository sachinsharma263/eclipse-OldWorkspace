package com.qa.exceptionhandling;

public class TryCatchBlock2 {

	public static void main(String[] args) {

		System.out.println("A");

		try {
			// int i = 9 / 0;
			int a[] = new int[2];
			a[2] = 10;
			System.out.println("B");
		} 
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("Bye");

		
	}

}
