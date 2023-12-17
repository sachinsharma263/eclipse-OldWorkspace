package JavaSessions;

import java.util.ArrayList;

public class FunctionsInJava {

	public static void main(String[] args) {

		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		obj.getTrainerName();
		int days = obj.getTotalDays();
		System.out.println(days);
		String topStudents[] = obj.getTopStudents();
		for (int i = 0; i < topStudents.length; i++) {
			System.out.println(topStudents[i]);
		}
		System.out.println(obj.add(40, 20));
		obj.printTrainerName("Naveen");
		System.out.println(obj.getStudentMarks("naveen"));
		System.out.println(obj.getStudentScore("deepaks"));
		System.out.println(obj.launchBrowser("ie"));
		ArrayList<String> ar=obj.getPageLinks("loginpage");
	
		System.out.println(ar.size());
		System.out.println(ar);
	}

	// 1. simple function: no input parameter and no return type
	public void test() { // 0 param
		System.out.println("test method......");
	}

	// 2. no input but some return
	public String getTrainerName() {
		System.out.println("get getTrainerName..... ");
		return "Naveen";
	}

	public int getTotalDays() {
		System.out.println("getTotalDays.........");
		return 7;
	}

	public String[] getTopStudents() {
		String students[] = new String[3];
		students[0] = "Swati";
		students[1] = "deepak";
		students[2] = "bhawna";
		return students;
	}

	// 3. some input and some return
	public int add(int a, int b) {
		return a + b;
	}

	// 4. some input and no return
	public void printTrainerName(String name) {
		System.out.println(name);
	}
	// create a function
	// pass one param as string: studentName
	// return int:marks of the student

	public int getStudentMarks(String studentName) {

		if (studentName.equals("naveen")) {
			return 90;
		} else if (studentName.equals("swati")) {
			return 80;
		} else {
			System.out.println(studentName + " " + "not found");

		}
		return 0;
	}

	public int getStudentScore(String studentName) {

		int marks = -1;
		if (studentName.equals("naveen")) {
			marks = 90;
			// return marks;

		} else if (studentName.equals("deepak")) {
			marks = 95;
			// return marks;
		} else {

			System.out.println(studentName + " " + "not found");

		}
		return marks;
	}

	public String launchBrowser(String browserName) {

		String plugin=null;
		if (browserName.equals("chrome")) {
			System.out.println("launch chrome");
			plugin="selenium ide";
		} else if (browserName.equals("ff")) {
			System.out.println("launch ff");
			plugin="cssselector";
		} else if (browserName.equals("ie")) {
			System.out.println("launch ie");
			plugin="apple";
		} else {

			System.out.println(browserName + " " + "not found");
		}
		return plugin;
	}
	public ArrayList<String> getPageLinks(String pageName) {
		
		ArrayList<String> linklist=new ArrayList<String>();
		if (pageName.equals("loginpage")) {
			linklist.add("forgot pwd");
			linklist.add("reset pwd");
			linklist.add("sign up");
		} else if (pageName.equals("homepage")) {
			linklist.add("user profile");
			linklist.add("logout");
			linklist.add("contacts");
		} else if (pageName.equals("productpage")) {
			linklist.add("description");
			linklist.add("price");
			linklist.add("seller");
			
		}else
		{
			System.out.println(pageName+" "+ "not found");
		}

		return linklist;
		}
	}

