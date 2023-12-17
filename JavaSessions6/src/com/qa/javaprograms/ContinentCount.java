package com.qa.javaprograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/*
 *  Suppose I have above HashMap of Countries and Continent. So my requirement is in output a Map should be returned with count of countries with continent...
for example output should be like {Asia=3, Europe=2,}
 */
public class ContinentCount {

	public static void main(String[] args) {

		Map<String, String> countries = new HashMap<String, String>();
		countries.put("India", "Asia");
		countries.put("bangladesh", "Asia");
		countries.put("UK", "Europe");
		countries.put("france", "Europe");
		countries.put("uae", "Asia");

		Map<String, Integer> continents = new HashMap<String, Integer>();

		Collection<String> values = countries.values();

		for (String val : values) {
			if (continents.containsKey(val)) {
				continents.put(val, continents.get(val)+1);
			} else {
				continents.put(val, 1);
			}
		}
		System.out.println(continents);

	}

}
