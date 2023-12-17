package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//1. int array
		
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		System.out.println(a[0]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		//System.out.println(a[-1]);
		
		System.out.println(a.length);// length is inbuilt variable which gives array length and not a function
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			if (a[i]==30) {
				System.out.println(a[i]+" hello world");
			}
			if (i==4) {
				System.out.println("bye");
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(i+"-->"+a[i]);
		}
		//2. double array
		double d[]=new double[2];
		d[0]=10.2;
		d[1]=12.3;
		
		// char array
		char c[]=new char[2];
		
		//string array
		String studentNames[]=new String[4];
		studentNames[0]="vaishali";
		studentNames[1]="swati";
		studentNames[2]="deepak";
		studentNames[3]="imad";
		//studentNames[4]="naveen";
		//System.out.println(studentNames[39]);
		
		System.out.println(studentNames[3]);
		for (int i = 0; i < studentNames.length; i++) {
			System.out.println(studentNames[i]);
			
			String name=studentNames[i];
			if (name.equals("swati")) {
				System.out.println("topper");
			}
		}
		// Object array
		Object empData[]=new Object[5];
		empData[0]="Latha";
		empData[1]=29;
		empData[2]='f';
		empData[3]=37.34;
		empData[4]=true;
		
		for (int i = 0; i < empData.length; i++) {
			System.out.println(empData[i]);
		}
	}

}
