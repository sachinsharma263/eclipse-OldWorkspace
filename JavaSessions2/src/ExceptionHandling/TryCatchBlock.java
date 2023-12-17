package ExceptionHandling;

public class TryCatchBlock {

	public static void main(String ar[]) {
		System.out.println("A");
		try {
			//int i = 9 / 0;
			int a[]=new int[2];
			a[3]=1;
		} catch (ArithmeticException e) {
		//System.out.println("some exception occured "+e.getMessage());
		e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();		}
		System.out.println("B");
	}
}
