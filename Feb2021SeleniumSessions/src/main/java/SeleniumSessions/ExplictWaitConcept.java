package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWaitConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		driver.get("https://app.hubspot.com/signup");
		driver.findElement(By.linkText("Sign in")).click();
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
//		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("test@123");
		presenceOfElementLocated(driver, 20, By.id("username"));
		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("test@123");
		
		presenceOfElementLocated(driver, 5, By.id("loginBtn"));
		driver.findElement(By.id("loginBtn")).click();
		
	}
	
	public static void presenceOfElementLocated(WebDriver driver,int time,By element) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
	}

}
