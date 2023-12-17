package com.qa.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
 * in set insertion order is not maintained/preserved
 * duplicate values are not allowed in set.if we try to add duplicate value then no compile and runtime exception.add method will return false.
 * set remains unchanged
 * 
 * arraylist where insertion order maintain is important,duplicate values are required
 * when insertion order is not important and duplicate are not allowed only unique values required then go for set
 * 
 */
public class HashSetConcept {

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		HashSet<String> set2=new HashSet<String>();
		
		System.out.println(set.size());
		set.add("Apple");
		set.add("Google");
		set.add("Adobe");
		set.add("Tcs");
		System.out.println(set.add("Hcl"));
		set.add(null);
		
		System.out.println(set.contains("Apple"));
		
		System.out.println(set.size());
		
		System.out.println(set);
		
		System.out.println(set.add("Hcl"));
		
		set.remove("Apple");
		
		System.out.println(set.size());
		
		Iterator<String> itr=set.iterator();
		
		while(itr.hasNext()) {
			String text=itr.next();
			System.out.println(text);
		}
		
		
	}

}
