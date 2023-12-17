package com.qa.javasessions;

public class Employee {

	String name;
	int age;
	int empId;
	String deptName;
	long phoneNumber;
	boolean isActive;
	double salary;

	public static void main(String ar[]) {

		Employee e1 = new Employee();
		e1.name = "naveen";
		e1.age = 30;
		e1.empId = 123;
		e1.deptName = "QA";
		e1.phoneNumber=9999999999l;
		e1.isActive=true;
		

		System.out.println(e1.name + " " + e1.age + " " + e1.empId + " " + e1.deptName + " " + e1.phoneNumber+" "+e1.isActive+" "+e1.salary);

		Employee e2 = new Employee();
		System.out.println(e2.name + " " + e2.age + " " + e2.empId + " " + e2.deptName + " " + e2.phoneNumber+" "+e2.isActive+e2.salary);

		Employee e3 = new Employee();
		e3.name = "mukesh";
		e3.age = 32;
		e3.empId = 125;
		
		new Employee();
		
		new Employee().name="swati";

	}

}
