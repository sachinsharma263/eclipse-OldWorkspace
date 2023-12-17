package com.qa.staticanonstaticconcept;

public class WebPage {

	public static void main(String[] args) {
		new WebPage().launchBrowser();
	}

	public void launchBrowser() {
		System.out.println("launchBrowser");
		launchUrl();
	}

	public void launchUrl() {
		System.out.println("launchUrl");
		click();	
	}

	public void click() {
		System.out.println("click");
	}

}
