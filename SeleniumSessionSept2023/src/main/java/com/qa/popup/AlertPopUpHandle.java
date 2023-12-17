package com.qa.popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * Java Script Alert-pop up: an alert coming due to java script
 * how to handle?
 */
public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Alert alert=driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		String text=alert.getText();
		
		System.out.println(text);
		
		if (text.equals("Please enter a valid user name")) {
			alert.accept();
		}
		else {
			alert.dismiss();
		}
	}
}
