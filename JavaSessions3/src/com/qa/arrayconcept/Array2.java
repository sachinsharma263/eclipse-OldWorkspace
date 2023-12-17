package com.qa.arrayconcept;

public class Array2 {

	public static void main(String[] args) {

		int arr[] = new int[5];//

		System.out.println(arr.length);// integer array

		String arr2[] = new String[2];

		int arr3[] = { 1, 2, 3, 4, 5 };

		String cars[] = { "maruti", "hyndui", "ford" };

		System.out.println(cars[0]);

		// System.out.println(cars[3]);// java.lang.ArrayIndexOutOfBoundsException: 3

		String s[] = null;
//		System.out.println(s.length);/ java.lang.NullPointerException

		// System.out.println(s[0]);// java.lang.NullPointerException

		String s2[] = new String[2];
		System.out.println(s2[0]);
		/*
		 * if (s2[0].equals("naveen")) {//java.lang.NullPointerException
		 * 
		 * }
		 */
		
		char c[]= {'a','b'};
		
		boolean b[]=new boolean[2];
		for (boolean d : b) {
			System.out.println(d);
			
		} 
		double d[] = {0,1};
		System.out.println(d+"\n"+b);
		
		int dd[][]= {{1,2},{3,4}};
	}
}
