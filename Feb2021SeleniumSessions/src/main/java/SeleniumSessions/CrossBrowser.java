package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowser {
	
	public static void main(String[] args) {
		WebDriver driver = null;
		String browserName="chrome";
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			 driver=new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			 driver=new FirefoxDriver();
		} 
		else if (browserName.equals("safari")) {
			 driver=new SafariDriver();
		}
		else{
			System.out.println("browser not found");

		}
		driver.get("https://app.hubspot.com/login");
		
	}

}
