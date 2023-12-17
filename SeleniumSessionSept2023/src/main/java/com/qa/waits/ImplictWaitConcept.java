package com.qa.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplictWaitConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/signup");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));// implict wait is global wait will be applied
																			// for all the
		// elements by default
		// in case element is not found during implict wait then
		// org.openqa.selenium.NoSuchElementException: no such element: Unable to locate
		// element: {"method":"css selector","selector":"#username"}

		driver.findElement(By.id("hs-eu-decline-button")).click();

		driver.findElement(By.linkText("Sign in")).click();

		// Thread.sleep(3000); // static wait not a good praticse to use static wait in
		// our script because it will wait for
		// specifie time whether element is found within few seconds. by using this we
		// wre pausing our script for specifi time
		// not a good proticse bad praticse avoid using static wait

		driver.findElement(By.id("username")).sendKeys("test@gmail.com");// e1

		// e2

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));// nullify implicit wait

		// e3
	}

}
