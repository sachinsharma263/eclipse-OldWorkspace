package com.qa.javasessions;

import com.qa.collections.ArrayListConcept;

public class TestPage {

	public static void main(String[] args) {

		Page p1 = new Page();// directly create object of Page class inside TestPage class because Page class is in same package
		p1.title = "facebbok";
		System.out.println(p1.title);

		Employee e1 = new Employee();
		e1.name = "naveen";

		ArrayListConcept ar = new ArrayListConcept();// import com.qa.collections.ArrayListConcept; because
														// ArrayListConcept class is in different package

	}
}
