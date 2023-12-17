package com.qa.interfaceconcept;

public interface WebDriver {

	public static final int time = 0;

	public void launchBrowser();

	public void getTitle();

	public void click();

	public void closeBrowser();

	default void run() {
		System.out.println("WebDriver-- default run method");
	}

	public static void visual() {
		System.out.println("WebDriver--visual");
	}
}
