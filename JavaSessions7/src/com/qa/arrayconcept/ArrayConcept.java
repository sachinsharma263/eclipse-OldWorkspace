package com.qa.arrayconcept;

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
public class ArrayConcept {

	public static void main(String[] args) {

		// suppose i have to store 10 int values so i have to create 10 different
		// variables to store values
		// again and again i have to create variable so to overcome this we will be
		// using array where we will be storing different values in same variable
		// this array variable can store multiple values but of same type
		int a = 10;
		int b = 20;
		int c = 30;

		// 1. int array
		int arr[] = new int[5]; // new keyword -memory initialized

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		System.out.println(arr[0]);
		System.out.println(arr[4]);
		// System.out.println(arr[5]); //Exception in thread "main"
		// java.lang.ArrayIndexOutOfBoundsException: 5 accessing index 5 which doesnt
		// exist

		int len = arr.length; // length is inbuilt variable which give length of the array

		System.out.println("length of the array is: " + len);
		System.out.println("li: " + 0);
		System.out.println("hi: " + (len - 1));

		// print all the values from array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "-->" + arr[i]);

			if (arr[i] == 30) {
				System.out.println("hello world");
				// break;
			}
			if (i == 4) {
				System.out.println("bye");
			}
		}

		// 2. double array
		double d[] = new double[2];
		d[0] = 10.2;
		d[1] = 30;

		System.out.println(d[1]);

		// 3. string array
		String studentName[] = new String[2];
		studentName[0] = "naveen";
		studentName[1] = "rahul";

		// 4. char array
		char ch[] = new char[2];
		ch[0] = 'a';
		ch[1] = 'b';
		// ch[2]='c'; //java.lang.ArrayIndexOutOfBoundsException: 2

		char ch2 = 97;

		System.out.println(ch[0] + ch[1]);
		System.out.println(ch2);

		// Object static array
		Object empData[] = new Object[6];
		empData[0] = 1;
		empData[1] = "naveen";
		empData[2] = "QA";
		empData[3] = 30;
		empData[4] = 'm';
		empData[5] = true;

		for (int count = 0; count < empData.length; count++) {
			System.out.println(empData[count]);
		}

		String empName[] = new String[50];
		empName[0] = "naveen";
		empName[1] = "deepak";
		empName[2] = "swati";
		empName[3] = "rahul";
		System.out.println("---------------");
		for (int count = 0; count < empName.length; count++) {
			System.out.println(count + "-->" + empName[count]);
			try {
				if (empName[count].equals("vikas")) {// java.lang.NullPointerException
					System.out.println("bye");

				}
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		String empName2[] = new String[2];
		empName2[0] = "naveen";
		empName2[1] = "deepak";

		for (String name : empName2) {
			System.out.println(name);
		}

		Object obj[] = new Object[5];
		obj[0] = 1;
		obj[1] = "naveen";
		obj[2] = 'm';
		obj[3] = true;
		obj[4] = 30;

		for (Object o : obj) {
			System.out.println(o);
		}

		float f[] = null;
		// System.out.println(f.length);//java.lang.NullPointerException

		f = new float[2];
		f[0] = 10.5f;
		System.out.println(f[0] + "\n" + f[1]);

		double da[] = { 10, 10.5 };
		System.out.println(da[0] + "\n" + da[1]);

		String name[] = new String[2];
		name[0] = "mukesh";

		System.out.println(name[0] + "\n" + name[1]);

		char ca[] = { 'a', 'b' };
		System.out.println(ca[0] + "\t" + ca[1]);

	}
}
