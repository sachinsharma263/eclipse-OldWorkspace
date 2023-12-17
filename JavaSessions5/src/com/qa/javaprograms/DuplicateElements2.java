package com.qa.javaprograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElements2 {

	public static void main(String[] args) {

		int arr[] = { 2, 4, 2, 5, 4 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int a : arr) {
			if (map.get(a) == null) {
				map.put(a, 1);

			} else {

			
				map.put(a, map.get(a)+1);
			}

		}
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() > 1) {
				System.out.println(m.getKey());
			}
		}
	}

}
