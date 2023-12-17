package com.qa.exceptionhandling;

public class TryCatchBlock2 {

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("B");

		try {
			int n = 9 / 0;
			System.out.println("C");

		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException occured" + e.getMessage());
		}
		System.out.println("D");

		try {
			System.out.println("try without catch");
			int a[] = new int[2];
			a[2] = 1;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("disconnected");
		}
		System.out.println("E");
	}
}
