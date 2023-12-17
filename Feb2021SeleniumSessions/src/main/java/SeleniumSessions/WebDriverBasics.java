package SeleniumSessions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	 
	
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 driver=new ChromeDriver();//launch browser
		driver.get("http://www.google.com");//launch url
		String title=driver.getTitle();//get title
		if (title.equals("Google")) {//verification point
			System.out.println("corret title");
		} else {

			System.out.println("incorrect title");
		}
		driver.quit();
	}

}
