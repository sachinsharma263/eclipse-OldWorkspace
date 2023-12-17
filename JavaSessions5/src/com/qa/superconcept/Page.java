package com.qa.superconcept;

public class Page {
	static {
		System.out.println("static block1");
//System.exit(0);
	}
	public Page()
	{
		System.out.println("Page default const");
	}
	public Page(String title)
	{
		System.out.println("Page param const");
	}
	public void getName()
	{
		System.out.println("getName");
	}
}
