package com.qa.encapsulation;

public class CompanyTest {

	public static void main(String[] args) {

		// Company obj=new Company();

		// 1. initialize variables
		/*
		 * obj.name="Google"; obj.totalEmp=10000; obj.ceoName="Sundar pichai";
		 * obj.policy="finacial";
		 */

		// getting object value
		// System.out.println(obj.name);

		// 2. way by using constructor

		// Company obj2 = new Company("Google", "Sundar pichai ", 10000, "financial");

		// 3.way is by creating getter and setter
		Company obj3 = new Company();
		obj3.setName("Google");
		obj3.setCeoName("Sundar pichai");
		obj3.setTotalEmp(10000);
		obj3.setPolicy("financial");

		System.out.println(
				obj3.getName() + "\n" + obj3.getCeoName() + "\n" + obj3.getTotalEmp() + "\n" + obj3.getPolicy());
		
		

	}

}
