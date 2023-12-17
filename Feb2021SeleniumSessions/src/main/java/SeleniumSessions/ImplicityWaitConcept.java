package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicityWaitConcept {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://app.hubspot.com/signup");
		driver.findElement(By.linkText("Sign in")).click();
		
		//Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		driver.findElement(By.id("password")).sendKeys("test@123");
	}

}
