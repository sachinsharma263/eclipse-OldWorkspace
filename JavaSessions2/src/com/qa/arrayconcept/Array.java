package com.qa.arrayconcept;

/**
 * Requirement:i want to store 5 values in same variable, dont want to create
 * Separate variable for each value
 * 
 * @author Dell
 *
 */
public class Array {

//	int i=10;
//	//int i=20;
//	
//	int j=20;
//	int k=30;

	public static void main(String[] args) {

		
		// int i;//normal variable
		
		//int array
		int i[] = new int[5];
		System.out.println("size of array i:"+ i.length);

		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		//i[4] = 50;

		System.out.println(i[0]);
		System.out.println(i[4]);
		// System.out.println(i[5]);// java.lang.ArrayIndexOutOfBoundsException
		// System.out.println(i[-1]); //java.lang.ArrayIndexOutOfBoundsException

		int len = i.length;
		System.out.println("len is " + len);
		System.out.println("li " + 0);
		System.out.println("hi " + (len - 1));
		
		//print all values from an array: for loop
		for (int j = 0; j < i.length; j++) { //scope of j is only inside this for loop, i can use j other place also
			System.out.println(j+"-->"+i[j]);
			if (i[j]==30) {
				System.out.println("hy");
			}
			if (j==4) {
				System.out.println("Bye!!!");
			}
		}
		
		//double array
		double d[]=new double[2];
		System.out.println(d.length);
		for (int j = 0; j < d.length; j++) {
			System.out.println(d[j]);
		}
		
		//char array
		char c[]=new char[2];
		c[0]='a';
		//c[1]='';
		for (int j = 0; j < c.length; j++) {
			System.out.println(c[j]);
		}
		
		//string array
		String studentName[]=new String[2];
		//studentName[0]="naveen";
		
		for (int j = 0; j < studentName.length; j++) {
			System.out.println(studentName[j]);
		}
		for (int j = 0; j < studentName.length; j++) {
			System.out.println(studentName);
		}
		
		int array[] = {1 };
		System.out.println("length of an array "+array.length);
		
		int var = 0;
		System.out.println(var);
	

	//object array
	Object empData[]=new Object[5];
	empData[0]=1;
	empData[1]="Deepak";
	
	for (int j = 0; j < empData.length; j++) {
		System.out.println(empData[j]);
	}
	for (int j = 0; j < empData.length; j++) {
		System.out.println(empData);
	}
	//boolean array
	boolean b[]=new boolean[2];
	System.out.println(b);
	b[0]=true;
	for (int j = 0; j < b.length; j++) {
		System.out.println(b[j]);
	}
	//float array
	float f[]=new float[2];
	System.out.println(f);
	for (int j = 0; j < f.length; j++) {
		System.out.println(f[j]);
	}
	
}
}