package com.qa.actionsclass;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));

		// rightClickMe.click();

		Actions action = new Actions(driver);

		action.contextClick(rightClickMe).build().perform();

		List<WebElement> optionList = driver
				.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));//// ul[@class='context-menu-list
																										//// context-menu-root']/li[contains(@class,'context-menu-icon')]

		System.out.println(optionList.size());
		for (int i = 0; i < optionList.size(); i++) {

			String text = optionList.get(i).getText();
			System.out.println(i + "-->" + text);
		}
		System.out.println("-------------------");
		for (int i = 0; i < optionList.size(); i++) {

			String text = optionList.get(i).getText();
			System.out.println(i + "-->" + text);

			if (text.equals("Copy")) {
				optionList.get(i).click();
				Alert alert = driver.switchTo().alert();
				alert.accept();

				// break;
				System.out.println("accepted");
			}
			System.out.println("accepted2");
		}

	}

}
