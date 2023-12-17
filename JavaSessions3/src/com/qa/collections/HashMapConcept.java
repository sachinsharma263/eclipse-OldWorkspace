 package com.qa.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Requirement:maintain user data
 * HashMap store value on the basis of key and value pair format
 * it will not maintain the order
 * 
 * in any map the values are stored in key and value pair. key+value form element
 * 
 * Though both Hashtable and HashMap are data-structure based upon hashing and implementation of Map interface,
 *  the main difference between them is that HashMap is not thread-safe but Hashtable is thread-safe. ... 
 *  Another difference is HashMap allows one null key and null values but Hashtable doesn't allow null key or values.
 */
public class HashMapConcept {

	public static void main(String[] args) {

		HashMap<String, String> user1 = new HashMap<String, String>();

		Map<String, String> user2 = new HashMap<String, String>();

		System.out.println(user1.size());

		user1.put("id", "1");
		user1.put("name", "Naveen");
		user1.put("city", "delhi");
		user1.put("city", "banglore");
		user1.put(null, null);
		user1.put(null, null);
		user1.put(null, null);
		user1.put(null, null);
		user1.put("age", null);

		System.out.println(user1.get("id"));
		System.out.println(user1.get(0));

		System.out.println(user1);

		System.out.println(user1.size());

		for (Map.Entry m : user1.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		//2 way to fetch values
		Set<String> keys = user1.keySet();

		Iterator<String> itr = keys.iterator();

		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println("Key-->" + key + "--"+"value" +"-->"+ user1.get(key));

		}
	}

}
