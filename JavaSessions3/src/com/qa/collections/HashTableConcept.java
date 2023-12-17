package com.qa.collections;

/*
 * hashtable is also a kind of collection which will store data in the form of key and value pair format
 * key+value called element
 * 
 * difference btw HashMap and Hashtable:
 * Hashmap is non synchronized i.e not thread safe whereas hashtable is synchronized
 * HashMap allows one null key and multiple null values whereas Hashtable doesnt allows any null key and null value
 * HashMap generally more preferred collection over hashtable because hashmap allows  null values and make sure synchronization is not needed over there
 */
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 
 */
public class HashTableConcept {

	public static void main(String[] args) {

		Map<String, Integer> productTable = new Hashtable<String, Integer>();

		Hashtable<String, String> user2 = new Hashtable<String, String>();

		productTable.put("Apple MacBook", 2000);
		productTable.put("Windows Hp laptop", 2500);
		productTable.put("Apple iphone", 1500);

		System.out.println(productTable);
		System.out.println(productTable.get("Apple iphone"));// 1500
		System.out.println(productTable.get("Apple iphone2"));// null

		// productTable.put(null, null);

		System.out.println(productTable);

		for (Map.Entry m : productTable.entrySet()) {
			System.out.println(m.getKey() + "-->" + m.getValue());
		}
		System.out.println("--------------");
		Set<String> set=productTable.keySet();
		
		Iterator<String> itr=set.iterator();
		
		while (itr.hasNext()) {
			String key=itr.next();
			System.out.println(key+"-->"+productTable.get(key));
			
		}

	}
}
