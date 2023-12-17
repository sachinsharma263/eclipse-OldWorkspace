package com.qa.javasessions;
import java.util.Collection;
/*
 * Find Duplicate Elements in an Array-HashMap
 */
import java.util.HashMap;
import java.util.Map;

public class ArrayDuplicateElements3 {

	public static void main(String[] args) {

		int array[] = { 2, 4, 2, 5, 4 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Integer count = null;

		for (int i : array) {
			count = map.get(i);
			if (count == null) {
				map.put(i, 1);
			} else {
				count = count + 1;
				map.put(i, count);
			}
		}

		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() > 1) {
				System.out.println(m.getKey());
			}
		}
		
	}
}
