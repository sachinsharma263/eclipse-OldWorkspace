package com.qa.exceptionhandling;

public class TryCatchBlock {

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("B");

		try {
			int i = 9 / 0;
			int a[]=new int[2];
			a[2]=0;
		}

		catch (NullPointerException e) {
			System.out.println("some exception occured");
			// e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("some exception occured");
			// e.printStackTrace();
			System.out.println(e.getMessage());
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("some exception occured");
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}

		catch (Exception e) {
			System.out.println("some exception occured");
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}

		System.out.println("C");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


}
