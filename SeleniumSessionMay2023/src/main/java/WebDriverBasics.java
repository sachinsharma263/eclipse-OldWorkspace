

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");

		System.out.println("title is:" + driver.getTitle());
	}

}
