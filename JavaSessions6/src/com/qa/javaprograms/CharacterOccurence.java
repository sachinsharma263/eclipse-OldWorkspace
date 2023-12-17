package com.qa.javaprograms;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurence {

	public static void main(String[] args) {
		
		String s="i love coding";
		
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if (map.containsKey(s.charAt(i))) {
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		
		
		
		
	

}
}
