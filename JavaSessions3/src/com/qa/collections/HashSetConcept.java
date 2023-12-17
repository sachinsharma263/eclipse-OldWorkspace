package com.qa.collections;
/*
 * in set no insertion order maintained
 * no duplicate value
 * 
 * arraylist-when maintaing order is important or insert duplicate values
 * hashset-when no duplicate value/want unique values 
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();

		set.add("naveen");
		set.add("rahul");
		set.add("mukesh");
		set.add("naveen");
		
		System.out.println(set.size());
		System.out.println(set2.size());

		System.out.println(set);

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String text = itr.next();
			System.out.println(text);
		}
	}

}
