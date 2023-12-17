package com.qa.encapsulation;

public class BrowserUtil {

	public void launchBrowser() {
		System.out.println("launchBrowser");
		isBrowserExist();
		System.out.println("launchedBrowser");
	}

	private void isBrowserExist() {
		System.out.println("isBrowserExist");
		checkOSComptability();
	}

	private void checkOSComptability() {
		System.out.println("checkOSComptability");
		checkRAMAllocated();
	}

	private void checkRAMAllocated() {
		System.out.println("checkRAMAllocated");
	}
}
