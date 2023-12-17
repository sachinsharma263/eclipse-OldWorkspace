package com.qa.interfaceconcept;

public interface WebDriver {

	int default_time_out = 10;// by default variable inside interface are public static final

	public abstract void launchBrowser();// by default abstract

	public void getTitle();// cant be static and final because static method cant be override and cant be
							// final because if abstract method is final then it cant be oevrride
	// and in interface if we decelare method as abstarct then overriding in
	// subclass is must

	public void click();

	public void close();

	public static void visual() {
		System.out.println("WebDriver--visual");
	}

	default void run() {
		System.out.println("WebDriver--run");
	}

}
