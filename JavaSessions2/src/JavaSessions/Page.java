package JavaSessions;

public class Page {

	String title;
	String url;
	int loadingTime;
	public static void main(String[] args) {
		
		Page loginPage=new Page();
		loginPage.title="Gmail Login";
		loginPage.url="http://www.gmail.com";
		loginPage.loadingTime=5;
		
		Page homePage=new Page();
		homePage.title="Google Home";
		homePage.url="http://www.gmail.com";
		homePage.loadingTime=5;
		
		System.out.println(loginPage.title);
		System.out.println(homePage.title);
	}

}
