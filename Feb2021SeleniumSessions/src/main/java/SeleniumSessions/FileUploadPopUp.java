package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\Dell\\Downloads\\images.png");
		
		//type = "File"
		
		
	}

}