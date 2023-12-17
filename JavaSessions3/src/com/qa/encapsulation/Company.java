package com.qa.encapsulation;

public class Company {

	String name;
	int totalEmp;
	String ceoName;
	private String policy="test";

	public Company(String name, int totalEmp, String ceoName, String policy) {
		this.name = name;
		this.totalEmp = totalEmp;
		this.ceoName = ceoName;
		this.policy = policy;
	}

	public Company() {
		// TODO Auto-generated constructor stub
	}

	//setter and getter for each class variable
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


	public static void main(String[] args) {

		// 1.
		// Company obj = new Company();
		// obj.name = "Google";

		// 2.
		Company obj2 = new Company("Google", 10000, "Sundar pichai", "financial");

	}

	}
