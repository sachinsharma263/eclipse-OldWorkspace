package com.qa.javaprograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElements2 {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 2, 4, 4 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);

			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() > 1) {
				System.out.println(m.getKey());
			}
		}
	}

}
