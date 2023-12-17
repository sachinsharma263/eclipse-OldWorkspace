package com.qa.actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/droppable/");

		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));

		WebElement src = driver.findElement(By.id("draggable"));
		WebElement des = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);

		//action.dragAndDrop(src, des).perform();

		//driver.switchTo().defaultContent();// we are inside frame and we tried to access //h1[text()='Droppable'] then
											// got nosuchelementexception because this element is not inside frame,it is
											// on web page so we use driver.switch().defaultcontent() to switch to
											// main/top window

		//System.out.println(driver.findElement(By.xpath("//h1[text()='Droppable']")).getText());
		
		action
		.clickAndHold(src)
		.moveToElement(des)
		.release()
		.perform();

	}

}
