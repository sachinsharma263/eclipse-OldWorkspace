package JavaSessions;

public class Employee {

	
	String empName;
	int empId;
	int age;
	String empDept;
	long phone;
	boolean isActive;
	
	public static void main(String[] args) {
	
		Employee emp1=new Employee();
		emp1.empName="naveen";
		emp1.empId=123;
		emp1.age=30;
		emp1.empDept="QA";
		emp1.phone=999999999;
		emp1.isActive=true;
		
		
		System.out.println(emp1.empName+" "+emp1.empId+" "+emp1.age+" "+emp1.empDept+" "+emp1.phone+" "+emp1.isActive);
		
		Employee emp2=new Employee();
		emp2.empName="deepak";
		emp2.empId=124;
		emp2.age=37;
		emp2.empDept="Account";
		emp2.phone=999999999;
		emp2.isActive=true;
		
		System.out.println(emp2.empName+" "+emp2.empId+" "+emp2.age+" "+emp2.empDept+" "+emp2.phone+" "+emp1.isActive);
		
		Employee emp3=new Employee();
		emp3.empName="Vani";
		
		System.out.println(emp3.empName+" "+emp3.empId+" "+emp3.age+" "+emp3.empDept+" "+emp3.phone+" "+emp3.isActive);
		
		//new Employee().empName="deepak";
	}

}
