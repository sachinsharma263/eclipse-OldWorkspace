package com.qa.interfaceconcept;

public interface WebDriver {

	int default_time_out=20;
	public void launchBrowser();
	
	public void getTitle();
	
	public void click();
	
	public void closeBrowser();
	
	default void run()
	{
		System.out.println("WebDriver--run");
	}
	public static void display() {
		System.out.println("WebDriver--display");
	}
	
	
}
