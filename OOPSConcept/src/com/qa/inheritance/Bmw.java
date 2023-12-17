package com.qa.inheritance;

/*
 * Bmw says i am extending Car but sorry Parent i dnt like your start method,i will have my own start method
 * same concept/feature start but now business logic will be our Bmw
 */
public class Bmw extends Car {

	/*
	 * Overridden method-in parent class i have start method with 0 param and in
	 * child also same method name with 0 param this is called method overriding why
	 * we need method Overridding-i want to override some property from parent,i dnt
	 * want to use ,i will give my own business logic i will use same
	 * concept/feature but business logic my own
	 */
	@Override
	public void start() {
		System.out.println("Bmw--start");

	
	}

	public void sunRoof() {
		System.out.println("Bmw--sunRoof");
	}

	// @Override static method cant be Override
	public static void test() {
		System.out.println("Car--test");
	}
	public Bmw a() {
		return new Bmw();
	}

}
