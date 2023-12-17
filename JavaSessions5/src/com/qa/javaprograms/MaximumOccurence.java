package com.qa.javaprograms;

import java.util.HashMap;
import java.util.Map;

/*
 * Program to find Maximum Occurring Character in String by using Map
 */
public class MaximumOccurence {

	public static void main(String[] args) {

		String str = "aabbccc";
		int max = 0;
		char maxChar = 0;

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		char c[] = str.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (map.containsKey(c[i])) {
				map.put(c[i], map.get(c[i]) + 1);
			} else {
				map.put(c[i], 1);
			}

		}

		for (Map.Entry<Character, Integer> m : map.entrySet()) {

			if (m.getValue() >= max)
				;
			{
				max = m.getValue();
				maxChar = m.getKey();
			}
		}
		System.out.println("maximum occurence character is:" + maxChar + " and occurence is " + max);
	}

}
