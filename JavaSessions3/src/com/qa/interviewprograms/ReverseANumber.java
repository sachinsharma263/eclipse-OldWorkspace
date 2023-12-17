package com.qa.interviewprograms;

import java.util.Scanner;

class ReverseANumber {

	public static void main(String[] args) {
		
		System.out.println("Please enter number:");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int rev=0;
		int rem=0;
		int temp=n;
		
		while (n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("Reverse of number "+temp+" is:"+ rev);
		
	}

}
