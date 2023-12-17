package SuperConcept;

public class Page {

	String header;

	public Page() {

		System.out.println("Page-default const.");
	}

	public Page(String header) {

		System.out.println("Page-param "+header);
		this.header = header;

	}
	public void getName() {
		System.out.println("Page-get Name");
	}
}
