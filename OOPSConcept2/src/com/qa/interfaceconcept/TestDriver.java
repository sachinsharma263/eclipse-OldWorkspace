package com.qa.interfaceconcept;

public class TestDriver {

	public static void main(String[] args) {

		ChromeDriver cd = new ChromeDriver();
		cd.launchBrowser();
		cd.getTitle();
		cd.click();
		cd.closeBrowser();
		
		cd.getCookies();
		cd.getHeader();

		System.out.println("-------------");

		cd.launchUrl();
		cd.maximize();

		System.out.println("---------------");

		cd.headLess();
		cd.inCognito();

		System.out.println("----------------");
		
		WebDriver driver=new ChromeDriver();
		//with top casting i can only access overriden and inherited method,special method of class whose object we created cant access
		driver.launchBrowser();
		driver.getTitle();
		driver.click();
		driver.closeBrowser();
		
		//driver.launchUrl();
		//driver.headLess();
		//driver.getCookies();
		
		System.out.println("----------------");
		
		Protractor p=new ChromeDriver();
		p.launchUrl();
		p.maximize();
		//p.launchBrowser();
		//p.getCookies();
		
		//new WebDriver();//Cannot instantiate the type WebDriver
		
		//no down casting with interface
		
		System.out.println("----------------");
		
		WebBrowser wb=new ChromeDriver();
		wb.getCookies();
		wb.getHeader();
		//wb.launchBrowser();
		
		System.out.println(WebDriver.time_out);
		System.out.println(cd.time_out);
		
		//WebDriver.time_out=10;
		
		cd.run();
		driver.run();
		
		WebDriver.visual();
		
		
		
		

	}
}
