package com.qa.encapsulation;

public class BrowserTest {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		// br.isBrowserExist();
		// br.checkOSCompatibility();
		// br.checkRAMAllocated();
		br.launchBrowser();//Browser is launched how internally other methods services are calling as a user i dnt bother

		// As a user i can see all methods--what the point of showing all methods to
		// user,it is also nt good from system point of view also
		// whenever a system developed,it is developed from customer point of view
		// here we expose entire implementation to the user
		
		br.launchBrowser();//the intelligence now showing only one method,we have hidden internal implementation
		
		

	}

}
