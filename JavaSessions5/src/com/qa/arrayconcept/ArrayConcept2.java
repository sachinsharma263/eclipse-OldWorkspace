package com.qa.arrayconcept;

public class ArrayConcept2 {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=30;
		
		int arr[]=new int[5];
		
		//int arr[];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		//arr[4]=5;
		//arr[5]=6;
		
		System.out.println(arr.length);
		//System.out.println(arr[5]);
		
		System.out.println(arr[4]);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+"--> "+arr[i]);
			
			if (arr[i]==2) {
				System.out.println("found");
			}
			if (i==4) {
				System.out.println("bye");
			}
			
		}
		
		double d[];
		d=new double[2];
		
		d[0]=10.5;
		d[1]=12;
		
		System.out.println(d.length);
		
		float f[]=new float[0];
		//f[0]=10.5f;
		
		String s[]=new String[2];
		System.out.println(s.length);
		
		String studentname[]= {"",""};
		
		char ch[]=new char[2];
		ch[0]='a';
		ch[1]='b';
		
		
		
		
		
	}

}
