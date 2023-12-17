package com.qa.selenium4;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageFactoryConcept {

	@FindBy(id = "username")
	private WebElement email;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(how = How.ID, using = "loginBtn")
	private WebElement loginBtn;

	public void loginTest(WebDriver driver) {

		//PageFactory.initElements(driver, this);
		email.sendKeys("test@gmail.com");
		password.sendKeys("test@123");
		loginBtn.click();
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));

		driver.get("https://app.hubspot.com/login");

		PageFactoryConcept obj = new PageFactoryConcept();
		 PageFactory.initElements(driver,obj);

		obj.loginTest(driver);
	}
}
