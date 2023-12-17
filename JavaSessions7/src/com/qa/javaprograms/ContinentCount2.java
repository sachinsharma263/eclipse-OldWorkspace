package com.qa.javaprograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ContinentCount2 {

	public static void main(String[] args) {

		Map<String, String> continents = new HashMap<String, String>();
		continents.put("India", "Asia");
		continents.put("Bandladesg", "Asia");
		continents.put("UK", "Europe");
		continents.put("France", "Europe");
		continents.put("Japan", "Asia");

		Map<String, Integer> continents2 = new HashMap<String, Integer>();

		Collection<String> values = continents.values();
		for (String val : values) {
			String key = val;
			if (continents2.containsKey(key)) {
				continents2.put(key, continents2.get(key) + 1);
			} else {
				continents2.put(key, 1);
			}
			
		}
		System.out.println(continents2);

	}

}
