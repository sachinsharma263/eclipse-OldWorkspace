package JavaSessions;

public class Login {

	public static void main(String[] args) {

		Login l = new Login();
		l.login();

	}

	public boolean login() {
		System.out.println("login with 0 param");
		return true;
	}

	public void login(String username) {
		System.out.println("login with 1 param");
	}

	public void login(String username, String password) {
		System.out.println("login with 2 param");
	}

	public void login(int otp) {
		System.out.println("login with 1 param");
	}

	public void login(String username, int phone) {

	}

	public void login(int phone, String username) {

	}

}
