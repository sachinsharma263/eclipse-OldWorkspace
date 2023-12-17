package com.qa.interfaceconcept;

public interface WebDriver {

	int default_time_out = 20;// by default static final

	public void launchBrowser();

	public void getTitle();

	public void click();

	public void close();

	// public static void method();

	default void run() {
		System.out.println("WebDriver--run");
	}

	public static void visual() {
		System.out.println("WebDriver--visual");
	}
}
