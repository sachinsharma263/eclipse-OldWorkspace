package com.qa.collections;

import java.util.HashMap;
import java.util.Map;

public class UserData {

	public static void main(String[] args) {

		HashMap<String, String> user = new HashMap<String, String>();
		Map<String, String> userMap = new HashMap<String, String>();

		userMap.put("id", "1");
		userMap.put("name", "Tom");
		userMap.put("city", "delh");

		System.out.println(userMap.get("id"));
		System.out.println(userMap.get("name"));
		System.out.println(userMap.get(0));
		
		System.out.println(userMap.size());
		
		System.out.println(userMap);
		
		for(Map.Entry m:userMap.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
