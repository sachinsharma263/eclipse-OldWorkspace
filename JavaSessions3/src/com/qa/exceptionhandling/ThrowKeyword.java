package com.qa.exceptionhandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		try {
			throw new Exception("NODATAEXCEPTION");
		} catch (Exception e) {

			System.out.println("No Data Found");
			e.printStackTrace();
		}
	}
}
