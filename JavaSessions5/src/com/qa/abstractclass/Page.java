package com.qa.abstractclass;

public abstract class Page {

	public Page()
	{
		System.out.println("Page--const");
	}
	public abstract void header();
	
	public abstract void header(int a);
	
	public abstract void footer();
	
	public final void privacyPolicy()
	{
		
		System.out.println("Page--privacyPolicy");
	}
	public final void logo()
	{
		System.out.println("Page--logo");
	}
	
	
}
