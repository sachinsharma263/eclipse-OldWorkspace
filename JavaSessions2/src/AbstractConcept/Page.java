package AbstractConcept;

public abstract class Page {

	public Page() {
		System.out.println("Page.........const");
	}

	public abstract void header();

	public abstract void footer();

	public void privacyPolicy() {
		System.out.println("Page........privacy policy");
	}
}
