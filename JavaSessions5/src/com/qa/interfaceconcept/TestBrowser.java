package com.qa.interfaceconcept;

public class TestBrowser {

	public static void main(String[] args) {

		ChromeDriver cd = new ChromeDriver();
		cd.launchBrowser();
		cd.getTitle();
		cd.click();
		cd.closeBrowser();

		cd.launchUrl();
		cd.maximize();

		cd.headLess();
		cd.incognito();

		cd.getCookies();
		cd.getHeader();
		
		cd.run();
		WebDriver.display();
		

		System.out.println("-----------");

		WebDriver driver = new ChromeDriver();
		driver.launchBrowser();
		driver.getTitle();
		driver.click();
		driver.closeBrowser();

		// driver.launchUrl();
		// driver.getCookies();

		System.out.println("-----------");

		Protractor p = new ChromeDriver();
		p.launchUrl();
		p.maximize();

		// p.headLess();

		// new WebDriver();

		System.out.println("-----------");

		WebBrowser wb = new ChromeDriver();
		wb.getCookies();
		wb.getHeader();

		System.out.println(WebDriver.default_time_out);
		//WebDriver.default_time_out = 10;
		
		

	}
}
