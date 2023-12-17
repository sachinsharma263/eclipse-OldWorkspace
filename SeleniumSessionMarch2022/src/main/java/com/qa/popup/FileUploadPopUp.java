package com.qa.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/perl5/fup.html");
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\Dell\\Pictures\\2.png");
		
	}

}
