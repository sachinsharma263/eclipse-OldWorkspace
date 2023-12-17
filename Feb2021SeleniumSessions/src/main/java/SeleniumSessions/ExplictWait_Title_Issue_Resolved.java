package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWait_Title_Issue_Resolved {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://app.hubspot.com/signup");
//		WebDriverWait wait=new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.titleContains("Get started"));
//		System.out.println(driver.getTitle());
		
		System.out.println(GetTitle(driver, 20));
	}
	
	public static String GetTitle(WebDriver driver,int time) {
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.titleContains("Get started"));
		
		return driver.getTitle();
		
	}

}
