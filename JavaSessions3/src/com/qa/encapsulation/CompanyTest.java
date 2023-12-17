package com.qa.encapsulation;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company obj=new Company();
		System.out.println(obj.name);
		
		obj.setName("Google");
		System.out.println(obj.getName());
		
		obj.setTotalEmp(10000);
		System.out.println(obj.getTotalEmp());
		
		//obj.policy;
		
		obj.setPolicy("financial");// Company.policy is private whose scope is within class,we dnt have direct access to this variable so through
		//getter and setter we are indirectly using it, getter and setter are wrpaer method, they wraped variable
		System.out.println(obj.getPolicy());
		
	}

}
