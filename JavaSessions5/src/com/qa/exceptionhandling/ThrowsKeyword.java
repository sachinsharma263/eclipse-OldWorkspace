package com.qa.exceptionhandling;

/*
 * The throw and throws are both keywords used in the concept of exception handling.
 * Throws is a keyword used in the method signature used to declare an exception which might get thrown by the function while executing the code.
 * The throw keyword is used to throw an exception explicitly. It can throw only one exception at a time.
 *  The throws keyword can be used to declare multiple exceptions, separated by a comma.
 */
public class ThrowsKeyword {

	public static void main(String[] args) throws Exception {

		new ThrowsKeyword().launchBrowser();
	}

	public void launchBrowser() throws Exception {
		System.out.println("launching browser");
		checkBrowserVersion();
	}

	public void checkBrowserVersion() throws Exception {
		System.out.println("checkBrowserVersion");
		checkOS();
	}

	public void checkOS() throws Exception {
		System.out.println("checkOS");
		int n = 9 / 0;
	}
}
