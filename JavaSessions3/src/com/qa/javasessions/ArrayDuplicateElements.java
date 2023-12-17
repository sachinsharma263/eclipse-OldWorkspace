package com.qa.javasessions;
/*
 * Find Duplicate Elements in an Array-Brute force method
 */
public class ArrayDuplicateElements {

	public static void main(String[] args) {

		int a[] = { 2, 3, 2, 4, 4 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[j]);
				}
			}
		}
	}
}
