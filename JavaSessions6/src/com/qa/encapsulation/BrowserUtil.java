package com.qa.encapsulation;

public class BrowserUtil {

	public void launchBrowser() {
		System.out.println("launching browser");
		checkBrowserVersion();
		System.out.println("launched browser");
	}

	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion");
		checkOsCompatability();

	}

	private void checkOsCompatability() {
		System.out.println("checkOsCompatability");
		checkRamAllocated();
	}

	private void checkRamAllocated() {
		System.out.println("checkRamAllocated");
	}
}
