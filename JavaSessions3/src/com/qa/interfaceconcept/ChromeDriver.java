package com.qa.interfaceconcept;

public class ChromeDriver extends WebBrowser implements WebDriver, Protractor {

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
	public void close() {
		System.out.println("ChromeDriver--close");
	}

	@Override
	public void launchUrl() {
		System.out.println("ChromeDriver--launchUrl");
	}

	@Override
	public void maximize() {
		System.out.println("ChromeDriver--maximize");
	}

	
	public void headLess() {
		System.out.println("ChromeDriver--headLess");
	}

	public void incognitoMode() {
		System.out.println("ChromeDriver--incognitoMode");
	}
	
	@Override
	public void webBrowserMethod() {
		System.out.println("ChromeDriver--webBrowserMethod");
	}

}
