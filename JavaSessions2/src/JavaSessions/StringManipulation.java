package JavaSessions;

public class StringManipulation {

	public static void main(String[] args) {

		String s = "this is my first java code";
		System.out.println(s.length());

		int len = s.length();
		int li = 0;// li is fixed i.e always 0
		int hi = len - 1;// hi can vary depends on length of string
		int len2 = hi + 1;

		System.out.println(s.charAt(3));
		System.out.println(s.charAt(4));

		int a = 10;
		int b = 20;
		System.out.println(a == b);

		String s1 = "Hello Selenium";
		String s2 = "Hello selenium";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

		String s4 = "       hello world    ";
		System.out.println(s4);
		System.out.println(s4.trim());
		System.out.println(s4.replace(" ", ""));

		String s5 = "12-10-2021";// 12/10/2021
		System.out.println(s5.replace("-", "/"));

		String s6 = "This is java";
		System.out.println(s6.toUpperCase());
		System.out.println(s6.toLowerCase());

	}

}
