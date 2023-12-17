package com.qa.interfaceconcept;

public class TestDriver {

	public static void main(String[] args) {
		
		ChromeDriver cd=new ChromeDriver();
		cd.launchBrowser();
		cd.getTitle();
		cd.click();
		cd.close();
		
		cd.headLess();
		cd.incognitoMode();
		
		cd.launchUrl();
		cd.maximize();
		
		cd.webBrowserMethod();
		cd.webBrowserMethod2();
		
		cd.run();
		
		//cannot create object of an interface
		//new WebDriver();
		
		System.out.println("----------");
		//Topcasting/upcasting
		WebDriver driver=new ChromeDriver();
		driver.launchBrowser();
		driver.getTitle();
		driver.click();
		
		WebBrowser wb=new ChromeDriver();
		wb.webBrowserMethod();
		wb.webBrowserMethod2();
		
		driver.close();
		
		System.out.println(WebDriver.default_time_out);
		System.out.println(cd.default_time_out);
		
		driver.run();
		
		WebDriver.visual();
		
	}

}
