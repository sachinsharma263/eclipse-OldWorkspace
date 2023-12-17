package com.qa.arrayconcept;

/*
 * length-property or inbuilt variable, not a method
 * return size of an array
 * return length/total number of elements in an array
 * 
 * Array class-->static variable-->length
 * public final static int length
 * when u create array int a[]=new int[2]--> size 2 will be store in length variable-->length is final-->constant variable
 * String cars[]-->array declare
 * We have now declared a variable that holds an array of strings. To insert values to it:2 ways
 * new keyword-->memory allocation
 * inside curly braces
 * 
 */
public class Two2DArray {

	public static void main(String ar[]) {
		int arr[][] = new int[2][3];

		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 1000);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(i + "" + j + "-->" + arr[i][j] + "\t");
			}
			System.out.println("\n");
		}
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		int arr2[][]=new int[2][];
		arr[0]=new int[3];
		arr[1]=new int[3];
	}
}
