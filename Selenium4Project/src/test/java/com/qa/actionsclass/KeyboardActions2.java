package com.qa.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://google.com");
		
		WebElement textBox=driver.findElement(By.name("q"));
		
		Actions action=new Actions(driver);
		
		
		
		
		//action.keyDown(Keys.SHIFT).sendKeys(textBox, "selenium").keyUp(Keys.SHIFT).sendKeys(textBox,Keys.ENTER).build().perform();
		
		action.keyDown(Keys.SHIFT).sendKeys(textBox, "selenium").keyUp(Keys.SHIFT).build().perform();
		
		Thread.sleep(3000);
		action.click(driver.findElement(By.name("btnK"))).perform();
		
		//action.click(driver.findElement(By.name("btnK"))).perform();
		
		//action.sendKeys(textBox, "selenium"+Keys.ENTER).perform();
	}
}
