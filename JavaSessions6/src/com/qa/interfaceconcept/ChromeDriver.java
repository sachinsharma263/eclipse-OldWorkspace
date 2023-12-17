package com.qa.interfaceconcept;

public class ChromeDriver extends WebBrowser implements WebDriver,Protractor {

	@Override
	public void launch() {
		System.out.println("ChromeDriver--launch");		
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
	public void inCognitoMode() {
		System.out.println("ChromeDriver--inCognitoMode");
	}
	@Override
	public void getHeader()
	{
		System.out.println("ChromeDriver--getHeader");
	}

}
