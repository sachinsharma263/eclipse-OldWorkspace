package com.qa.javasessions;

import java.util.HashMap;
import java.util.Map;

/*
 * Program to find Maximum Occurring Character in String by using Map
 */
public class MaxiumOccurenceCharcater2 {

	public static void main(String[] args) {

		String s = "aabbccc";

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		char ch[] = s.toCharArray();

		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		int max = 0;
		char maxChar = 0;
		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			if (max < m.getValue())
				;
			{
				maxChar = m.getKey();
				max = m.getValue();
			}

		}
		System.out.println(maxChar + "-->" + max);

	}
}
