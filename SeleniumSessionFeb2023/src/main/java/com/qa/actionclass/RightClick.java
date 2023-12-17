package com.qa.actionclass;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

		Actions action = new Actions(driver);

		action.contextClick(rightClick).build().perform();

		List<WebElement> choiceList = driver.findElements(By
				.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]"));

		System.out.println(choiceList.size());

		for (int i = 0; i < choiceList.size(); i++) {
			String text = choiceList.get(i).getText();
			System.out.println(text);
			if (text.equalsIgnoreCase("copy")) {
				choiceList.get(i).click();
				Thread.sleep(3000);
				Alert alert = driver.switchTo().alert();
				alert.accept();
				break;
			}
		}
		

	}

}
