package com.qa.interfaceconcept;

public class TestBrowser {

	public static void main(String[] args) {

		WebDriver driver;// top/up casting- this driver based on some condition can point to chromedriver
							// and can also point to ff driver if condition for ff satisfy
		String browserName = "chrome";

		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();

		} else {
			driver = new FirefoxDriver();
		}

	}

}
