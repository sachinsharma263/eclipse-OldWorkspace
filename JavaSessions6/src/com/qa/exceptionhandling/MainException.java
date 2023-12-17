package com.qa.exceptionhandling;

public class MainException {

	public static void main(String[] args) {

		int marks = getMarks("naveen");
		System.out.println(marks);

		System.out.println(makeConnection());
		System.out.println(makeConnection2());
	}

	public static int getMarks(String studentName) {

		if (studentName.equals("imad")) {
			try {
				int i = 9 / 0;
			} catch (Exception e) {
				return -1;
			}
		} else if (studentName.equals("naveen")) {
			return 80;
		} else {
			return 0;
		}

		return -2;
	}

	public static int makeConnection() {

		System.out.println("make connection with DB");
		try {
			int i = 9 / 0;
			return 0;
		} catch (Exception e) {
			return -1;
		} finally {
			System.out.println("DB connection closed");
			return -2;
		}
		// return 0;

	}

	public static int makeConnection2() {

		try {
			int i = 9 / 3;
			return 0;
		} catch (Exception e) {
			return -1;
		}
		finally {
			return -2;
		}
	}
}