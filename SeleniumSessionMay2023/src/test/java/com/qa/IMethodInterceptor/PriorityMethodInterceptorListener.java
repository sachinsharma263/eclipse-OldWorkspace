package com.qa.IMethodInterceptor;

import java.util.ArrayList;
import java.util.List;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

import jdk.incubator.vector.VectorOperators.Test;

/*
 * Requirement: to execute Tests with priority 1- my manager told me we have an urgent release and asked me to do testing asap as we have to deliver product, in this case i dont have time so i will
 * prioritize my work and pick only those test cases which cover basic/main/crictical functionalty so i will pick test case with priority 1 first.
 * you can implement the IMethodInterceptor interface to execute only the test method with priority 1
 * In this example, the intercept method filters the methods based on their priorities and returns a new list containing only the test method with priority 1.
 * To use this interceptor in your TestNG test suite, you need to add it as a listener.
 */
public class PriorityMethodInterceptorListener implements IMethodInterceptor {

	@Override
	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
		List<IMethodInstance> filteredMethods = new ArrayList<IMethodInstance>();
		for (IMethodInstance method : methods) {
			// Iterate through the methods and add only the method with priority 1
			if (method.getMethod().getPriority() == 1) {
				filteredMethods.add(method);
			}
		}
		return filteredMethods;
	}

}
