package com.qa.webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CFTConcept {

	public static void main(String[] args) {

		ChromeOptions co=new ChromeOptions();
		//co.setBinary("D:\\chrome-win64\\chrome-win64\\chrome.exe");
		//co.setBrowserVersion("Beta");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

		//driver.findElement(By.name("name")).sendKeys("selenium");
		System.out.println(driver.getTitle());
	}

}
