package InterfaceConcept;

public interface WebDriver {

	int default_time_out = 20;// by default any variable declared inside interface is static and final

	public void launchBrowser();

	public void getTitle();

	public void click();

	public void close();

	default void run() {
		System.out.println("webdriver.........run");
	}

	public static void visual() {
		System.out.println("webdriver.........visual");
	}
}
