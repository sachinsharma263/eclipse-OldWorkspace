package com.qa.encapsulation;

public class Company {

	String name;
	String ceoName;
	int totalEmp;
	private String policy;

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
