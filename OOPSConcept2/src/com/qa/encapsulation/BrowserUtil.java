package com.qa.encapsulation;

public class BrowserUtil {

	public void launchBrowser() {
		System.out.println("launchBrowser");
		isBrowserExist();
		System.out.println("launched Browser");
	}

	private void isBrowserExist() {
		System.out.println("isBrowserExist");
		checkOSComptability();
	}

	private void checkOSComptability() {
		System.out.println("checkOSComptability");
		checkRamAllocated();
	}

	private void checkRamAllocated() {
		System.out.println("ramAllocated");
	}
}
