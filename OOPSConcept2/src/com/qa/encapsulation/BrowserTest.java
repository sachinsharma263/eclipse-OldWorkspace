package com.qa.encapsulation;
/*
 * launchBrowser method -user will click and browser launch
 * but thats nt easy,launch browser will call other methods /services
 * it takes some time,interact with OS,check how many RAM to be allocated to browser,which browser version,is compatible
 */
public class BrowserTest {

	public static void main(String[] args) {

		BrowserUtil bu = new BrowserUtil();

		bu.launchBrowser();
//		bu.isBrowserExist();
//		bu.checkOSComptability();
//		bu.checkRamAllocated();
		
		

	}

}
