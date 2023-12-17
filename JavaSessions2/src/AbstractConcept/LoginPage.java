package AbstractConcept;

public class LoginPage extends Page {

	public LoginPage() {
		System.out.println("LoginPage.......const");
	}

	@Override
	public void header() {
		System.out.println("LoginPage......header");
	}

	@Override
	public void footer() {
		System.out.println("loginpage....footer");
	}

}
