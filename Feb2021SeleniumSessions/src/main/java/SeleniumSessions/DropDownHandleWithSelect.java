package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleWithSelect {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		
		Select select1=new Select(day);
		System.out.println(select1.isMultiple());
		
		System.out.println(getAllOptionsList(day));
		System.out.println(getAllOptionsList(month));
		System.out.println(getAllOptionsList(year));
		
//		select1.selectByIndex(5);
//		select1.selectByVisibleText("8");
//		
//		Select select2=new Select(month);
//		select2.selectByValue("2");
//		select2.selectByIndex(5);
//		
//		Select select3=new Select(year);
//		select3.selectByVisibleText("2021");
		
		selectDropDownValueByIndex(day, 6);
		selectDropDownValueByVisibleText(month, "Jun");
	}
	public static void selectDropDownValueByIndex(WebElement element,int index) {
		
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	public static void selectDropDownValueByVisibleText(WebElement element,String value) {
		
		Select select=new Select(element);
		select.selectByVisibleText(value);
	}
	
	public static ArrayList<String> getAllOptionsList(WebElement element) {
		
		ArrayList<String> ar=new ArrayList<String>();
		Select select=new Select(element);
		List<WebElement>optionList=select.getOptions();
		int optionSize=optionList.size();
		System.out.println("Option List Size is "+ optionSize);
		for (int i = 0; i < optionSize; i++) {
			
			//System.out.println("Options are:"+optionList.get(i).getText());
			ar.add(optionList.get(i).getText());
		}
		return ar;
	}

}
