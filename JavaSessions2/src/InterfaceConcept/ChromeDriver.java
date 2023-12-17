package InterfaceConcept;

public class ChromeDriver extends WebBrowser implements WebDriver, Protractor {

	// webdriver I
	@Override
	public void launchBrowser() {
		System.out.println("webdriver......launchBrowser");
	}

	@Override
	public void getTitle() {
		System.out.println("webdriver.......getTitle");
	}

	@Override
	public void click() {
		System.out.println("webdriver.........click");
	}

	@Override
	public void close() {
		System.out.println("webdriver.........close");
	}

	// Protractor
	@Override
	public void launchUrl() {
		System.out.println("protractor.......launchUrl");
	}

	@Override
	public void maximize() {
		System.out.println("protractor.......maximize");
	}

	public void headless() {
		System.out.println("headless");
	}

	public void incognito() {
		System.out.println("incognito");
	}

}
