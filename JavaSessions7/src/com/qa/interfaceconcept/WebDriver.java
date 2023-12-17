package com.qa.interfaceconcept;

public interface WebDriver {

	 int time_out=20;//by default variable in interface are publi static and final
//	public WebDriver()
//	{
//	Interfaces cannot have constructors	
//	}
	public void launch();

	public void getTitle();

	public void click();

	public void closeBrowser();

	// no static method in interface
	// public static void test(); we cannot overide static

	// no final method
	// public final void test();
	// in interface final and static are not allowed for methods. for final method
	// no one can override and static cant be override
	
	default void run()
	{
		System.out.println("WebDriver--run");
	}
	public static void visual() {
		System.out.println("WebDriver--visual");
	}
}
