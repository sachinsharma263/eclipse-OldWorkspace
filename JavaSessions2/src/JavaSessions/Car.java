package JavaSessions;

public class Car {

	String name;
	String color;
	int price;
	static int wheels = 4;

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.name = "bmw 520";
		c1.color = "blue";
		c1.price = 50;
		// c1.wheels=6;

		System.out.println(c1.wheels);

		Car c2 = new Car();
		c2.name = "audi";
		c2.color = "white";
		c2.price = 55;

		System.out.println(c2.wheels);
		c2.wheels = 5;
		wheels=7;
		System.out.println("----------");
		System.out.println(c1.wheels);
		System.out.println(c2.wheels);

	}

}
