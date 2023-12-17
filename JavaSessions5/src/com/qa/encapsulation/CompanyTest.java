package com.qa.encapsulation;

public class CompanyTest {

	public static void main(String[] args) {

		Company obj = new Company();
		obj.setName("Google");
		obj.setCeoName("Sundar pichai");
		obj.setTotalEmp(10000);

		System.out.println(obj.getName() + "\t" + obj.getCeoName() + "\t" + obj.getTotalEmp() + "\t" + obj.getPolicy());
		System.out.println(obj.name);
		
		
		//obj.policy="";
		
		obj.setPolicy("financial");
		System.out.println(obj.getPolicy());
	}
}
