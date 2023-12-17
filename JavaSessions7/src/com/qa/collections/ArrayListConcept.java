package com.qa.collections;

import java.util.ArrayList;

/*
 * ArrayList is a class and implements List interface
 * we can insert any type of value in an array list and size is not fixed,size grows/shrink dynamitically
 * Insertion order is prerved.The order in which we inserted the value s,in the same order the value will be stored.
 * ArrayList- ordered based maintains sequence
 * duplicate values are allowed
 * array list size will be based on how many values i have stored,what will i do with virtual capacity,its internal implementation
 * its depend on use case whether to use generic or raw type
 * 
 * Drawbacks of an Array:
 * 1. similar type of data
 * 2. size is fixed
 * to overcome this we use collection or an arraylist
 */
public class ArrayListConcept {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		System.out.println(al.size());

		al.add(10);// 0
		al.add(20);// 1

		System.out.println(al.size());

		al.add(30);// 2
		al.add(40);// 3
		al.add("naveen");

		al.add('m');
		al.add(10.1);

		al.add(null);
		al.add(null);
		al.add(10);//new Integer(10)
		
		al.add(true);//new Boolean(true);
		

		System.out.println(al.size());

		System.out.println(al.get(0));
		System.out.println(al.get(3));

		// System.out.println(al.get(4));// java.lang.IndexOutOfBoundsException there is
		// no memory allocated for index 6 then how come you can get
		// or access element at index 6, memory allocated for 6 elements index 0 to 5

		al.remove(2);
		System.out.println(al.size());

		System.out.println(al.get(2));

		for (int i = 0; i < al.size(); i++) {
			System.out.println(i + "-->" + al.get(i));
		}

		// Generics: we are restrict our arraylist can hold only one type of data
		//sometimes as per the requirement you are required to store or add only one type of value in the arraylist-->for this we use Generic
		//<>-->angular bracket 
		//all collection classes store object-->collection doesnt allow primitive values to be stored-->only objects are allowed in collection classes
		//internally what happens whenever you tried adding any primitive value,internally first primitive value will convert to respective wrpaer class
		//object and then that object will be stored in the arraylist or any collection class,automatically this happen
		//al.add-->new Integer(10)
		//any collection class allows only object to be stored
		//collection doesnt allow primitive values to be stored-->only objects are allowed in collection classes why?
		//add(Object e):e is of type Object,Object is parent class of all the classes. e is capable of storing any class object. user can store any type of value
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		ar2.add(10);//new Integer(10)
		// ar2.add("d");
		

		ArrayList<Double> ar3 = new ArrayList<Double>();
		ar3.add(10.1);
		// ar3.add(10);

		ArrayList<String> ar4 = new ArrayList<String>();
		ar4.add("naveen");
		ar4.add("10");

		ArrayList<Object> ar5 = new ArrayList<Object>();
		ar5.add("Deepak");
		ar5.add(30);
		ar5.add('m');
		ar5.add(true);

		for(Object v:al)
		{
			System.out.println(v);
		}
	}
}
