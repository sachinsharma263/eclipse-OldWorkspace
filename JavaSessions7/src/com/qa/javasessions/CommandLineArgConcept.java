package com.qa.javasessions;

public class CommandLineArgConcept {

	public static void main(String[] args) {//here array args of string type refernce got created but no memory allocation for this
		//string array parameter
		
		System.out.println(args.length);//0
		//args[0]="naveen";//java.lang.ArrayIndexOutOfBoundsException 
		System.out.println(args[0]);
		for (int i = 0; i <args.length; i++) {
			System.out.println(args[i]);
		}
		
	}
}


