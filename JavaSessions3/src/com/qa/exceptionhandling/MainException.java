package com.qa.exceptionhandling;

public class MainException {

	public static void main(String[] args) {

		int i=getMarks2("naveen");
		System.out.println(i);
	}

	public static int getMarks(String name) {

		if (name.equals("naveen")) {
			try {
				int i = 9 / 0;
			} catch (Exception e) {
				return -1;
			}
			
		} else if (name.equals("deepak")) {

			return 80;
		} else if (name.equals("swati")) {
			return 85;
		} else {

		}
		return -1;
	}
	public static int getMarks2(String name) {

		if (name.equals("naveen")) {
			try {
				int i = 9 / 0;
				return 0;
			} catch (Exception e) {
				return -1;
			}
			finally {
				return -2;
			}
		} else if (name.equals("deepak")) {

			return 80;
		} else if (name.equals("swati")) {
			return 85;
		} else {

		}
		return -1;
	}
	
	
}
