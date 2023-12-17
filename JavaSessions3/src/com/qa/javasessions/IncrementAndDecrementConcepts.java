package com.qa.javasessions;

public class IncrementAndDecrementConcepts {

	public static void main(String[] args) {
		
		//post increment
		int a=1;
		int b=a++;//post increment
		System.out.println(a);
		System.out.println(b);
		
		int c=-1;
		int d=c++;
		System.out.println(c);
		System.out.println(d);
		
		//pre increment
		int m=1;
		int n=++m;
		System.out.println(m);
		System.out.println(n);
		
		int j=-5;
		int k=++j;
		System.out.println(j);
		System.out.println(k);
		
		//pre decrement
		int x=2;
		int y=--x;
		System.out.println(x);
		System.out.println(y);
		
		//post decrement
		int t=2;
		int r=t--;
		System.out.println(t);
		System.out.println(r);
	}

}
