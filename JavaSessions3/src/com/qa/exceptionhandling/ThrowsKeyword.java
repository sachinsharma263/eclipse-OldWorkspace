package com.qa.exceptionhandling;

public class ThrowsKeyword {

	public static void main(String[] args) throws Exception {

		ThrowsKeyword obj = new ThrowsKeyword();
		obj.launchBrowser();

	}

	public void launchBrowser() throws Exception {
		System.out.println("launchBrowser");
		checkBrowserVersion();
	}

	public void checkBrowserVersion() throws Exception {
		System.out.println("checkBrowserVersion");
		checkOS();
	}

	public void checkOS() throws Exception {
		System.out.println("checkOS");
		int i = 9 / 0;
	}
}
