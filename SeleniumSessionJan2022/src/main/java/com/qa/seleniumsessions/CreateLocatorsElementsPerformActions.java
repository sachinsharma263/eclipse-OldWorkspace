package com.qa.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 3 approaches to create web element and perform actions
 * 3.1 create web element and perform action on the same line
 * 3.2 create we element in one line and perform action on next line
 * 3.3 create by locators-->create web element-->perform action on web element
 * 3.3 is best approach and best practice while designing framework,define page objects page wise. Maintenance of framework is very easy
 * @author Dell
 *
 */
public class CreateLocatorsElementsPerformActions {

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/signup");

		driver.findElement(By.linkText("Sign in")).click();

		Thread.sleep(3000);

		// 1. approach
		// 1.1 create webelement and perform action on webelement-same line

//		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("test@123");;
//		driver.findElement(By.id("loginBtn")).click();

		// 2. approach
		// 2.1 create web element
		// 2.2 perform action on web element

//		WebElement emailID=driver.findElement(By.id("username"));
//		WebElement passWord=driver.findElement(By.id("password"));
//		WebElement loginBtn=driver.findElement(By.id("loginBtn"));

//		emailID.sendKeys("");
//		passWord.sendKeys("");
//		loginBtn.click();

		// 3. approach -by locators ->create web element ->perform action on web element
		// best approach-best practice while designing framework
		// Page objects -page wise -maintenance of framework is very easy

		// 3.1 By locators
		By emailID = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");
		
		//3.2 create web element
		WebElement e1=driver.findElement(emailID);
		WebElement e2=driver.findElement(password);
		WebElement e3=driver.findElement(loginBtn);
		
		//3.3 perform action on web element
		e1.sendKeys("test@gmail.com");
		e2.sendKeys("test@123");
		e3.click();
		
		
		

	}

}
