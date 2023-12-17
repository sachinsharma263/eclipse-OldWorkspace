package com.qa.collections;
/*
 * in set insertion order is not maintained
 * duplicate values are not allowed in set
 * 
 * arraylist where insertion order maintain is important,duplicate values are required
 * when insertion order is not important and duplicate are not allowed only unique values required then go for set
 * if we tried to store duplicate values in set then values are replaced or overridden
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		
		System.out.println(set2.size());
		
		set2.add("Apple");
		set2.add("Google");
		set2.add("Microsoft");
		set2.add("Hcl");
		set2.add("Tcs");
		
		System.out.println(set2.size());
		
		System.out.println(set+"\n"+set2);
		
		set2.add("Tcs");
		
		System.out.println(set2.size());
		System.out.println(set2);
		
		set2.add(null);
		set2.add(null);
		
		Iterator<String> itr=set2.iterator();
		
		System.out.println(set2);
		
		while (itr.hasNext()) {
			String value = (String) itr.next();
			System.out.println(value);
			
		}
	}
}
