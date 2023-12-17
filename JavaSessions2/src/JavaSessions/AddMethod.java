package JavaSessions;

import java.util.Scanner;

public class AddMethod {

	public static void main(String[] args) {

		AddMethod obj = new AddMethod();
		System.out.println(100 % 200);
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter first value");
		int a = s.nextInt();
		System.out.println("Please enter second value");
		int b = s.nextInt();
		s.close();
		// System.out.println("Sum is : " + obj.addTwoNumber(a, b));
		int result = obj.addTwoNumber(a, b);
		System.out.println(result);
	}

//	public int addTwoNumber(int a, int b) {
//		int sum = a + b;
//		return sum;
//	}
	public void addTwoNumber(int a, int b) {
		int sum = a + b;

	}
}
