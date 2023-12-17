package JavaSessions;

public class ConditionalStatements {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		if (a > b) {
			System.out.println("a is greater than b");
		} else {

			System.out.println("b is greater than a");
		}

		if (true) {
			System.out.println("always executed");
		} else {
			System.out.println("");
		}

		// > > >= <= !=

		if (a >= b) {
			System.out.println("hi");
		}
		if (a != b) {
			System.out.println("hy");
		}
		if (!false) {
			System.out.println("hyyyy");
		}

		String s1 = "Selenium";
		String s2 = "selenium";
		if (s1.equals(s2)) {
			System.out.println("both are equals");
		} else {
			System.out.println("both are not equals");

		}
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("both are equals");
		} else {
			System.out.println("both are not equals");

		}

		int total = 201;
		int finalAmount = 0;
		if (total <= 100) {
			finalAmount = total + 10;
		}
		if (total > 100 && total <= 200) {
			finalAmount = total + 20;
		}
		System.out.println(finalAmount);

		int x = 100;
		int y = 200;
		int z = 300;

		if (x > y && x > z) {
			System.out.println("x is greater");

		} else if (y > z) {
			System.out.println("y is greater");
		} else {
			System.out.println("z is greater");
		}

		String s = "Malini";
		int marks = 0;
		if (s.equals("Malini")) {
			marks = 95;

			System.out.println(s + " marks is" + marks);
			if (marks >= 90) {
				System.out.println(s + " awarded schlorship");
			}
		} else if (s.equals("Sachin")) {
			marks = 80;
			System.out.println(s + "marks is" + marks);
			if (marks >= 90) {
				System.out.println(s + " awarded schlorship");
			}
		} else if (s.equals("bhawna")) {
			marks = 90;
			System.out.println(s + "marks is" + marks);
			if (marks >= 90) {
				System.out.println(s + " awarded schlorship");
			}
		} else {
			System.out.println(s + " not found");
		}

	}
}
