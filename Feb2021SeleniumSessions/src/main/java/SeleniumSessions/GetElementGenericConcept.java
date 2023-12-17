package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementGenericConcept {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/signup");
		driver.findElement(By.linkText("Sign in")).click();
		
		Thread.sleep(5000);
		
		By emailId=By.id("username");
		By password=By.id("password");
		By loginBtn=By.id("loginBtn");
		//By signUp=By.linkText("Sign up");
		By signUp=By.linkText("Sign up123");
		
//		getElement(driver, emailId).sendKeys("test");
//		getElement(driver, password).sendKeys("test");
		
		doSendKey(driver, emailId, "test@gmail.com");
		doSendKey(driver, password, "test@123");
		doClick(driver, loginBtn);
		
		if (doIsDisplayed(driver, signUp)) {
			String text=doGetText(driver, signUp);
			System.out.println(text);
		}
	
		
	}
	/**
	 * This method is used to create web element on the basis of By locator
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver,By locator) {
		WebElement element = null;
		try {
			 element=driver.findElement(locator);
		} catch (Exception e) {
			System.out.println("web element could nt be created"+ locator);
					}
		return element;
	}

	/**
	 * This method is used to pass the values
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void doSendKey(WebDriver driver,By locator,String value) {
		
		getElement(driver, locator).sendKeys(value);
	}
	
	/**
	 * This is to click on an element
	 * @param driver
	 * @param locator
	 */
	public static void doClick(WebDriver driver,By locator) {
		
		getElement(driver, locator).click();
	}
	
	/**
	 * This is for getting the text
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static String doGetText(WebDriver driver,By locator) {
		
		return getElement(driver, locator).getText();
	}
	
	/**
	 * This is to check element is displayed or not
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static boolean doIsDisplayed(WebDriver driver,By locator) {
		
		return getElement(driver, locator).isDisplayed();
	}
}
