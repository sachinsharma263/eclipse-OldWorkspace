package com.qa.encapsulation;

public class CompanyTest {

	public static void main(String ar[]) {

//	Company com1=new Company();
//	System.out.println(com1.name);
//	System.out.println(com1.totalEmp);

//	com1.name="Google";
//	com1.ceo="Sundar pichai";
//	
//	System.out.println(com1.name);
//    System.out.println(com1.totalEmp);
//    System.out.println(com1.ceo);

//	Company com1=new Company("Google","Sundar pichai",1000 ,"finacial");
//	System.out.println(com1.name+" "+com1.ceo+" "+" "+com1.totalEmp+" "+com1.policy);

		Company com1 = new Company();
		com1.setName("Sundar pichai");
		System.out.println(com1.getName());

		System.out.println(com1.totalEmp);

		com1.setPolicy("financial");
		System.out.println(com1.getPolicy());
	}
}
