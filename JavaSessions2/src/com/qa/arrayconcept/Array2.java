package com.qa.arrayconcept;

public class Array2 {

	public static void main(String[] args) {
		
		int array[]=new int[5];
		
		for (int i = 0; i < array.length; i++) {
			array[i]=(int) (Math.random()*1000);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
