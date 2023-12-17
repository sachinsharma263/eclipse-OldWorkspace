package com.qa.interfaceconcept;

public interface WebDriver {

	int time_out = 20;

	public void launchBrowser();

	public void getTitle();

	public void click();

	public void closeBrowser();

	// cannot create object of an interface
	// only method declaration-only method prototype
	// no method body
	// no static method in interface
	// no final method inside interface
	// variables inside interface are by default public static final

	// 1. from jdk 1.8 we can have a default method with method body inside interface
	default void run() {
		System.out.println("WebDriver--run");
	}

	// 2. we can have static method in interface with a method body
	public static void visual() {
		System.out.println("WebDriver--visual");
	}

}
