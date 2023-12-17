package com.qa.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);

		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");

		WebElement boxA = driver.findElement(By.xpath("//li[text()='A']"));
		WebElement boxB = driver.findElement(By.xpath("//li[text()='B']"));

		Actions action = new Actions(driver);

		// move to element-move the mouse cursor to an element
//		action.moveToElement(boxA);
//		action.clickAndHold();
//		action.moveToElement(boxB);

		 action.contextClick(boxA);

		
		action.build().perform();

		driver.navigate().to("https://selenium08.blogspot.com/2020/01/drag-drop.html");

		WebElement element1 = driver.findElement(By.id("draggable"));
		WebElement element2 = driver.findElement(By.id("droppable"));

		action.dragAndDrop(element1, element2).build().perform();

	}
}
