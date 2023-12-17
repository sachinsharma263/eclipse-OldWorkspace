package com.qa.dropdownhandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDropDownHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http:www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.id("justAnInputBox")).click();

		List<WebElement> choiceList = driver.findElements(
				By.xpath("//div[@class='comboTreeDropDownContainer']/ul/li//span[@class='comboTreeItemTitle']"));
		
		//List<WebElement> choiceList2=driver.findElements(By.cssSelector("span.comboTreeItemTitle"));

		System.out.println(choiceList.size());

		/*
		 * for (int i = 0; i < optionList.size(); i++) {
		 * System.out.println(optionList.get(i).getText());
		 * 
		 * } for (int i = 0; i < optionList.size(); i++) { if
		 * (optionList.get(i).getText().equalsIgnoreCase("choice 6")) {
		 * optionList.get(i).click(); } }
		 */

		// selectChoiceValues(driver, choiceList, "choice 6");
		// selectChoiceValues(driver, choiceList, "choice 6 1");

		 selectChoiceValues(driver, choiceList, "choice 2", "choice 2 1", "choice 6","choice 6 1","choice 6 2","choice 6 3");
		//selectChoiceValues(driver, choiceList, "all");

	}

	public static void selectChoiceValues(WebDriver driver, List<WebElement> choiceList, String... value) {

		if (value[0].equalsIgnoreCase("all")) {
			for (int i = 0; i < choiceList.size(); i++) {
				try {
					choiceList.get(i).click();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}

		}

		else {
			for (int i = 0; i < choiceList.size(); i++) {
				String text = choiceList.get(i).getText();
				for (int j = 0; j < value.length; j++) {
					if (text.equalsIgnoreCase(value[j])) {
						choiceList.get(i).click();
						break;

					}
				}

			}
		}
	}
}
