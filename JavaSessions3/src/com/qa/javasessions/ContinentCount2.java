package com.qa.javasessions;

import java.util.Collection;
import java.util.HashMap;

public class ContinentCount2 {

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("India", "Asia");
		hm.put("bangladesh", "Asia");
		hm.put("England", "Europe");
		hm.put("Ireland", "Europe");
		hm.put("Srilanka", "Asia");

		HashMap<String, Integer> continent = new HashMap<String, Integer>();

		Collection<String> value = hm.values();

		for (String string : value) {
			if (continent.get(string) == null) {
				continent.put(string, 1);
			} else {
				continent.put(string, continent.get(string) + 1);

			}
		}
		System.out.println(continent);
	}
}
