package com.qa.javasessions;

/*
 * based on scope we have 3 types of variables:
 * 1.local:these variable are created inside a method
 * after method call,as soon as method execute
 * no default value,initialized local variable before use
 * within method/within curly braces
 * 
 * 2.instance:
 * declaration:inside a class body but outside a method
 * memory allocation:when we create an object
 * default value:integer family:0
 * floating type:0.0
 * character:single space
 * boolean:false
 * for any class whether user defined class or pre defined class:null nt a value it is just nothing
 * scope:within class
 * 
 * 3.static
 * static members are not object specific,all objects wil share same static members,single copy which will be shared by all class members
 * within class body but outside a ethod with static keyword
 * memory allocated after class loading in common memory area/method area
 * JVM will assign default value in case we dnt explictly assign value
 * untill class active in memory
 * static variable are shared property whereas instance variables are private project of each and every object as every variable  copy given to each class object 
 * 
 * declartion time nothing,memory allocation happen at runtime
 * 
 * 
 * 
 * Run/Execute first JVM will load class(.class file-byte code) in memory that is class loading and then allocate memory to static members before executing
 * 
 * 
 * where variable has created
 * object also called instance of class
 */
public class TypeOfVariableBasedOnScope {

	int a;// instance variable-->inside class body but outside a method-->all objects will
			// have a copy of this instance variable-->memory allocation for copies
	// of instance variable inside object
	// instance variable are object specific variable, we use instance variable with
	// object

	String name = "Rahul";

	static int days = 7;// based on value its string variable but based on scope it is static variable

	public static void main(String[] args) {

		TypeOfVariableBasedOnScope obj;
		obj = new TypeOfVariableBasedOnScope();// as soon as this object is created memory allocation for instance
												// variable like a,name and b will happen inside
		// an object

		TypeOfVariableBasedOnScope obj2 = new TypeOfVariableBasedOnScope();

		// a=10;//Cannot make a static reference to the non-static field a//suppose
		// compiler nt give error so at runtime JVM know a is instance variable
		// will confused for which object it should assign a=10

		System.out.println(obj.a);// JVM will assign default value depend on data type of variable

		System.out.println(obj.a == obj2.a);

		System.out.println("p");

		int localVariable = 0;

		System.out.println(localVariable);

		System.out.println(obj.days);
		System.out.println(days);
		System.out.println(TypeOfVariableBasedOnScope.days);

		days = 8;
		System.out.println(TypeOfVariableBasedOnScope.days);

		int a = 10;
		System.out.println(obj.a);

		int x = 10;
		System.out.println(x);

	}

	public void name() {
		int a;// local variable
		// System.out.println(a);
		System.out.println(days);
		System.out.println(TypeOfVariableBasedOnScope.days);
	}

	public void name2() {

		int a = 10;
		if (a == 10) {
			int bb = 5;
		}
		// System.out.println(bb);
	}

	int b;// instance variable
}
