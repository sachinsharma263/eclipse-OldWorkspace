package com.qa.encapsulation;

public class BrowserUtil {

	public void launchBrowser() {
		System.out.println("launchBrowser");
		isBrowserExist();
	}

	private void isBrowserExist() {
		System.out.println("isBrowserExist");
		checkOsCompatability();
	}

	private void checkOsCompatability() {
		System.out.println("checkOsCompatability");
		checkRAMAllocated();
	}

	private void checkRAMAllocated() {
		System.out.println("checkRAMAllocated");
	}
}
