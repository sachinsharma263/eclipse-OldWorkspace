package com.qa.dropdownhandle;

/**
 * multi selection dropdown box
 * no select tag so we have to use either css or xpath ,fetch all values through findelements and then select multiple values
 */
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDropDownHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http:www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		Thread.sleep(3000);

		driver.findElement(By.id("justAnInputBox")).click();

//		List<WebElement> choiceList = driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
//
//		System.out.println(choiceList.size());
//
//		for (int i = 0; i < choiceList.size(); i++) {
//			System.out.println(choiceList.get(i).getText());
//			
//				choiceList.get(i).click();	

		// selectChoiceValues(driver, "choice 1", "choice 2");
		selectChoiceValues(driver, "all");
	}

	/**
	 * This method is used to select the drop down values:
	 * 1. select a single value: "choice 1"
	 * 2. select multiple values: "choice 1","choice 2 1"
	 * 3. select all the values :"all"
	 * @param driver
	 * @param value
	 */
	public static void selectChoiceValues(WebDriver driver, String... value) {
		List<WebElement> choiceList = driver.findElements(By.cssSelector("span.comboTreeItemTitle"));

		if (value[0].equalsIgnoreCase("all")) {
			for (int i = 0; i < choiceList.size(); i++) {
				try {
					choiceList.get(i).click();
				} catch (Exception e) {
				}
			}
		} else {
			for (int i = 0; i < choiceList.size(); i++) {
				String text = choiceList.get(i).getText();
				for (int j = 0; j < value.length; j++) {
					if (text.equals(value[j])) {
						choiceList.get(i).click();
						break;
					}
				}

			}
		}
	}
}
