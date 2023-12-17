package Encapsulation;

public class BrowserUtil {

	public void launchBrowser() {
		System.out.println("launching browser");
		isBrowserExist();
		System.out.println("launched browser successfully");
	}

	private void isBrowserExist() {
		System.out.print("checking browser exist");
		System.out.println(".......finished");
		checkOsCompatability();
	}

	private void checkOsCompatability() {
		System.out.print("checking os compatability");
		System.out.println(".........finished");
		checkRamAllocated();
	}

	private void checkRamAllocated() {
		System.out.print("checking ram allocated");
		System.out.println(".........finished");
	}
}
