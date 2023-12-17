package JavaSessions;

public class User {

	String name;
	int age;
	long phone;
	char gender;
	String address;
	boolean isActive;

	public User() {
		System.out.println("0 param");
	}

	public User(int i) {
		System.out.println("1 param");
	}
//	public User(String name,int a) {
//		
//	}

	public User(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public User(String name, int age, long phone, char gender, String address, boolean isActive) {

		this.name = name;
		this.age = age;
		this.phone = phone;
		this.gender = gender;
		this.address = address;
		this.isActive = isActive;
	}

	public static void main(String[] args) {

		User u1 = new User();
		u1.name = "Naveen";

		User u2 = new User(5);
		u2.name = "Deepak";

		User u3 = new User("swati", 10);
		System.out.println(u3.name + " " + u3.age);

		User u4 = new User("Naveen", 30, 9999999, 'm', "delhi", true);
		User u5 = new User("deepak", 37, 9999999, 'm', "mumbai", true);

		System.out.println(u4.name + " " + u4.age + " " + u4.isActive);
		System.out.println(u5.name + " " + u5.age + " " + u5.isActive);
	}

}
