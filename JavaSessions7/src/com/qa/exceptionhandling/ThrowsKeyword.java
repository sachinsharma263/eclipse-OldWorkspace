package com.qa.exceptionhandling;

public class ThrowsKeyword {

	public static void main(String[] args) throws Exception {

		new ThrowsKeyword().launchBrowser();

	}

	public void launchBrowser() throws Exception {
		System.out.println("launchBrowser");
		checkBrowserversion();
	}

	public void checkBrowserversion() throws Exception {
		System.out.println("checkBrowserversion");
		checkOs();
	}

	public void checkOs() throws Exception{
		System.out.println("checkOs");
		int i=9/0;
	}

}
