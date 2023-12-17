package com.qa.javascriptutil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.qa.utils.GenericMethods;

public class JavaScriptExecutorTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = null;

		driver = new ChromeDriver();

		// driver.get("https://www.freshworks.com/");

		driver.get("https://classic.crmpro.com/index.html");

		// driver.get("https://app.hubspot.com/login");

		JavaScriptUtil jsutil = new JavaScriptUtil(driver);
		// jsutil.generateAlert("Hy welcome");

		Thread.sleep(5000);
		// jsutil.clickElementByJS(GenericMethods.getElement(driver,By.linkText("Sign
		// up")));

		// jsutil.drawBorder(GenericMethods.getElement(driver,By.linkText("Sign up")));
		// jsutil.refreshBrowserByJS();

//		Actions a=new Actions(driver);
//		a.click(driver.findElement(By.xpath("/html/body/header/nav/div/div/div/div/a/img"))).build().perform();
//		
		// System.out.println(jsutil.getBrowserInfo());
		 //System.out.println(jsutil.getPageInnerText().contains("Products"));
//
		// System.out.println(jsutil.getTitleByJS());
//		
		// jsutil.sendKeysUsingJSWithId("username", "test");
		// jsutil.sendKeysUsingJSWithName("username", "naveen");
		// jsutil.scrollPageDown();

		//jsutil.scrollIntoView(driver.findElement(By.linkText("Forgot Password?")));

		 jsutil.flash(driver.findElement(By.xpath("//input[@type='submit']")));
	}

}
