package JavaSessions;

public class StringConcept {

	public static void main(String[] args) {

		// string is class in java not datatype but used to store data of string
		// type-anything inside "" is a string
		// string is an array of character
		// string is collection of multiple characters

		String s = "helloworld";
		
		System.out.println(s.subSequence(1, 3));
		System.out.println(s.substring(1, 3));

		int a = 10;
		int b = 20;

		System.out.println(a + b);
		System.out.println(s + a);
		System.out.println(s + a + b);
		System.out.println(s + (a + b));
		System.out.println(a + b + s);

		String s1 = "Test";
		String s2 = "Automation";
		System.out.println(s1 + s2);
		System.out.println(s1 + " " + s2);

		char c1 = 'a';
		char c2 = 'b';
		System.out.println(c1 + c2);// charater concatenation takes place on the basis of character ASCII values
		// atoz-->97 to 122
		// AtoZ-->65 to 90
		// 0to9 -->48 to 57

	}

}
