package com.qa.interviewprograms;
/*
 * Program to find Maximum Occurring Character in String by using Map
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximumOccurenceOfCharacter2 {

	public static void main(String[] args) {
		
		System.out.println("Please entetr a string");
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			if(hm.get(s.charAt(i))==null)
			{
				hm.put(s.charAt(i), 1);
			}
			else {
				hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
			}
		}
		System.out.println(hm);
		int max=-1;
		char c = 0;
	
		for(Map.Entry<Character, Integer> m:hm.entrySet())
		{
		if(max<	m.getValue())
		{
			max=m.getValue();
			c=m.getKey();
		}
		}
	
		System.out.println("maximum occurence charcater is: "+c+" by "+max+" times");
	}

}
