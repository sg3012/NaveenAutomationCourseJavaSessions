package javasessions.webdriverarch;

public class AmazonTest {

	// This class shows why we should use Top casting while
	// initializing a web browser like Webdriver driver = new ChromeDriver() or
	// Webdriver driver = new FirefoxDriver() instead of ChromeDriver driver = new
	// ChromeDriver()
	// or FirefoxDriver driver = new FirefoxDriver() ?
	public static void main(String[] args) {

		// DIFFERENT APPROACHES TO INITIALIZE AND LAUNCH BROWSERS USING SELENIUM:

		// APPROACH 1: Declare and initialze browser variables separately for each
		// browser

		// Now, if we have to launch a browser (say Chrome) using Chromedriver class we
		// will do it like:
//		ChromeDriver driver = new ChromeDriver(); // Launch chrome
//		driver.findElement("emailID"); // find element: emailID
//		driver.sendKeys(); // Sending Value to element
//		driver.click(); // Clicking on element
//		driver.quit(); // Quit the Browser

		// Now, if we have to launch Firefox then we have to declare another
		// driver variable and initialize like:
//		FirefoxDriver driver1 = new FirefoxDriver(); // Launch firefox
//		driver1.findElement("emailID"); // find element: emailID
//		driver1.sendKeys(); // Sending Value to element
//		driver1.click(); // Clicking on element
//		driver1.quit(); // Quit the Browser

		// or comment the chromebrowser initialization line above
		// and user the same variable name "driver" for Firefox driver here.
		// So what is the issue if tomorrow we have to launch 5 or 6 browsers in my
		// code?

		// Following will be the issues with above approaches:

		// We have to comment the browser initialisation lines
		// in the code for the useless browsers and uncomment the needed browsers
		// every time we have to run on different browser. This approach of commenting
		// and uncommenting again and again will make parallel execution impossible.

		// If we don't comment and uncomment, we will have to use different variable
		// names
		// for every browser initialization and write the same repetitive code
		// for every user action like launch, click, sendKeys etc.

		// To overcome these issues we can look for Approach 2 as below:

		// APPROACH 2: Use TOP CASTING using WebDriver interface and use the same driver
		// variable to launch different browsers
		// Declare and initialize a browser name variable like:

		String browserName = "chrome";

		// Declare browser driver variable like:

		WebDriver driver = null;

		// Use Switch case to initialize and launch specific browser based on browser name:

		switch (browserName.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver(); // Launch chrome
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Plz pass the right browser....");
			break;
		}

		driver.findElement("emailID"); // find element: emailID
		driver.sendKeys(); // Sending Value to element
		driver.click(); // Clicking on element
		driver.quit(); // Quit the Browser

		// ADVANTAGES OF TOPCASTING IN INITIALISING BROWSER DRIVER:
		// We can launch and work with all the browsers using single browser variable.
		// We can run our test cases in parallel on all the browsers.

		// Therefore, By using approach 2 we remove the 2 issues
		// discussed above using approach 1. Therefore the answer to the question
		// that why do we write WebDriver driver = new ChromeDriver();

		// DISADVANTAGES OF TOPCASTING IN INITIALISING BROWSER DRIVER:

		// There may be a disadvantage of Approach 2. That is , if there are
		// any individual methods in the browser driver classes like chromedriver or firefox
		// driver etc. then we cannot access individual methods of the implementing child
		// browser driver classes. But in REAL Selenium library there are NO individual methods
		// inside the chromedriver, frirefoxdriver classes.

	}

}
