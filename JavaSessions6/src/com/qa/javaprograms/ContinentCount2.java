package com.qa.javaprograms;

import java.util.HashMap;
import java.util.Map;

public class ContinentCount2 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("India", "Asia");
		map.put("bangladesh", "Asia");
		map.put("UK", "Europe");
		map.put("France", "Europe");
		map.put("UAE", "Asia");

		Map<String, Integer> continents = new HashMap<String, Integer>();

		for (Map.Entry<String, String> m : map.entrySet()) {
			String key = m.getValue();
			if (continents.get(key) != null) {
				continents.put(key, continents.get(key) + 1);
			} else {
				continents.put(key, 1);
			}
		}
		System.out.println(continents);

	}

}
