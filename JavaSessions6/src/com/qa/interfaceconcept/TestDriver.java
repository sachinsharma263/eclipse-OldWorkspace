package com.qa.interfaceconcept;

public class TestDriver {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.launch();
		driver.getTitle();
		driver.click();
		driver.closeBrowser();
		
		System.out.println(driver.time_out);
		
		driver.run();

		Protractor p = new ChromeDriver();
		p.launchUrl();
		p.maximize();

		ChromeDriver cd = new ChromeDriver();
		cd.launch();
		cd.getTitle();
		cd.click();
		cd.closeBrowser();

		cd.launchUrl();
		cd.maximize();

		cd.headLess();
		cd.inCognitoMode();

		cd.getCookies();
		cd.getHeader();
		System.out.println(cd.time_out);
		
		cd.run();

		// new WebDriver(); Cannot instantiate the type WebDriver- we cannot create
		// object of an interface

		WebBrowser wb = new ChromeDriver();
		wb.getCookies();
		wb.getHeader();

		// WebDriver.time_out=10;
		System.out.println(WebDriver.time_out);
		
		WebDriver.visual();

	}
}
