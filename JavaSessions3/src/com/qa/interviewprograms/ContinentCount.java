package com.qa.interviewprograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class ContinentCount {

	public static void main(String[] args) {

		HashMap<String, String> continent = new HashMap<String, String>();

		continent.put("India", "Asia");
		continent.put("Bangladesh", "Asia");
		continent.put("SriLanka", "Asia");
		continent.put("England", "Europe");
		continent.put("Ireland", "Europe");

		HashMap<String, Integer> continentCount = new HashMap<String, Integer>();

		Collection<String> value = continent.values();

		/*
		 * for (String val : value) { if (continentCount.containsKey(val)) {
		 * continentCount.put(val, continentCount.get(val) + 1); } else
		 * continentCount.put(val, 1); } System.out.println(continentCount);
		 */

		/*
		 * for (String string : value) { if (continentCount.get(string) == null) {
		 * continentCount.put(string, 1); } else
		 * 
		 * continentCount.put(string, continentCount.get(string) + 1);
		 * 
		 * } System.out.println(continentCount);
		 */
		for (String string : value) {
			continentCount.put(string, continentCount.getOrDefault(string, 0) + 1);
		}
		System.out.println(continentCount);
	}

}
