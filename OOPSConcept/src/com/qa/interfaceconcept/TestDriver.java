package com.qa.interfaceconcept;

public class TestDriver {

	public static void main(String[] args) {

		ChromeDriver cd = new ChromeDriver();

		System.out.println("through chromedriver reference:" + "\n"
				+ "inherited method from WebDriver interface or overidden method");
		cd.launchBrowser();
		cd.getTitle();
		cd.click();
		cd.close();
		System.out.println("inherited method from protractor interface or overidden method:");
		cd.launchUrl();
		cd.maximize();

		System.out.println("special method of chromedriver class or non overidden method");
		cd.incognito();
		cd.headless();

		System.out.println("inherited method from webbrowser class");
		cd.getCookies();// overriden method
		cd.getHeader();// inherited method

		System.out.println("inherited method from webdriver");
		cd.run();

		WebDriver.visual();

		System.out.println("top or up casting--------------------");

		WebDriver driver = new ChromeDriver();

		driver.launchBrowser();
		driver.getTitle();
		driver.click();
		driver.close();

		System.out.println("------------------");

		Protractor protractor = new ChromeDriver();
		protractor.launchUrl();
		protractor.maximize();

		// we cannot create object of an interface
		// new WebDriver();//Cannot instantiate the type WebDriver

		System.out.println("------------------");

		WebBrowser wb = new ChromeDriver();
		wb.getCookies();
		wb.getHeader();

		// cd.default_time_out=20;
		System.out.println(WebDriver.default_time_out);

	}
}
