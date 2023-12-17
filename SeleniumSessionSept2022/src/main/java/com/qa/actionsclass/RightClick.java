package com.qa.actionsclass;

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

		List<WebElement> list = driver.findElements(By
				.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]/span"));

		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			String text = list.get(i).getText();
			System.out.println(text);

			if (text.equalsIgnoreCase("copy")) {
				list.get(i).click();
				Thread.sleep(3000);
				//break;
				Alert alert=driver.switchTo().alert();
				alert.accept();
				driver.switchTo().defaultContent();
			}
		}

	}

}
