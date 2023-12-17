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
	public void closeBrowser() {
		System.out.println("ChromeDriver--closeBrowser");
	}

	public void chromeMethod1() {
		System.out.println("ChromeDriver--chromeMethod1");
	}

	public void chromeMethod2() {
		System.out.println("ChromeDriver--chromeMethod2");
	}

	@Override
	public void protractorMethod1() {
		System.out.println("ChromeDriver--protractorMethod1");
	}

	@Override
	public void protractorMethod2() {
		System.out.println("ChromeDriver--protractorMethod2");
	}

	@Override
	public void webBrowserMethod2() {
		System.out.println("ChromeDriver--webBrowserMethod2");
	}

}
