package JavaSessions;

public class ObjectReturn {

	public static void main(String[] args) {

		ObjectReturn obj = returnObject();
		obj.add();

	}

	public static ObjectReturn returnObject() {
		ObjectReturn obj = new ObjectReturn();
		return obj;
	}

	public void add() {
		int sum = 10 + 10;
		System.out.println(sum);
	}
}
