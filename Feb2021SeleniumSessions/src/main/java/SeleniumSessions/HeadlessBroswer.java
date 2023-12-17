package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessBroswer {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");
		
		ChromeDriver driver=new ChromeDriver(co);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		FirefoxOptions fo=new FirefoxOptions();
		fo.addArguments("--headless");
		
		FirefoxDriver driver2=new FirefoxDriver(fo);
		driver2.get("http://www.google.com");
		System.out.println(driver2.getTitle());
		
		
		
		
		
		
		
		
	}

}
