package WraperClass;

public class DataConvert {

	public static void main(String[] args) {

		//1. string to int
		String s = "100";
		System.out.println(s + 20);

//120
		int a = Integer.parseInt(s);
		System.out.println(a + 20);
		
		String s1="10a";
		//int p=Integer.parseInt(s1);//java.lang.NumberFormatException
		//System.out.println(p+10);
		
		//2.int to string
		int b=10;
		String s2=String.valueOf(b);
		System.out.println(s2+10);
		
		//3. string to double
		String s3="10.10";
		Double d=Double.parseDouble(s3);
		System.out.println(d);
		
		//4. boolean to string
		boolean b2=true;
		
		if (b2) {
			
		}
		String s4=String.valueOf(b2);//"true"
		
//		if (s4) {
//			
//		}
		String s5="4";
		int i=Integer.parseInt(s5);
		System.out.println("hy");
		String s6=String.valueOf(i);
		
		if(Boolean.parseBoolean(s6)) {System.out.println("hy");}
		
		
	}

}
