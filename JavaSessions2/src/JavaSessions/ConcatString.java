package JavaSessions;

import java.util.Scanner;

public class ConcatString {

	public static void main(String[] args) {

		ConcatString obj = new ConcatString();

		Scanner s = new Scanner(System.in);
		System.out.println("Please enter first string: ");
		String str1 = s.nextLine();
		System.out.println("Plese enter second string: ");
		String str2 = s.nextLine();
		
		System.out.println(obj.concatString(str1, str2));

	}

	public String concatString(String str1, String str2) {
		String finalString = str1 + " " + str2;
		return finalString;
	}
}
