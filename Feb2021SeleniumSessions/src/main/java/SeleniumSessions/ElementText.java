package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementText {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://app.hubspot.com/signup");
		driver.findElement(By.linkText("Sign in")).click();
		
		Thread.sleep(5000);
		
		String text=driver.findElement(By.className("signup-link")).getText();
		System.out.println(text);
		
		System.out.println(driver.findElement(By.className("private-form__label")).getText()+"bye");
	}

}
