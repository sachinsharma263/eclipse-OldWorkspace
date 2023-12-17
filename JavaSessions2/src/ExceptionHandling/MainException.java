package ExceptionHandling;

public class MainException {

	public static void main(String[] args) {

		System.out.println(getmarks("deepak1"));
		System.out.println(getMarks2());
		System.out.println(getMarks3());
	}

	public static int getmarks(String studentName) {
		if (studentName.equals("Naveen")) {
			try {
				int i = 9 / 0;
			} catch (Exception e) {
				return -1;
			}
		} else if (studentName.equals("deepak")) {
			return 1;
		} else {
			return 2;
		}
		return 3;
	}

	public static int getMarks2() {
		try {
			int i = 9 / 0;
			return 0;
		} catch (Exception e) {
			return -1;
		} finally {
			return -2;
		}
	}
	public static int getMarks3() {
		try {
			int i = 9 / 3;
			return 0;
		} catch (Exception e) {
			return -1;
		} finally {
			return -2;
		}
	}

}
