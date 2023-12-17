package com.qa.superconcept;

public class Page {

	String header;

	public Page() {

		System.out.println("Page--default const");
	}

	public Page(String header) {

		this.header = header;
		System.out.println("Page-parametrized const");
		System.out.println(header);
	}
	public void page()
	{
		System.out.println("Page method");
	}

}
