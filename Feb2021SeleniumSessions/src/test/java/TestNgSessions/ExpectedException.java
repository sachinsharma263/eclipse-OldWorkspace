package TestNgSessions;

import org.testng.annotations.Test;

public class ExpectedException {

	@Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class})
	public void loginTest() {
		System.out.println("login test started");
		int a=9/0;
		System.out.println("login test ended");
	}
}
