package com.qa.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcept {

	public static void main(String[] args) {

		HashSet set = new HashSet();
		set.add("1");
		set.add("naveen");
		set.add(true);
		set.add("naveen");
		set.add(null);
		set.add(null);

		System.out.println(set.size());
		System.out.println(set);

		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}
}
