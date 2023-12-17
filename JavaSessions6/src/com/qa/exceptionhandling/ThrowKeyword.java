package com.qa.exceptionhandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		try {
			throw new Exception("NoDataFoundException");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		String data = "";//data is empty

		if (data.equals("")) { //data.equals("")
			try {
				throw new Exception("DataNotAvailable");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}

}
