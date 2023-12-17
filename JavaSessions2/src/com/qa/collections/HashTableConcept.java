package com.qa.collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableConcept {

	public static void main(String[] args) {
		
		//Hashtable<String, String> productPrice=new Hashtable<String,String>();
		
		Map<String, String> productPrice=new Hashtable<String, String>();
		
		productPrice.put("Dell Inspirion", "2000");
		productPrice.put("Apple Macbook", "2500");
		productPrice.put("Apple iphone", "2000");
		//productPrice.put(null, "2000");
		//productPrice.put("samsung", null);
		
		System.out.println(productPrice.size());
		System.out.println(productPrice.get("Apple iphone"));
		System.out.println(productPrice.get("Apple iphone2"));
		
	for (Map.Entry m: productPrice.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
		
	}
}
