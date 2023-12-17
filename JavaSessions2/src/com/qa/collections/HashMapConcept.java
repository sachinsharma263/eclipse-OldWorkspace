package com.qa.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Requirement:maintain user data
 * @author Dell
 *
 */
public class HashMapConcept {

	public static void main(String[] args) {
		
		HashMap<String, String> user1=new HashMap<String,String>();
		
		Map<String, String> user2=new HashMap<String,String>();
		
		user1.put("id", "1");
		user1.put("name", "naveen");
		user1.put("city", "banglore");
		user1.put(null, "Mumbai");
		user1.put(null, "Hydreabad");
		user1.put("city", "delhi");
		user1.put("city2", "delhi");
		
		
		
		
		System.out.println(user1.get("id"));
		System.out.println(user1.size());
		
		System.out.println(user1.get("job"));
		
		System.out.println("user1"+ user1);
		
		for (Map.Entry m : user1.entrySet()) {
			System.out.println(m.getKey()+"-->"+m.getValue());
		}
		System.out.println("-----------");
	
		Set<String> s=user1.keySet();
		Iterator<String> it=s.iterator();
		while (it.hasNext()) {
			String key=it.next();
			System.out.println(key+"-->"+user1.get(key));
		}
	}
}
