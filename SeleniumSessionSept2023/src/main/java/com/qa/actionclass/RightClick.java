package com.qa.actionclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

		Actions action = new Actions(driver);
		action.contextClick(rightClick).perform();

		List<WebElement> optionList = driver.findElements(By
				.xpath("//ul[@class='context-menu-optionList context-menu-root']/li[contains(@class,'context-menu-icon')]"));

		System.out.println(optionList.size());

		for (int i = 0; i < optionList.size(); i++) {
			String text=optionList.get(i).getText();
			System.out.println(text);

			if (text.equalsIgnoreCase("copy")) {
				optionList.get(i).click();
				break;
			}
		}
	}

}
