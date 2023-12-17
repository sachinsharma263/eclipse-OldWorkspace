package com.qa.interfaceconcept;

public class ChromeDriver extends WebBrowser implements WebDriver, Protractor {

	// WebDriver
	@Override
	public void launchBrowser() {
		System.out.println("ChromeDriver--launchBrowser");
		

	}

	@Override
	public void getTitle() {
		System.out.println("ChromeDriver--getTitle");
	}

	@Override
	public void click() {
		System.out.println("ChromeDriver--click");
	}

	@Override
	public void closeBrowser() {
		System.out.println("ChromeDriver--closeBrowser");
	}

	// Protractor
	@Override
	public void launchUrl() {
		System.out.println("ChromeDriver--launchUrl");

	}

	@Override
	public void maximize() {
		System.out.println("ChromeDriver--maximize");

	}

	// ChromeDriver
	public void headLess() {
		System.out.println("ChromeDriver--headless");
	}

	public void inCognito() {
		System.out.println("ChromeDriver--inCognito");
	}
	
	@Override
	public void getHeader() {
		System.out.println("ChromeDriver--getHeader");
	}
	
	

}
