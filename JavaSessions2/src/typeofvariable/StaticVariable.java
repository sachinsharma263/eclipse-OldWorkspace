package typeofvariable;

public class StaticVariable {

	int a = 10;
	static int b = 5;
	String s = "";

	int sn;
	String name;
	char gender;
	static String collegeName = "dit";

	public static void main(String[] args) {
		StaticVariable s = new StaticVariable();
		System.out.println(s.b);
		StaticVariable s2 = new StaticVariable();
		s2.b = 10;
		System.out.println(b);

		StaticVariable student1 = new StaticVariable();
		student1.sn = 1;
		student1.name = "ajay";
		student1.gender = 'm';

		StaticVariable student2 = new StaticVariable();
		student2.sn = 2;
		student2.name = "deepak";
		student2.gender = 'm';
		
		System.out.println(student1.collegeName);
	}
}
