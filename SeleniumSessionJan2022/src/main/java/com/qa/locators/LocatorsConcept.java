package com.qa.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * findElement:The first matching element on the current page
 * @author Dell
 *
 */
public class LocatorsConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/signup");

		driver.findElement(By.linkText("Sign in")).click();

		Thread.sleep(3000);

		// Locators: 8 types of locators used to interact with web element

		// 1. id:

		// 1st approach :creating webelement and performing action in same line
//		driver.findElement(By.id("username")).sendKeys("Test@gmil.com");
//		driver.findElement(By.id("password")).sendKeys("test123");
//		driver.findElement(By.id("loginBtn")).click();

		// 2nd approach: creating webelemnt and assigning to webelement variable .
		// Perform action on webelement in another line
		WebElement emaidID = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));

		emaidID.sendKeys("test@gmail.com");
		password.sendKeys("test@123");
		loginBtn.click();

		//2. name:
		
		driver.findElement(By.name("username"));
		
		//3. className:
		//form-control private-form__control login-email
		//form-control private-form__control login-password m-bottom-3
		driver.findElement(By.className("login-email"));
		driver.findElement(By.className("login-password m-bottom-3"));
		
		
		
		//4. xpath: address of web element inside the DOM, but its not a property
		driver.findElement(By.xpath("//*[@id='username']"));
//		///*[@id="username"] //*[@id="username"] //*[@id="username"] //*[@id="username"] //*[@id="username"]
		
		//5. cssselectors:its a locator but not an element property
		driver.findElement(By.cssSelector("#username"));
		
		//6. linkText:only for links
		// html tag should be <a>
		driver.findElement(By.linkText("Sign up")).click();
		
		//7. partial link text: only for links but you can pass partial link text of the link
		driver.findElement(By.partialLinkText("Sign"));
		
		//8. tagName
		driver.findElement(By.tagName("a"));
		
		
		
	}
}
