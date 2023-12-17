package com.qa.javasessions;

import java.util.Collection;
import java.util.HashMap;

public class NumberOfContinents {

	public static void main(String[] args) {

		HashMap<String, String> continents = new HashMap<String, String>();

		continents.put("india", "asia");
		continents.put("bangladesh", "asia");
		continents.put("england", "europe");
		continents.put("ireland", "europe");

		Collection<String> value = continents.values();

		HashMap<String, Integer> continentsCount = new HashMap<String, Integer>();
		for (String string : value) {
			if (continentsCount.containsKey(string)) {
				continentsCount.put(string, continentsCount.get(string) + 1);
			} else {
				continentsCount.put(string, 1);
			}
		}
		System.out.println(continentsCount);
	}
}
