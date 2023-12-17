package SeleniumSessions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameConcept {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.com");
		
//		1. count total links on the page
//		2. get the text of each link without space
//		3. get the href url property for each link
		
		List<WebElement> linkList=driver.findElements(By.tagName("a"));
		int totalLinks=linkList.size();
		System.out.println("total links on page:"+ totalLinks);
				
		
		for (int i = 0; i < totalLinks; i++) {
			
			String text=linkList.get(i).getText();
			if (!text.isEmpty()) {
				System.out.println(i+"--->"+text+" "+linkList.get(i).getAttribute("href"));	
			}
			
		}
	}

}
