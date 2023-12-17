package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://deliver.courseavenue.com/PopupTest.aspx");
		driver.findElement(By.id("ctl00_ContentMain_popupTest")).click();
		Thread.sleep(5000);
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentWindowId=it.next();
		System.out.println(parentWindowId);
		
		
		String childWindow=it.next();
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);
		driver.close();
		driver.switchTo().window(parentWindowId);
		driver.quit();
		System.out.println(driver.getWindowHandle());
	}

}
