package com.qa.exceptionhandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		try{
			throw new Exception("NODATAFOUNDEXCEPTION");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("A");
		System.out.println("-----------");
		String data="";
		
		if (data.equals("")) {
			try {
			throw new Exception("NoDataFoundException");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}}
	}

