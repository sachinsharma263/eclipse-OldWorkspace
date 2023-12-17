package com.qa.javasessions;

/*
 * ++: incremental operator
 * --: decremental operator
 */
public class IncrementAndDecrementConcept {

	public static void main(String[] args) {

		int a = 1;
		int b = a++;// post increment-later: first you give original value of a to b and then
					// increase the value of a by 1
		System.out.println(a);// 2
		System.out.println(b);// 1

		int p = 1;
		int q = ++p;// pre increment-first increase the value of p by 1 and then give that value to
					// q
		System.out.println(p);// 2
		System.out.println(q);// 2

		int c = 1;
		int d = c--;// post decrement-later
		System.out.println(c);// 0
		System.out.println(d);// 1

		int x = 1;
		int y = --x;// pre decrement:first
		System.out.println(x);// 0
		System.out.println(y);// 0

	}
}
