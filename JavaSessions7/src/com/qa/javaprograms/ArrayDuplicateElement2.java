package com.qa.javaprograms;

import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicateElement2 {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 2, 4 };

		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (set.add(arr[i]) == false) {
				System.out.println(arr[i]);
			}
		}
	}

}
