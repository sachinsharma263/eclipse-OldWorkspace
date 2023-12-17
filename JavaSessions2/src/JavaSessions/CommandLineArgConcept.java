package JavaSessions;

public class CommandLineArgConcept {

	public static void main(String[] args) {
		
		System.out.println(args.length);//0
		//args[0]="naveen";//java.lang.ArrayIndexOutOfBoundsException
		System.out.println(args[0]);
		for (int i = 0; i <= args.length; i++) {
			System.out.println(args[i]);
		}
		
	}

}
