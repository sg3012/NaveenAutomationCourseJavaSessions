package javasessions.webdriverarch;

public class SafariDriver implements WebDriver {
	public SafariDriver() {
		System.out.println("Launch Safari");
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
