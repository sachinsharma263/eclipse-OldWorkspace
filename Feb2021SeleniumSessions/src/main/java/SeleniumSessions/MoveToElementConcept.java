package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		
		WebElement contentMenu=driver.findElement(By.className("menulink"));
//		Actions action=new Actions(driver);
//		action.moveToElement(contentMenu).build().perform();
//		
//		Thread.sleep(5000);
//		
//		WebElement courseSubMenu=driver.findElement(By.linkText("COURSES"));
//		courseSubMenu.click();
		
		moveToElement(driver, contentMenu);
		WebElement courseSubMenu=driver.findElement(By.linkText("COURSES"));
		courseSubMenu.click();
	}

	public static void moveToElement(WebDriver driver,WebElement element) {
		
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
	}
}
