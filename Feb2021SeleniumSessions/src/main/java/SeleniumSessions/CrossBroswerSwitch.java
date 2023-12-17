package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBroswerSwitch {

	public static void main(String[] args) {
		
		String broswerName="chrome";
		WebDriver driver = null;
		
		switch (broswerName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			driver=new FirefoxDriver();
			break;

		case "safari":
			driver=new SafariDriver();
			break;
		default:
			System.out.println("browser not found");
			break;
		}
		driver.get("https://www.google.com");
		driver.quit();
	}

}
