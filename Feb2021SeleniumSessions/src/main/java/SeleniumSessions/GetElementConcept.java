package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/signup");
		driver.findElement(By.linkText("Sign in")).click();
		
		Thread.sleep(5000);
		//driver.findElement(By.id("username")).sendKeys("sachinsharma263@gmail.com");
		
		//WebElement email=driver.findElement(By.id("username"));
		//email.sendKeys("sachinsharma263@gmail.com");
		
		//By Locators
		By email=By.id("username");
		By password=By.id("password");
		By loginBtn=By.id("loginBtn");
		By signUp=By.linkText("Sign up");
		
		//webelements
		WebElement emailId=driver.findElement(email);
		WebElement pass=driver.findElement(password);
		WebElement loginB=driver.findElement(loginBtn);
		WebElement signup=driver.findElement(signUp);
		
		emailId.sendKeys("sachinsharma263@gmail.com");
		pass.sendKeys("bholababa");
		loginB.click();
		signup.isDisplayed();
	}

}
