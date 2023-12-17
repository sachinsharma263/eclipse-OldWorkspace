package com.qa.javasessions;

public class Employee {

	String name;
	int age;
	int empId;
	String deptname;
	long phnNumber;
	char gender;
	boolean isActive;
	double salary;

	public static void main(String ar[]) {

		Employee e1 = new Employee();

		e1.name = "naveen";
		e1.age = 30;
		e1.empId = 101;
		e1.deptname = "QA";
		e1.phnNumber = 9999999999l;
		e1.gender = 'm';
		e1.isActive = true;

		Employee e2 = new Employee();
		e2.name = "mukesh";
		e2.age = 35;

		System.out.println(e1.name + " " + e1.age + " " + e1.empId + " " + e1.deptname + " " + e1.phnNumber+" "+e1.gender+" "+e1.isActive);
		System.out.println(e2.name + " " + e2.age + " " + e2.empId + " " + e2.deptname + " " + e2.phnNumber+" "+e2.gender+" "+e2.isActive);
		
		Employee e3=new Employee();
		System.out.println(e3.name + " " + e3.age + " " + e3.empId + " " + e3.deptname + " " + e3.phnNumber+" "+e3.gender+" "+e3.isActive+" "+e3.salary);
		
		new Employee();
		new Employee().name="swati";
		
		
	}

}
