package com.qa.javasessions;

/*
 * create a method and return the object of the class
 */
public class Testing {

	public  void main2(String[] args) {
		Testing obj = returnObject();//Type mismatch: cannot convert from void to Testing
		System.out.println(obj.hashCode());
		//int n=obj.name();//Type mismatch: cannot convert from void to int
		//System.out.println(obj.name());//The method println(boolean) in the type PrintStream is not applicable for the arguments (void)
	}

	public static Testing returnObject() {
		Testing obj = new Testing();
		System.out.println(obj.hashCode());
		return obj;
	}
	public void name() {
		System.out.println("name");
	}
	/*
	 * Error: Main method is not static in class com.qa.javasessions.Testing, please define the main method as:
   public static void main(String[] args)
   
   JVM only execute main method having public static void and one array parameter of string type
   calling non static method is not possible without creating an object,the main reason of making main method as static is that JVM  will be able to call
   main method without creating an object
	 */
}
