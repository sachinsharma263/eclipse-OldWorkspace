package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class QuitCloseConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		
		cd.get("http://www.google.com");
		cd.getTitle();
		
		//cd.quit();
		cd.close();
		cd.getTitle();
	}

}
