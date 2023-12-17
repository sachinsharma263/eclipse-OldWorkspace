package com.qa.dropdownhandle;
/*
 * Multi selection dropdown box-selecting more than 1 values
 * no html select tag so we have to use either css or xpath ,fetch all values through findelements and then select multiple values
 */
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jquerydropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome..driver", "D:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http:www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		Thread.sleep(3000);
		driver.findElement(By.id("justAnInputBox")).click();

		Thread.sleep(3000);

		List<WebElement> choiceList = driver.findElements(By.xpath(
				"//div[@class='comboTreeDropDownContainer' and @style]/ul//li/span[@class='comboTreeItemTitle']"));

		System.out.println(choiceList.size());

		for (int i = 0; i < choiceList.size(); i++) {
			System.out.println(choiceList.get(i).getText());
		}
		String[] choice = { "choice 1", "choice 6 2 1", "choice 7" };
		/*
		 * for (int i = 0; i < choiceList.size(); i++) { if
		 * (choiceList.get(i).getText().equalsIgnoreCase("choice 6 2 1")) {
		 * choiceList.get(i).click(); } }
		 */
		/*
		 * for (int i = 0; i < choiceList.size(); i++) { for (int j = 0; j <
		 * choice.length; j++) { if
		 * (choiceList.get(i).getText().equalsIgnoreCase(choice[j])) {
		 * choiceList.get(i).click(); } }
		 * 
		 * }
		 */
		
		//selectChoice(choiceList, "choice 5");
		//selectChoice(choiceList, "choice 6");
		//selectChoice2(choiceList, choice);
		//selectChoice3(choiceList, "all");
		selectChoice3(choiceList, "choice 1","choice 6 1","choice 6 2 3");
		
	}
	public static void selectChoice(List<WebElement> choiceList,String value) {
		
		for (int i = 0; i < choiceList.size(); i++) {
			String text=choiceList.get(i).getText();
			if (text.equalsIgnoreCase(value)) {
				choiceList.get(i).click();
			}
		}
	}
public static void selectChoice2(List<WebElement> choiceList,String... value) {
		
		for (int i = 0; i < choiceList.size(); i++) {
			String text=choiceList.get(i).getText();
			for (int j = 0; j < value.length; j++) {
				if (text.equalsIgnoreCase(value[j])) {
					choiceList.get(i).click();
					break;
				}
			}
			
		}
	}
/**
 * This method is used to select the drop down values:
 1. select a single value: "choice 1"
 2. select multiple values: "choice 1","choice 2 1"
 3. select all the values :"all"
  @param choiceList
  @param value
 */
	public static void selectChoice3(List<WebElement> choiceList,String... value) {
	if (value[0].equalsIgnoreCase("all")) {
		for (int i = 0; i < choiceList.size(); i++) {
			choiceList.get(i).click();
		}}
		else {
			for (int i = 0; i < choiceList.size(); i++) {
				for (int j = 0; j < value.length; j++) {
					if (choiceList.get(i).getText().equalsIgnoreCase(value[j])) {
						choiceList.get(i).click();
						break;
					}
				}
			}
		}
	}
}


