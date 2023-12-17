package com.qa.popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Task is how to handle JS pop up 
 * JavaScript alert-message-JS pop up
 * @author Dell
 *
 */
public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		WebElement signIn = driver.findElement(By.name("proceed"));//creating web element

		signIn.click();//performing action on web element
		
		Alert alert;
		
		alert=driver.switchTo().alert();
		
		String text=alert.getText();
		
		if (text.equals("Please enter a valid user name")) {
			Thread.sleep(3000);
			//alert.accept();
		}
		
		alert.dismiss();
		
		
		
		
	}
}
