package com.qa.javaprograms;

public class CharacterOccurence2 {

	public static void main(String[] args) {

		String s = "i love coding";
		getCharacerOccurence(s, 'i');
		
		int max=getCharacerOccurence2(s, 'i');
		System.out.println("character i" + " occured " + max + " times");
	}

	public static void getCharacerOccurence(String s, char c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				count++;
			}
		}
		System.out.println("charcater " + c + " occured " + count + " times");
	}

	public static int getCharacerOccurence2(String s, char c) {
		int count = 0;
		char crr[] = s.toCharArray();

		for (char ch : crr) {
			if (ch == c) {
				count++;
			}
		}
		return count;
	}

}
