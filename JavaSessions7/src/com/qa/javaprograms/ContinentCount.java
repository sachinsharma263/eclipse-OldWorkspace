package com.qa.javaprograms;

import java.util.HashMap;
import java.util.Map;
/*
 *  Suppose I have above HashMap of Countries and Continent. So my requirement is in output a Map should be returned with count of countries with continent...
for example output should be like {Asia=3, Europe=2,}
 */
public class ContinentCount {

	public static void main(String[] args) {

		Map<String, String> continents = new HashMap<String, String>();
		continents.put("India", "Asia");
		continents.put("Bandladesg", "Asia");
		continents.put("UK", "Europe");
		continents.put("France", "Europe");
		continents.put("Japan", "Asia");

		Map<String, Integer> continents2 = new HashMap<String, Integer>();

		for (Map.Entry<String, String> m : continents.entrySet()) {
			String key = m.getValue();
			if (continents2.get(key) != null) {
				continents2.put(key, continents2.get(key) + 1);
			} else {
				continents2.put(key, 1);
			}

		}
		System.out.println(continents2);

	}

}
