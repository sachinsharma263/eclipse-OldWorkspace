package JavaSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		int bill = 100;
		switch (bill) {
		case 200:
			System.out.println("your bill is 100");
			break;
		case 300:
			System.out.println("your bill is 300");
			break;

		case 100:
			System.out.println("your bill is 100");
			break;
		default:
			System.out.println("case not found");
			break;
		}
		String browserName = "chrome";
		switch (browserName) {
		case "chrome":
			System.out.println("launch chrome");
			break;

		case "ff":
			System.out.println("launch ff");
			break;

		case "ie":
			System.out.println("launch ie");
			break;
		default:
			System.out.println("browser not found");
			break;
		}
	}

}
