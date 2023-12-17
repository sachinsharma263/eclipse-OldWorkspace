package JavaSessions;

public class StaticAndNonStaticConcept {

	String name = "Naveen";
	static int age = 30;

	public static void main(String ar[]) {
		// call non static
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		System.out.println(obj.name);
		obj.getDiscount();

		// System.out.println(obj.age);
		// obj.getPrice();

		// call static method
		System.out.println(age);
		getPrice();

		System.out.println(StaticAndNonStaticConcept.age);
		StaticAndNonStaticConcept.getPrice();

	}

	public void getDiscount() {
		System.out.println("get Discount");
	}

	public static void getPrice() {
		System.out.println("ger Price");
	}
}
