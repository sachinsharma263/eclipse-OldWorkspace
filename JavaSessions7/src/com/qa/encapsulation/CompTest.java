package com.qa.encapsulation;

public class CompTest {

	public static void main(String[] args) {
		// 1 approach
		Company obj = new Company();
		obj.name = "Google";
		obj.ceoName = "Sundar pichai";
		obj.totalEmp = 10000;
		// obj.policy = "financial";
		System.out.println(obj.name);

		// 2
		Company obj3 = new Company("Microsoft","satya nadela",20000,"financial");

		// 3
		Company obj2 = new Company();
		obj2.setName("IBM");
		System.out.println(obj2.getName());

		obj2.setCeoName("naveen");
		System.out.println(obj2.getCeoName());

		obj2.setTotalEmp(10000);
		System.out.println(obj2.getTotalEmp());

		obj2.setPolicy("financial");
		System.out.println(obj2.getPolicy());

	}

}
