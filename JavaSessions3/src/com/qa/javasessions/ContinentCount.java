package com.qa.javasessions;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * Suppose I have above HashMap of Countries and Continent. So my requirement is in output a Map should be returned with count of countries with continent...
for example output should be like {Asia=3, Europe=2,}

 */
public class ContinentCount {

	public static void main(String[] args) {

		HashMap<String, String> countries = new HashMap<String, String>();
		countries.put("India", "Asia");
		countries.put("srilanka", "Asia");
		countries.put("Bangladesh", "Asia");
		countries.put("England", "Europe");
		countries.put("Ireland", "Europe");

		HashMap<String, Integer> continent = new HashMap<String, Integer>();

		Collection<String> vals = countries.values();

		for (String value : vals) {
			continent.put(value, continent.getOrDefault(value, 0) + 1);
		}
		System.out.println(continent);

	}

}
