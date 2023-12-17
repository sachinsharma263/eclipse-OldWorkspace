package com.qa.testngsessions;

import org.testng.annotations.Test;

public class ExceptedException {
  @Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class})
  public void loginTest() {
	  System.out.println("login test...");
	  int a=9/0;
	  System.out.println("login test end");
  }
}
