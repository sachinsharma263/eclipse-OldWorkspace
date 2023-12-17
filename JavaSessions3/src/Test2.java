
public class Test2 {

	int a;
	String name;

	public static void main(String[] args) {

		Test2 obj = new Test2();//creating an object and storing address of that object in a reference variable obj of type Test2.This address is hashcode in human
		//readable form, not an actual address
		//= assignment operator or equals to-->lhs and rhs-->rhs execute first 
		// as soon as JVM comes into rhs,JVM sees new keyword,JVM assumes you want to create new object
		//new Test2();--> new then classname whose object you want to create object
		//after creating object new classname-->it is mandatory to call the constructor of that class-->mandatory to append the parenthese () after classname
		//new object for class created-->memory allocation will happen on your system RAM-->memory for that newly created object allocated into your RAM
		//how JVM manages memory allocation into your RAM
		//lets say you have 4GB of RAM.whenever you execute java application JVM reserved some memory in RAM-->OS manage memory
		//JVM reserved 512 MB memory-->out of this JVM divide memory into 5 parts-->class area,heap area,stack area,pc register area to store different things
		//one of the memory area is heap where objects get created
		//address of this object inside heap is abc123-->after rhs exceution address is stored to lhs
		//lhs reference variable will also have memory allocation but not in heap but in stack
		//reference variable contains address of the object--> Test2 obj-->obj is referring to object
		System.out.println(obj);//ObjectCreate@15db9742
		
		for (; ; ) {
			System.out.println(new Test2());
			break;
		}
		
		new Test2();//creatig object but not assigning reference variable,once this line executed we wont be able to access this object again because 
		//no reference variable point to this object.eligible for GC
		
		System.out.println(new Test2().a);//not a good practice/approach?-->no approach is good or bad,it depends upon your requirement
		//memory is most crucial thing in IT industry,most of money goes for memory-->aws any cloud service we have to pay for that
	}

}
