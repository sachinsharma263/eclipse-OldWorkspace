package com.qa.interfaceconcept;

public class ChromeDriver extends WebBrowser implements WebDriver, Protractor {

	/*
	 * implemented inherited method from WebDriver Interface
	 */
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

	/*
	 * implemented unimplemented method from Protractor interface
	 */
	@Override
	public void launchUrl() {
		System.out.println("ChromeDriver--launchUrl");
	}

	@Override
	public void maximize() {
		System.out.println("ChromeDriver--maximize");
	}

	/*
	 * ChromeDriver special methods
	 */

	public void headless() {

		System.out.println("ChromeDriver--headless");
	}

	public void incognito() {

		System.out.println("ChromeDriver--incognito");
	}
	/*
	 * Overridden getCookies method from webbrowser
	 */
	@Override
	public void getCookies()
	{
		System.out.println("ChromeDriver--getCookies");
		
	}
	

}
