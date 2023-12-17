package com.qa.javaprograms;

import java.util.HashMap;
import java.util.Map;
/*
 * Program to find Maximum Occurring Character in String by using Map
 */
public class MaximumOccurence {

	public static void main(String[] args) {

		String s = "aabbccc";
		int max = 0;
		char maxChar = 0;

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i]) + 1);
			} else {
				map.put(ch[i], 1);
			}
		}

		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			if (m.getValue() > max) {
				max = m.getValue();
				maxChar = m.getKey();
			}

		}
		System.out.println("Maximum occurence charcater is " + maxChar + " by " + max + " times");
		System.out.println(map);

	}

}
