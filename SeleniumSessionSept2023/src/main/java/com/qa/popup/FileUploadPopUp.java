package com.qa.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {

		//WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://cgi-lib.berkeley.edu/ex/perl5/fup.html");

		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\Dell\\Pictures\\2.png");
	}

}
