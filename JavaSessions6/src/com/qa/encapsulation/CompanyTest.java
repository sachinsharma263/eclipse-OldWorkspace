package com.qa.encapsulation;

public class CompanyTest {

	public static void main(String[] args) {

		Company obj = new Company();

		obj.setName("Google");
		obj.setTotalEmp(10000);
		obj.setCeoName("Sundar pichai");
		obj.setPolicy("financial");

		System.out.println(obj.getName() + " " + obj.getTotalEmp() + " " + obj.getCeoName() + " " + obj.getPolicy());

		// obj.policy="";

		obj.setPolicy("financial policy");
		System.out.println(obj.getPolicy());
	}

}
