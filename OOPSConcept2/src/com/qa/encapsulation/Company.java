package com.qa.encapsulation;

public class Company {

	String name;
	int totalEmp;
	String ceoName;
	private String policy;// scope of private variable policy is within class

	public Company(String name, int totalEmp, String ceoName, String policy) {
		this.name = name;
		this.totalEmp = totalEmp;
		this.ceoName = ceoName;
		this.policy = policy;
	}

	public Company() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		Company obj=new Company();
//		obj.name="Google";
//		obj.totalEmp=10000;

		// Company obj2=new Company("Google",10000,"Sundar pichai","financial");

		// getter and setter for each class variable

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalEmp() {
		return totalEmp;
	}

	public void setTotalEmp(int totalEmp) {
		this.totalEmp = totalEmp;
	}

	public String getCeoName() {
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}

	public String getPolicy() {
		return policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}
}
