package com.qa.collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableConcept {

	public static void main(String[] args) {

		Hashtable<String, Integer> productTable = new Hashtable<String, Integer>();
		productTable.put("Apple MacBook", 2000);
		productTable.put("Windows Hp laptop", 1500);
		productTable.put("Apple iphone", 1000);
		productTable.put("Apple iphone", 2000);

		System.out.println(productTable);
		System.out.println(productTable.get("Apple MacBook"));
		System.out.println(productTable.get("Apple MacBook2"));

		// productTable.put("Hp", null);

		//productTable.put(null, "");

		for (Map.Entry m : productTable.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
