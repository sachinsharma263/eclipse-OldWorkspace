package com.qa.collections;

import java.util.Hashtable;
import java.util.Map;
/*
 * if we tried to store duplicate values  then values are replaced or overridden
 */
public class HashTableConcept {

	public static void main(String[] args) {

		Hashtable<String, Integer> productTable = new Hashtable<String, Integer>();
		Map<String, Integer> map=new Hashtable<String,Integer>();
		
		productTable.put("Apple iphone", 1000);
		productTable.put("hp laptop", 1500);
		productTable.put("Apple macbook", 2000);

		productTable.put("Apple macbook", 3000);
		
		System.out.println(productTable);
		
		System.out.println(productTable.get("Apple iphone"));
		System.out.println(productTable.get("1"));

		for (Map.Entry<String, Integer> m : productTable.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		//productTable.put(null, 1);// java.lang.NullPointerException
		//productTable.put("Apple watch", null);// java.lang.NullPointerException
	}

}
