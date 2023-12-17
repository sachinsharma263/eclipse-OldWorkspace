package com.qa.collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable<String, Integer> productTable=new Hashtable<String,Integer>();
		
		productTable.put("apple", 2000);
		productTable.put("hp", 500);
		productTable.put("dell", 400);
		
		productTable.put("dell", 500);
		
		System.out.println(productTable);
		
		System.out.println(productTable.get("apple"));
		System.out.println(productTable.get("0"));
		
		for(Map.Entry m:productTable.entrySet())
		{
			
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
		//productTable.put(null, "");
		
		
		productTable.put(null, 1);// java.lang.NullPointerException
		productTable.put("Apple watch", null);// java.lang.NullPointerException
		
		
		
		
	}
}
