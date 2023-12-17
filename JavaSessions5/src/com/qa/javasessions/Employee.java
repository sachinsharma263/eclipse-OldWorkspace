package com.qa.javasessions;

/*
 * data members/class members/properties- data types/variable and
	 methods/functions
	 class properties will be shared by each class object
 */
public class Employee {

	String name;
	int age;
	int empId;
	String deptName;
	long phnNum;
	boolean isActive;

	char gender;
	float height;
	double salary;

	boolean isUSCitizen;

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.name = "Tom";
		e1.age = 30;
		e1.empId = 121;
		e1.deptName = "QA";
		e1.phnNum = 999999999;
		e1.isActive = true;

		Employee e2 = new Employee();
		e2.name = "Vaani";
		e2.age = 32;
		e2.empId = 122;

		Employee e3 = new Employee();
		e3.name = "naveen";
		e3.age = 32;
		e3.empId = 123;

		Employee e4 = new Employee();

		System.out.println(e1.name + "\t" + e1.age + "\t" + e1.empId + "\t" + e1.deptName + "\t" + e1.phnNum + "\t"
				+ e1.isActive + "\t" + e1.isUSCitizen);
		System.out.println(
				e2.name + "\t" + e2.age + "\t" + e2.empId + "\t" + e1.deptName + "\t" + e2.phnNum + "\t" + e2.isActive);
		System.out.println(
				e3.name + "\t" + e3.age + "\t" + e3.empId + "\t" + e3.deptName + "\t" + e3.phnNum + "\t" + e3.isActive);

		System.out.println("default values of primitive data types: " + "\n" + e4.name + "\t" + e4.age + "\t" + e4.empId
				+ "\t" + e4.deptName + "\t" + e4.phnNum + "\t" + e4.isActive + "\t" + e4.gender + "\t" + e4.height
				+ "\t" + e4.salary);

		new Employee();// new object created without refernce name, not a good practise,avoid creating
						// object like this
		// eligible for GC

		System.out.println(new Employee().name);

	}
}
