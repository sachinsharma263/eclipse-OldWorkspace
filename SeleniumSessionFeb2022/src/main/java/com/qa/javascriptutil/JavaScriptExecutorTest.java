package com.qa.javascriptutil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptExecutorTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.freshworks.com/");

		JavaScriptUtil jsutil = new JavaScriptUtil(driver);
		//jsutil.generateAlert("Hy welcome");

		Thread.sleep(5000);
		//jsutil.clickElementByJS(driver.findElement(By.xpath("/html/body/section[1]/div[2]/div/div[1]/div/a[2]")));
		
		//jsutil.drawBorder(driver.findElement(By.xpath("/html/body/section[1]/div[2]/div/div[1]/div/a[2]")));
		//jsutil.refreshBrowserByJS();
		
	
		
//		Actions a=new Actions(driver);
//		a.click(driver.findElement(By.xpath("/html/body/header/nav/div/div/div/div/a/img"))).build().perform();
//		
		//System.out.println(jsutil.getBrowserInfo());
		//System.out.println(jsutil.getPageInnerText().contains("Products"));
//
		//System.out.println(jsutil.getTitleByJS());
//		
		//jsutil.sendKeysUsingJSWithId("test@gmail.com", "test");
//		jsutil.sendKeysUsingJSWithName("", "");
		//jsutil.scrollPageDown();
		
		//jsutil.scrollIntoView(driver.findElement(By.xpath("/html/body/footer/div[1]/div/div/div[1]/div/div[2]/ul/li[13]/a")));
		
		//jsutil.flash(driver.findElement(By.xpath("/html/body/header/nav/div/div/div/div/a/img")));
	}

}
