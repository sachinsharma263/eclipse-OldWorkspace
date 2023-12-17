package com.qa.accessmodifier2;

import com.qa.accessmodifier.Car;

public class Audi extends Car {

	public static void main(String[] args) {
		Car c=new Car();
		System.out.println(c.color);
		//System.out.println(c.price);
		
		//System.out.println(c.name);
		
		//System.out.println(c.type);//non inherited version so error while using protected in different package subclass
		
		Audi a=new Audi();
		System.out.println(a.type);//inherited version
	}
	public void name() {
		type="";
	}
	//https://stackoverflow.com/questions/19949327/why-subclass-in-another-package-cannot-access-a-protected-method
	
}
