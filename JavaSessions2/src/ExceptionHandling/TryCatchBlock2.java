package ExceptionHandling;

public class TryCatchBlock2 {

	public static void main(String[] args) {
		
		
		try{int a[]=new int[2];
		a[2]=1;
		}
		catch (Exception e) {
			e.printStackTrace();		}
		catch (ArithmeticException e) {
					}
		finally {//finally usecase : db connectivity point of use
			System.out.println("disconnect");
		}
		System.out.println("D");
	}

}
