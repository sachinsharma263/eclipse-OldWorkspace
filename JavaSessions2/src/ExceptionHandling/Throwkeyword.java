package ExceptionHandling;

public class Throwkeyword {

	public static void main(String[] args) {
		
	try {
		throw new Exception("NODATAFOUNDEXCEPTION");
	} catch (Exception e) {
		e.printStackTrace();
	}	
	}

}
