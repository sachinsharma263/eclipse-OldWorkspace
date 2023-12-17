package com.qa.arrayconcept;

public class TwoDArray {

	public static void main(String[] args) {

		int array[][] = new int[2][3];

		System.out.println(array.length);
		System.out.println(array[0].length);
		System.out.println(array[1].length);

		System.out.println(array);
		System.out.println(array[0]);
		System.out.println(array[1]);

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 1000);
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j]);
			}
		}
		
		int array2[][]=new int[2][];
		array2[0]=new int[2];
		array2[1]=new int[3];

	}
}
