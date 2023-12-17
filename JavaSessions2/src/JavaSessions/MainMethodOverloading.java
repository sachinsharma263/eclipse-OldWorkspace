package JavaSessions;

/**
 * In java we can overload main method, but java/jvm will search for signature
 * of main method having string array variable as input parameter while
 * executing the program * @author Dell
 *
 */

public class MainMethodOverloading {

	public static void main(String[] args) {

		System.out.println("main method");
	}

	public static void main(String args) {

		System.out.println("main method");
	}

	public static void main(int args) {

		System.out.println("main method");
	}

}
