package InterfaceConcept;

public class TestUser {

	public static void main(String[] args) {

		ChromeDriver cd = new ChromeDriver();
		cd.launchBrowser();
		cd.click();
		cd.close();
		cd.getTitle();
		cd.maximize();
		cd.launchUrl();
		cd.incognito();
		cd.headless();

		System.out.println("---------");
		// new WebDriver();

		// top/up casting
		WebDriver driver = new ChromeDriver();
		driver.launchBrowser();

		// down casting
		// ChromeDriver cd2=new WebDriver();

		cd.getCookies();
		cd.getHeader();

		System.out.println(driver.default_time_out);
		// WebDriver.default_time_out=37;

		cd.run();
		WebDriver.visual();

	}

}
