package com.qa.exceptionhandling;

public class TryCatchBlock {

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("B");

		try {
			int i = 9 / 0;
		} catch (ArithmeticException e) {
			// TODO: handle exception
		} catch (Exception e) {

			System.out.println("some exception occured");
			System.out.println(e.getMessage());
			e.printStackTrace();
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
