package com.qa.arrayconcept;

public class AddArray {

	public static void main(String[] args) {
		int array2[] = addArray();
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}

	public static int[] addArray() {
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 10, 20, 30, 40, 50 };

		int array[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			array[i] = a[i] + b[i];
		}

		return array;
	}
}
