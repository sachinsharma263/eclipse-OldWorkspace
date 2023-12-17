package JavaSessions;

/**
 * this is my first java code for data types
 * @author Dell
 *
 */

public class DataTypes {

	
	public static void main(String[] args) {
		
		//data types:
		//primitive data types: 
			//Boolean: boolean
			//Numeric:
					//Character : char
					//Integral : 
							//Integer: byte, short, int, long
							//Floating-point: float, double
		
		// Non-primitive data types: : String, Array
		
		//1. byte: 
		//size: 1 byte = 8 bits
		//Range: -128 to 127
		byte b = 10;
		byte b1 = 0;
		byte b2 = -20;
		 b = 100;
		 
		System.out.println(b);
		
		//2. short:
		//size: 2 bytes = 16 bits
		//Range: -32768 to 32767
		short sh = 100;
		
		//3. int:
		//size: 4 bytes = 32 bits
		//Range: -2^31 to 2^31 - 1
		int i = 10000;
		int p = 10;
		int q = p+i;
		System.out.println(q);
		
		//4. long:
		//size: 8 bytes = 64 bits
		//Range: -2^63 to 2^63 - 1
		long l = 100000;
		
		//5. float: 
		//size: 4 bytes = 32 bits
		//1.4e^045
		float f1 = 12.33f;
		System.out.println(f1);
		
		float f2 = (float)34.44;
		System.out.println(f2);
		
		float f3 = 100f;
		System.out.println(f3);
		
		//6. double:
		//size: 8 bytes = 64 bits
		double d = 12.333d;
		System.out.println(d);
		System.out.println(d+p);
		
		//7. char: 2 bytes = 16 bits
		char c1 = 'a';
		char c2 = '1';
		char c3 = '$';

		char gender = 'm';
		char executionFlag = 'Y';
		
		//8. boolean: true or false
		//size: ~1 bit
		boolean bb1 = true;
		boolean bb2 = false;
		boolean isUSCitizen = true;
		boolean elementISVisible = false;
		boolean isActive = true;


		

	}

}
