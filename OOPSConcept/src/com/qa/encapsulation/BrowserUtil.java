package com.qa.encapsulation;

/*
 * launchBrowser method -user will click and browser launch
 * but thats nt easy,launch browser will call other methods /services
 * it takes some time,interact with OS,check how many RAM to be allocated to browser,which browser version,is compatibleF
 */
public class BrowserUtil {

	public void launchBrowser() {
		System.out.println("launching browser");
		isBrowserExist();
		System.out.println("launched browser");
	}

	private void isBrowserExist() {
		System.out.println("isBrowserExist");
		checkOSCompatibility();

	}

	private void checkOSCompatibility() {
		System.out.println("checkOSCompatibility");
		checkRAMAllocated();
	}

	private void checkRAMAllocated() {
		System.out.println("checkRAMAllocated");
	}
}
