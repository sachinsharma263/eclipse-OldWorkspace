package com.qa.javasessions;

import java.util.HashSet;
import java.util.Set;

/*
 * Find Duplicate Elements in an Array-set interface
 */
public class ArrayDuplicateElements2 {

	public static void main(String[] args) {
		
		int array[]= {2,4,2,5,2};
		
		Set<Integer> set=new HashSet<Integer>();
		
//		for (int num : array) {
//			if (set.add(num)==false) {
//				System.out.println(num);
//			}
		//}
		for (int i = 0; i < array.length; i++) {
			if (set.add(array[i])==false) {
				System.out.println(i+"-->"+array[i]);
			}
		}
	}

}
