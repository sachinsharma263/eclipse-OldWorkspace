package com.qa.interfaceconcept;

public class TestBrowser {

	public static void main(String[] args) {

		String browserName = "chrome2";
		WebDriver driver;

		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
			System.out.println("chrome lunched");
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
			System.out.println("firefox lunched");
		} else {
			try {
				throw new Exception("NoSuchBrowserFound");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();

			}
		}
	}

}
