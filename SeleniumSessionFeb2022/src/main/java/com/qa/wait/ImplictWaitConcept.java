package com.qa.wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplictWaitConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://app.hubspot.com/signup");

		driver.findElement(By.linkText("Sign in")).click();;
		
		driver.findElement(By.id("username")).sendKeys("test@gail.com");//e1
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);//nullify implicit wait
		
		//e2
		//e4
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
