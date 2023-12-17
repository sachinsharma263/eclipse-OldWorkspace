package com.qa.inheritance;

/*
 * final keyword is used to prevent method overriding
 * final keyword also use to prevent the inheritance
 * final keyword also use to create constant variables(no of days in a week=7,no of months in a year=12)
 */
public class Car extends Vehicle {
	
	
	public void start() {
		System.out.println("Car--start");
	}

	public void stop() {
		System.out.println("Car--stop");
	}

	public void tyreAirPressure() {
		System.out.println("Car--tyreAirPressure");
	}

	public static void test() {
		System.out.println("Car--test");
	}

	/*
	 * requirement:one use case no one can override the start2 method. all should
	 * use my start2 method-use same implementation which i implemented,use same logic
	 * no one can change the business logic,whatever logic i have given please use same
	 */
	public final void start2() {// Cannot override the final method from Car
		System.out.println("Car--start2");
	}
	public Car returnType() {
		Car c=new Car();
		return c;
	}
}
