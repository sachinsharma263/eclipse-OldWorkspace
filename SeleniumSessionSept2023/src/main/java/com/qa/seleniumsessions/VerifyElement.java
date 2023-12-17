package com.qa.seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyElement {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		WebElement signUpLink=driver.findElement(By.linkText("Sign up"));
		
		if (signUpLink.isDisplayed()) {
			System.out.println("element is present");
		}
		
		List<WebElement> sinUpLinkList=driver.findElements(By.linkText("Sign up"));
		
		if (sinUpLinkList.size()>0) {
			System.out.println("element is present");
		}
		else {
			System.out.println("element is not present");
		}
		
	}

}
