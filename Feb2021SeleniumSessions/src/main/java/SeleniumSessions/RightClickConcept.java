package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement RightClickOnMe=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));

		Actions action=new Actions(driver);
		action.contextClick(RightClickOnMe).build().perform();
		List<WebElement>optionList=driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]"));
	
		for (int i = 0; i < optionList.size(); i++) {
			String text=optionList.get(i).getText();
		
			if(text.equals("Copy"))
					optionList.get(i).click();
			Thread.sleep(5000);
		}
	}

}
