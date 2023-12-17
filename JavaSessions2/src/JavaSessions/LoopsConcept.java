package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {

		// loop-repetitive recursive iteration
		// 1. while
		// print 1 to 10

		int i = 1;// Initialization
		while (i <= 10)// condition
		{
			System.out.println("value of i is: " + i);
			i++;// incremental or decremental
		}
		// 2. for
		for (int k = 1; k <= 10; k++) {
			System.out.println(k);
		}
		for (int k = 1; k <= 10; k++)
			System.out.println(k);
		// System.out.println(k);

		// print even number 1 to 10
		for (int even = 2; even <= 10; even = even + 2) {
			System.out.println(even);
		}
		// print odd number 1 to 10
		for (int odd = 1; odd <= 10; odd = odd + 2) {
			System.out.println(odd);
		}
		// 10%2=0 9%2=1
		for (int j = 1; j <= 100; j++) {
			if (j % 5 == 0) {
				System.out.println(j);
			}
		}
		// 0 divided by any number is 0
		int a = 0 / 9;
		System.out.println(a);

		// any number divided by 0 is infinity in mathematics but in java doesnt define
		// it , java will throw exception aithmatic exception number divide by zer
		// System.out.println(9/0);

		// do while
		int m = 1;
		do {
			System.out.println(m);
			m++;

		} while (m <= 10);
	}
}
