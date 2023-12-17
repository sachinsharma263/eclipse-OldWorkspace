package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ElementActions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://app.hubspot.com/signup");
		driver.findElement(By.linkText("Sign in")).click();
		
		Thread.sleep(5000);
		
		By emailId=By.id("username");
		By password=By.id("password");
		By loginBtn=By.id("loginBtn");
		
		WebElement emailIdWebelement=driver.findElement(emailId);
		WebElement passwordWebelement=driver.findElement(password);
		WebElement loginBtnWebelement=driver.findElement(loginBtn);
		
//		Actions action=new Actions(driver);
//		action.sendKeys(emailIdWebelement, "test@gmail.com").build().perform();;
//		action.sendKeys(passwordWebelement, "test@123").build().perform();;
//		action.click(loginBtnWebelement).build().perform();
		doActionSendKey(driver, emailIdWebelement, "test@gmail.com");
		doActionSendKey(driver, passwordWebelement, "test@gmail.com");
		doActionClick(driver, loginBtnWebelement);
	}

	public static void doActionSendKey(WebDriver driver,WebElement element,String value) {
		
		Actions action=new Actions(driver);
		action.sendKeys(element, value).build().perform();
	}
	public static void doActionClick(WebDriver driver,WebElement element) {
		
		Actions action=new Actions(driver);
		action.click(element).build().perform();
	}
}
