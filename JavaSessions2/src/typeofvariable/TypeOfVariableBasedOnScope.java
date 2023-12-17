package typeofvariable;

/**
 * on the basis of scope we have three types of variables in java local instance
 * static
 * 
 * @author Dell
 *
 */
public class TypeOfVariableBasedOnScope {

	int a = 10;// instance variable.starting a=10 only variable declaration but when we create
	int b=10;			// object then memory allocation happen.each object will
	// have copy these instance variable. in each object memory for these instance
	// variable will be allocate.

	int var;
	String name;
	char c;
	boolean b1;
	float f;
	double d;
	public static void main(String[] args) {
		TypeOfVariableBasedOnScope obj = new TypeOfVariableBasedOnScope();
		TypeOfVariableBasedOnScope obj2 = new TypeOfVariableBasedOnScope();
		
		System.out.println(obj.a);
		obj.a=5;
		System.out.println(obj.a);
		
		System.out.println(obj.var);
		System.out.println(obj.name);
		System.out.println(obj.c);
		System.out.println("hello");
		System.out.println(obj.b1);
		System.out.println(obj.f);
		System.out.println(obj.d);
		System.out.println(obj);
		obj=null;
		System.out.println(obj);
		System.out.println(obj.var);

	}
}
