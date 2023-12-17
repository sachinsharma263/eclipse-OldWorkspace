package com.qa.utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int retryCount = 0;
	int maxCount = 3;

	@Override
	public boolean retry(ITestResult result) {
		if (retryCount < maxCount) {
			retryCount++;
			return true;
		}
		return false;
	}

}
