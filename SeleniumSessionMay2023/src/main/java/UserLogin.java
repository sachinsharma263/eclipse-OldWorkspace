
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Requirement is to maintain user credentials
 * This is very good example of using HashMap in selenium maintaning user login credentials
 * u dont have to maintain your credentials in property file, you can maintain in the form of hashmap
 */
public class UserLogin {

	public static void main(String[] args) {

		Map<String, String> userMap = new HashMap<String, String>();

//		userMap.put("admin", "admin_admin");
//		userMap.put("patient", "peter@gmail.com_patient");
//		userMap.put("doctor", "doctor@gmail.com_test@123");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://app.hubspot.com/login");

		// driver.findElement(By.id("username")).sendKeys(userMap.get("doctor").split("_")[0]);
		// driver.findElement(By.id("password")).sendKeys(userMap.get("doctor").split("_")[1]);

		// doLogin(driver, userMap, "doctor");

		doLogin(driver, getUserMap(), "doctor");

	}

	public static Map<String, String> getUserMap() {
		Map<String, String> userMap = new HashMap<String, String>();

		userMap.put("admin", "admin_admin");
		userMap.put("patient", "peter@gmail.com_patient");
		userMap.put("doctor", "doctor@gmail.com_test@123");

		return userMap;
	}

	public static void doLogin(WebDriver driver, Map<String, String> userMap, String userKey) {
		driver.findElement(By.id("username")).sendKeys(userMap.get(userKey).split("_")[0]);
		driver.findElement(By.id("password")).sendKeys(userMap.get(userKey).split("_")[1]);
	}

}
