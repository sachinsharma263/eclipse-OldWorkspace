package com.qa.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * javascript_alerts-pop up :coming due to javascript code. we cannot inspect java script alert through selenium. we have to switch driver control from page
 *  to alert and then perform action on alert.
 *  js alert
 *  js alert-confirmation
 *  js alertt-prompt
 */
public class JavaScriptAlert {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// JAvascript alert
		driver.findElement(By.xpath("//button[@onClick='jsAlert()']")).click();

		Thread.sleep(3000);

		Alert alert = driver.switchTo().alert();

		if (alert.getText().equalsIgnoreCase("I am a JS Alert")) {
			System.out.println("correct message");
			alert.accept();
		} else {
			System.out.println("incorrect message");
			alert.accept();
		}

		Thread.sleep(3000); 
		driver.findElement(By.xpath("//button[@onClick='jsPrompt()']")).click();
		Alert alert2 = driver.switchTo().alert();

		Thread.sleep(3000);

		if (alert2.getText().equalsIgnoreCase("I am a JS prompt1")) {
			alert2.sendKeys("seleniumtest");
			alert.accept();
			
		}
		else {
			alert.dismiss();
		}
		if (driver.getPageSource().contains("seleniumtest")) {
			System.out.println("selenium present");
		}

	}
}
