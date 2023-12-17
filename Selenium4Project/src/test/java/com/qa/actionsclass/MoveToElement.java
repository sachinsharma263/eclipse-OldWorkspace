package com.qa.actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {

	public static void main(String[] args) {

		By login = By.xpath("//a[@id='Login']");
		By travelAgent = By.xpath("//a[@id='TravelAgentLoginText']");
		By subAgent = By.xpath("//a[@id='SubAgentLoginText']");
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		driver.get("https://book.spicejet.com/LoginAgent.aspx");

//		Actions action = new Actions(driver);
//
//		WebElement loginELement = driver.findElement(By.xpath("//a[@id='Login']"));
//
//		action.moveToElement(loginELement).perform();
//
//		WebElement travelAgentElement = driver.findElement(By.xpath("//a[@id='TravelAgentLoginText']"));
//
//		action.moveToElement(travelAgentElement).perform();
//
//		WebElement subAgentElement = driver.findElement(By.xpath("//a[@id='SubAgentLoginText']"));
//
//		subAgentElement.click();

//		action.moveToElement(loginELement).moveToElement(travelAgentElement).build().perform();
//		subAgentElement.click();

		doMoveToElement(driver, login);
		doMoveToElement(driver, travelAgent);
		doClick(driver, subAgent);

	

	}

	public static void doMoveToElement(WebDriver driver, By locator) {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(driver, locator)).build().perform();
	}

	public static WebElement getElement(WebDriver driver, By locator) {
		return driver.findElement(locator);
	}

	public static void doClick(WebDriver driver, By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(driver, locator)).perform();
	}

}
