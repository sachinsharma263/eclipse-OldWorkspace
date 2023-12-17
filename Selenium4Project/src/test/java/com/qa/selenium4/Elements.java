package com.qa.selenium4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elements {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);

		driver.get("https://google.com");
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("callout");
		
		driver.findElement(By.cssSelector(".M6CB1c.rr4y5c")).click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.cssSelector("#input")).sendKeys("selenium",Keys.ENTER);
		
		driver.findElement(By.linkText("Gmail")).click();
		
		driver.navigate().to("https://trytestingthis.netlify.app/");
		
		List<WebElement> list=driver.findElements(By.name("Optionwithcheck[]"));
		
		for(WebElement element:list)
		{
			System.out.println(element.getText());
		}

	}
}
