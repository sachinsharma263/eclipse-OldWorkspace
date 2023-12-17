package SeleniumSessions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LocatorsConcept {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		
	//	co.addArguments("--disable-blink-features");
		ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
       // options.addArguments("--incognito");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        
        //Instantiate Web Driver
        
		WebDriver driver=new ChromeDriver(options);
		
		//driver.get("http://app.hubspot.com/login");
		driver.get("https://app.hubspot.com/signup");
		driver.findElement(By.linkText("Sign in")).click();
		
		Thread.sleep(5000);
		
		//8 types of locators
		//1. id: -- I -- unique
//		driver.findElement(By.id("username")).sendKeys("sachinsharma263@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("bholababa");
//		driver.findElement(By.id("loginBtn")).click();
		
//		WebElement email=driver.findElement(By.id("username"));
//		WebElement password=driver.findElement(By.id("password"));
//		WebElement loginBtn=driver.findElement(By.id("loginBtn"));
//		
//		email.sendKeys("sachinsharma263@gmail.com");
//		password.sendKeys("bholababa");
//		loginBtn.click();
		
		//2. name: -- I, II
		//driver.findElement(By.name("username")).sendKeys("sachinsharma263@gmail.com");
		
		//3. className: -- IV
		//form-control private-form__control login-email
		//form-control private-form__control login-password m-bottom-3
		
//		driver.findElement(By.className("login-email")).sendKeys("sachinsharma263@gmail.com");
//		driver.findElement(By.className("login-password")).sendKeys("bholababa");
		
		//4. xpath: -- III : address of the element, but its  not a property of the element
//		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sachinsharma263@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("bholababa");
		
		//5. cssSelector:-- III:  its a locator but not an element property
		//driver.findElement(By.cssSelector("#username")).sendKeys("sachinsharma263@gmail.com");
		
		//6. linkText: only for links:
		//html tag should be <a>
		 //driver.findElement(By.linkText("Sign up")).click();
		 
		//7. partialLinkText:only for links: you can pass partial text of the link
			//html tag should be <a>
		driver.findElement(By.partialLinkText("Sign")).click();
		Thread.sleep(5000);
		System.out.print(driver.findElement(By.partialLinkText("Sign")).getText());
		
		//8. tagName
	}

}
