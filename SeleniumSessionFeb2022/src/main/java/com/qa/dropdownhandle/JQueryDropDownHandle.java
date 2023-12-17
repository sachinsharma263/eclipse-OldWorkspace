package com.qa.dropdownhandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDropDownHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http:www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		Thread.sleep(3000);
		driver.findElement(By.id("justAnInputBox")).click();

		// List<WebElement> choiceList =
		// driver.findElements(By.xpath("//div[@id='comboTree597290DropDownContainer']/ul/li//span[@class='comboTreeItemTitle']"));
		List<WebElement> choiceList2 = driver
				.findElements(By.xpath("//div[@id='comboTree851138DropDownContainer']//ul//li/span"));
		List<WebElement> choiceList = driver.findElements(By.cssSelector("span.comboTreeItemTitle"));

//		selectChoiceValues(driver, "choice 1");
//		selectChoiceValues(driver, "choice 6 2 3");
		selectChoiceValues(driver, choiceList2, "choice 6", "choice 6 2 3");
		// selectChoiceValues(driver, choiceList, "all");

	}

	public static void selectChoiceValues(WebDriver driver, List<WebElement> choiceList, String... value) {

		System.out.println(choiceList.size());
		if (!value[0].equalsIgnoreCase("all")) {
			for (int i = 0; i < choiceList.size(); i++) {
				for (int j = 0; j < value.length; j++) {
					if (choiceList.get(i).getText().equals(value[j])) {
						choiceList.get(i).click();
					}
				}
			}
		} else {
			for (int i = 0; i < choiceList.size(); i++) {
				try {
					choiceList.get(i).click();
				} catch (Exception e) {

				}
			}
		}

	}

}
