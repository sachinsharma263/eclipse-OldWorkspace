package com.qa.encapsulation;

/*
 * Encapsulation-how i am going to use in the form of coding
 */
public class Company {

	String name;
	String ceoName;
	int totalEmp;
	private String policy;//this string policy i dnt want to expose to anyone so i will declare it as private,now it wnt be access directly outside class
	//scope within the class -->thats why getter and setter comes into picture
	//we are accessing private variable indirectly
	//we have created wrappers(method) //wrapped private variable inside method
	//user can access public variable but wont private
	//we have created a layer on top of  variable -getter and setter

	public Company(String name, String ceoName, int totalEmp, String policy) {
		this.name = name;
		this.ceoName = ceoName;
		this.totalEmp = totalEmp;
		this.policy = policy;
	}

	public Company() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCeoName() {
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}

	public int getTotalEmp() {
		return totalEmp;
	}

	public void setTotalEmp(int totalEmp) {
		this.totalEmp = totalEmp;
	} 

	public String getPolicy() {
		return policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}

	
}
