package com.qa.javasessions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * An array of String type consists of duplicate values
 * requirement:my requirement is to print only unique values
 */
public class ArrayUniqueValues {

	public static void main(String[] args) {

		String array[] = { "first", "second", "third", "first", "fourth", "third" };

		Set<String> set = new HashSet<String>();

		for (int i = 0; i < array.length; i++) {
			set.add(array[i]);
		}

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String values = itr.next();
			System.out.println(values);

		}
	}

}
