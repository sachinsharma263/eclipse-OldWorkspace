package com.qa.encapsulation;

public class BrowserUtil {

	public void bulaunchBrowser()
	{
		System.out.println("launching browser...");
		buisBrowserExists();
		System.out.println("launched browser...");
	}
	private void buisBrowserExists()
	{
		System.out.println("browser exists...");
		bucheckOSCompatible();
	}
	private void bucheckOSCompatible()
	{
		System.out.println("checking os compatiblity...");
		buisRAMAllocated();
		
	}
	private void buisRAMAllocated()
	{
		System.out.println("ram allocated...");
	}
}
