package JavaSessions;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		System.out.println(ar.size());
		ar.add(100);
		ar.add(200);
		System.out.println(ar.size());

		ar.add(300);
		ar.add(400);
		System.out.println(ar.size());

		ar.add(500);
		ar.add(600);
		ar.add("naveen");
		ar.add('m');
		ar.add(true);
		ar.add(12.22);
		System.out.println(ar.size());
		
		System.out.println(ar.get(0));
		//System.out.println(ar.get(6));
		
		ar.remove(4);
		System.out.println(ar.get(4));
		System.out.println(ar.size());
		
		for (int i = 0; i <ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		//Generics- restricting array list to store a particulat type of data
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(100);
		//marks.add("");
		
		
		ArrayList<Double> salary=new ArrayList<Double>();
		salary.add(12.22);
		salary.add(100.00);
		
		ArrayList<String> empName=new ArrayList<String>();
		empName.add("naveen");
		//empName.add('d');
		
		ArrayList<Object> empData=new ArrayList<Object>();
		empData.add("naveen");
		empData.add('m');
		empData.add(12.22);
		empData.add(true);
		empData.add("naveen");
		
		System.out.println(empData.size());
	}

}
