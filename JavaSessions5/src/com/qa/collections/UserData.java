package com.qa.collections;

import java.util.HashMap;
import java.util.Map;

public class UserData {

	public static void main(String[] args) {
		
		HashMap<String, String> userMap=new HashMap<String, String>();
		
		userMap.put("id", "1");
		userMap.put("name", "Tom");
		userMap.put("city", "banglore");
		
		System.out.println(userMap.get("id"));
		System.out.println(userMap.get("name"));
		System.out.println(userMap.get("city"));
		
		System.out.println(userMap.get(0));
		
		userMap.put("1", null);
		
		System.out.println(userMap.size());
		
		for(Map.Entry m:userMap.entrySet())
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
			
		}
	}
}
