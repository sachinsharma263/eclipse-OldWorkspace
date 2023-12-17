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
 *  Another difference is HashMap allows one null key and multiple null values but Hashtable doesn't allow null key or values.
 */
public class HashMapConcept {

	public static void main(String[] args) {

		HashMap<String, String> userData = new HashMap<String, String>();

		Map<String, String> userData2 = new HashMap<String, String>();

		System.out.println(userData.size());

		userData.put("1", "123");
		userData.put("name", "naveen");
		userData.put("city", "delhi");
		userData.put("city", "banglore");
		userData.put(null, "delhi");
		userData.put(null, "mumbai");
		userData.put(null, null);
		userData.put(null, null);

		System.out.println(userData.get("1"));
		System.out.println(userData.get("city"));
		System.out.println(userData.get(null));
		System.out.println(userData.get(0));
		System.out.println(userData);

		System.out.println(userData.size());

		for (Map.Entry m : userData.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		Set<String> keys = userData.keySet();
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println(key + "-->" + userData.get(key));
		}
	}
}
