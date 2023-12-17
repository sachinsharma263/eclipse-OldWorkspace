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
 *  the main difference between them is that HashMap is non synchronized i.e not thread-safe but Hashtable is synchronized i.e thread-safe. ... 
 *  Another difference is HashMap allows one null key and multiple null values but Hashtable doesn't allow null key or values.
 *  HashMap is more preferd because it allows one null key and multiple null values so in case thread safety is not an issue then one can use hashMap 
 *  over hashTable
 */
public class HashMapConcept {

	public static void main(String[] args) {

		HashMap<String, String> userMap = new HashMap<String, String>();
		Map<String, String> userMap2 = new HashMap<String, String>();

		System.out.println(userMap.size());

		userMap.put("1", "naveen");
		userMap.put("city", "delhi");
		userMap.put("country", "india");
		userMap.put("city", "mumbai");

		System.out.println(userMap.size());
		System.out.println(userMap);

		System.out.println(userMap.get("1"));
		System.out.println(userMap.get("2"));

		userMap.put(null, "usa");

		System.out.println(userMap.size());
		System.out.println(userMap.get(null));

		userMap.put(null, "uk");

		System.out.println(userMap.size());
		System.out.println(userMap.get(null));

		userMap.put("3", null);
		userMap.put("4", null);

		System.out.println(userMap.size());
		System.out.println(userMap);

		for (Map.Entry m : userMap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		Set<String> set = userMap.keySet();
		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println(userMap.get(key));

		}
	}

}
