package InheritanceConcept;

public class TestCar {

	public static void main(String ar[]) {

	Bmw obj=new Bmw();
	obj.start();
	obj.stop();
	obj.tyreAirPressure();
	obj.sunRoof();
	/**
	 * start()- overridden method 
	 * stop() and tyreAirPressure- inherited method from car
	 * sunRoof()-special method of bmw
	 */
	
	Car obj2=new Car();
	obj2.start();
	System.out.println("------------");
	//top casting/up casting
	Car c=new Bmw();
	c.start();
	c.stop();
	c.tyreAirPressure();
	
	
	Vehicle v=new Bmw();
	v.engine();
	
	//down casting
	//Bmw b=(Bmw) new Car();//ClassCastException
	
	
	}
}
