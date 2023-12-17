package com.qa.arrayconcept;

public class Array {

	/*
	 * Array:Array are used to store multiple values of similar type in a single variable,instead of declaring separate variable for each value.
	 * To declare an array, define the variable type with square brackets
	 * two major limitations of static array
	 * 1.size is fixed:to overcome this problem,we use dynamic array(ArrayList)
	 * 2. similar types of data:to overcome this problem,we use dynamic array(ArrayList) or Object static Array.
	 * 
	 * Java is strict type of language,very strict about type of data.At starting if we declare some variable given type as int then only int type 
	 * of value can be store in this variable.Java will not allow in an string array you can store other than string value.
	 * 
	 * 2 overcome limitations of static array we use dynamic array.
	 */
	public static void main(String[] args) {

		int a = 10;
		a = 20;

		int b = 20;
		int c = 30;
		int d = 40;

//		 in this approach i have to create multiple variable 
//		 
//		 i want to store 4 different values in the same variable
//		 
//		 to overcome this we create array or array variable
		
		// whenever we have to do comparison of primitive data type == is used ,for non primitive data types like string we have to used equals method
		// in array length is inbuilt variable in array, return length of an array
		// in string length() method is used to return length of string or number of characters 
		
		//array or static array,once sized is fixed we cannot give more value
		// int a[]=new a[5] new keyword memory allocation for array index 0 to 4
		// a[50] memory allocation for 50 values but you are storing only 5 values, what will be for 45 allocation,uncessary you are allocating memory
		// wastage of memory,this is static array,size if fixed
		//we need dynamic array,where size will increase decrease automatically
		//new [50] memory allocation for 50 values
		// ar[0] to ar[4] filled memory,rest 45 memory allocation but unfilled,unnecessary occupied
		//suppose in software there are 50 arrays and for every array you are giving more size like 50,100 this is worst approach.memory management is very important
		//we cant waste our memory
		//to overcome this in every programing language we have dynamic array or collection like arraylist
		//today we have 5 students so we created array list with 5 students.tomorrow few more students come,array list grows dynamic, few students left,
		//array list shrinks so we need this type of solution where memory allocation is happening dynamitically on the basis of data
		
		

		// 1. int array
		int ar[] = new int[5];

		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		ar[3] = 40;
		ar[4] = 40;

		System.out.println(ar[0]);
		System.out.println(ar[4]);
		// System.out.println(ar[5]);// java.lang.ArrayIndexOutOfBoundsException: 5
		// index 5 doesnt exist

		int len = ar.length;
		System.out.println(len);

		for (int i = 0; i < ar.length; i++) {
			System.out.println(i + "-->" + ar[i]);
			if (ar[i] == 30)
				System.out.println("Hello world");
		}

		// double array
		double arr2[] = new double[5];
		arr2[0] = 10; // 10 will be treated as 10.00, in int array i cannot store double number but in
						// double i can store int number because int number will treated as double
		arr2[1] = 12.13;

		// char array
		char crr[] = new char[2];
		crr[0] = 'a';
		crr[1] = 'b';

		// string array
		String st[] = new String[5];
		st[0] = "naveen";
		st[1] = "deepak";
		st[2] = "swati";
		st[3] = "";
			st[4] = "";

		// st[5]=""; // java.lang.ArrayIndexOutOfBoundsException

		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
		for (int i = 0; i < st.length; i++) {
			if (st[i].equals("swati")) {
				System.out.println("topper	");
			}
		}
		
		//Object array in java object is a class, superclass of all the class
		Object empData[]=new Object[5];
		empData[0]="Naveen";
		empData[1]=30;
		empData[2]='f';
		empData[3]=10.1;
		empData[4]=true;
		
		for (int i = 0; i < empData.length; i++) {
			System.out.println(empData[i]);
		}

	}

}
