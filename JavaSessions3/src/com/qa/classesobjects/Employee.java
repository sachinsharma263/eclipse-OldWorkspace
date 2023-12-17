package com.qa.classesobjects;

public class Employee {

	// define properties at class level
	// data members- data types and methods
	// what all properties an employee have- id,name ,age,department,isactive
	// class is nothing but a blueprint or template,class can have number of
	// properties
	// a class can have multiple objects and all objects have copy of class
	// properties

	// class properties,will be different for different employee
	
	String name;
	int age;
	int empId;
	String deptName;
	long phnNumber;
	boolean isActive;

	float salary;
	double salary2;
	char gender;

	// what employee can do
	// code
	public static void main(String[] args) {

		// int i=10; primitive data type
		Employee e1 = new Employee();// Employee e1- e1 is a variable of type Employee or e1 is a reference variable
		// e1-class type means non primitive data type

		// rhs is object, e1 is not an object,its a reference variable pointing to
		// object,e1 is name of an object
		// my body is an object refered by name sachin

		e1.name = "Naveen";
		e1.age = 30;
		e1.empId = 101;
		e1.deptName = "QA";
		e1.phnNumber = 9999999999l;

		Employee e2 = new Employee();
		e2.name = "rahul";
		e2.age = 35;
		e2.empId = 102;
		e2.deptName = "Admin";
		e2.phnNumber = 99999999;

		Employee e3 = new Employee();
		e3.name = "bhawna";
		e3.empId = 102;

		System.out.println(e1.name + " " + e1.age + " " + e1.empId + " " + e1.deptName + " " + e1.phnNumber);
		System.out.println(e2.name + " " + e2.age + " " + e2.empId + " " + e2.deptName + " " + e2.phnNumber);
		System.out.println(e3.name + " " + e3.age + " " + e3.empId + " " + e3.deptName + " " + e3.phnNumber + " "
				+ e3.isActive + " " + e3.salary + " " + e3.salary2 + e3.gender + "thats all");

		new Employee().name = "Rudra";// This is wrong pratise,object get created without reference name,eligible for GC

	}
}
