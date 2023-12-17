package Encapsulation;

public class CompanyTest {

	public static void main(String[] args) {

		Company com1 = new Company();
		com1.setName("Google");
		System.out.println(com1.getName());

		com1.setTotEmp(10000);
		System.out.println(com1.getTotEmp());

	}

}
