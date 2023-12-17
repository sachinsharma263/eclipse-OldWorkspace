package com.qa.encapsulation;

public class Company {

	String name;
	String ceo;
	int totalEmp;
	private String policy;

	public Company(String name, String ceo, int totalEmp, String policy) {
		this.name = name;
		this.ceo = ceo;
		this.totalEmp = totalEmp;
		this.policy = policy;
	}

	public Company() {
	}

	// getters and setters for each class variable
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
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
