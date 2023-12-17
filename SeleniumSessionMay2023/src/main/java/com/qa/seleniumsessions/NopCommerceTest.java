package com.qa.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NopCommerceTest {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a")).click();
		driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/form[1]/div/div/a")).click();
		
		driver.findElement(By.id("Email")).sendKeys("aaaa@gmail.com");
		driver.findElement(By.id("FirstName")).sendKeys("aaa@gmail.com");
		driver.findElement(By.name("save")).click();
		//The new customer has been added successfully.
		
		
		if (driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]")).getText().contains("The new")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		
		
	}

}
