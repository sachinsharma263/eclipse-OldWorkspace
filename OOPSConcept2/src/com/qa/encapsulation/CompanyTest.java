package com.qa.encapsulation;

public class CompanyTest {

	public static void main(String[] args) {

		Company google = new Company();

		google.setName("Google");
		google.setCeoName("Sundar pichai");
		google.setTotalEmp(10000);
		google.setPolicy("finacial");

		System.out.println(google + "\n" + google.getName() + "\n" + google.ceoName + "\n" + google.totalEmp
				+ "\n" + google.getPolicy());

	}

}
