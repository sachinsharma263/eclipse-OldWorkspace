package com.qa.exceptionhandling;

public class TryCatchBlock {

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("B");
		try {
			int n = 9 / 0;
			int a[]=new int[2];
			a[2]=1;

		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		catch (Exception e) {
			System.out.println("some exception got occured");
			// e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Throwable e) {
			// TODO: handle exception
		}

		System.out.println("C");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
