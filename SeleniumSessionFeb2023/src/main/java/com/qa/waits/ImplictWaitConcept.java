package com.qa.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.utils.GenericMethods;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplictWaitConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/signup");

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);// implict wait will be applied for all the web
		// element by default

		 driver.findElement(By.linkText("Sign in")).click();
		//GenericMethods.getElement(driver, By.linkText("Sign in")).click();

		// Thread.sleep(3000);//static wait

		// global wait only for web element not for title

		driver.findElement(By.id("username")).sendKeys("test@gmail.com");// e1
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);// nullify implict wait
		driver.findElement(By.id("password")).sendKeys("test@123");// e2

		// page is rendered on the browser

	}
}
