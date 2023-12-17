package com.qa.arrayconcept;



public class AddArray {

	public static void main(String[] args) {

		int array[] = addArrays();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
			
		}
	}

	public static int[] addArrays() {

		int array1[] = { 1, 2, 3, 4, 5 };
		int array2[] = { 1, 2, 3, 4, 5 };

		int array3[] = new int[array1.length];

		for (int i = 0; i < array2.length; i++) {
			array3[i] = array1[i] + array2[i];
		}
		return array3;
	}

}
