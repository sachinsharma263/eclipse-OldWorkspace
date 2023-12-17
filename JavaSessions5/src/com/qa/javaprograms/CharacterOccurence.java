package com.qa.javaprograms;

public class CharacterOccurence {

	public static void main(String[] args) {

		int count = getCharacerOccurence("i love coding", 'i');
		System.out.println("maximum occurence character " + "i" + ": " + count);
	}

	public static int getCharacerOccurence(String str, char c) {

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (c == str.charAt(i)) {
				count++;
			}

		}
		return count;
	}
	public static int getCharacterOccurence2(String str,char c) {
		
		int count = 0;
		
		char carr[]=str.toCharArray();
		
		for(char ch:carr)
		{
			if (c==ch) {
				count++;
			}
			
		}
		return count;
	}

}
