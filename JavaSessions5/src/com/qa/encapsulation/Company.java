package com.qa.encapsulation;

public class Company {

	String name;
	String ceoName;
	int totalEmp;
	private String policy;

	public Company() {

	}

	public Company(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}

	public String getCeoName() {
		return ceoName;
	}

	public void setTotalEmp(int totalEmp) {
		this.totalEmp = totalEmp;
	}

	public int getTotalEmp() {
		return totalEmp;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public String getPolicy() {
		return policy;
	}

	public static void main(String[] args) {

		Company obj = new Company();
		obj.name = "google";

		Company obj2 = new Company("Google");
	}
}
