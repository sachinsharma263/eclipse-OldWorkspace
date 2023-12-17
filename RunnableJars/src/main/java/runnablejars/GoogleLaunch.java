
package runnablejars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLaunch {

	public static void main(String[] args) {
  
  WebDriverManager.chromedriver().setup();
  WebDriver driver=new ChromeDriver();
  //driver.get("http://www.google.com");
  driver.get(args[0]); //
  System.out.println(driver.getTitle());
  // System.out.println(args[1]);
  //driver.get("http://www.google.com"); 
 // driver.get(args[0]);  
  if(driver.getTitle().equals(args[1])) 
  { 
	
	  System.out.println("correct title"); 
	

		
	}driver.quit();
  }
	

}

/*
 * package runnablejars;
 * 
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import com.qa.trcrm.base.BasePage;
 * 
 * import io.github.bonigarcia.wdm.WebDriverManager;
 * 
 * public class GoogleLaunch {
 * 
 * public static void main(String[] args) {
 * 
 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
 * ChromeDriver(); driver.get("http://www.google.com");
 * 
 * System.out.println(driver.getTitle());
 * 
 * if (driver.getTitle().equals("Google")) {
 * System.out.println("correct title"); } else {
 * System.out.println("incorrect title"); }
 * 
 * BasePage bp=new BasePage(); }
 */
