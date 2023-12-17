package com.qa.javaprograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ContinentCount2 {

	public static void main(String[] args) {
		
		
		Map<String, String> countries=new HashMap<String, String>();
		
		countries.put("India", "Asia");
		countries.put("Bangladesh", "Asia");
		countries.put("China", "Asia");
		countries.put("UK", "Europe");
		countries.put("Germany", "Europe");
		
		Map<String, Integer> continents=new HashMap<String, Integer>();
		
		
	
		
		for(Map.Entry<String, String> map:countries.entrySet())
		{
			String key=map.getValue();
			if (continents.get(key)!=null) {
				continents.put(key, continents.get(key)+1);
			}
			else
			{
				continents.put(key, 1);
			}
			
		}
		System.out.println(continents);

	}

}
