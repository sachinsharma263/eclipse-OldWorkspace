package com.qa.interfaceconcept;

public class TestDriver {

	public static void main(String[] args) {

		ChromeDriver cd = new ChromeDriver();
		// WebDriver cd=new ChromeDriver();
		cd.launchBrowser();
		cd.click();
		cd.closeBrowser();
		cd.getTitle();

		// special method of ChromeDriver

		cd.chromeMethod1();
		cd.chromeMethod2();

		cd.protractorMethod1();
		cd.protractorMethod2();

		cd.webBrowserMethod();
		cd.webBrowserMethod2();

		cd.run();
		WebDriver.visual();
		System.out.println(WebDriver.time);
		
		//new WebDriver();

	}
}
