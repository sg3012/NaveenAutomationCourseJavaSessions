package javasessions.webdriverarch;

public class FirefoxDriver implements WebDriver {

	public FirefoxDriver() {
		System.out.println("Launch Firefox");
	}

	@Override
	public void findElement(String ele) {
		System.out.println("find element: " + ele);

	}

	@Override
	public void click() {
		System.out.println("Clicking on element");
	}

	@Override
	public void sendKeys() {
		System.out.println("Sending Value to element");
	}

	@Override
	public void quit() {
		System.out.println("Quit the Browser");
	}
}
