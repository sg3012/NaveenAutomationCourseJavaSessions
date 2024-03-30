package javasessions.oopconcepts.methods;

public class Testing {

	// Acceptance Criteria: WAF
	// To launch a Browser --> Chrome / FF / Safari / Edge
	// Then Print a statement : browser is launched
	// return: true / false -- boolean
	// And Input Parameter -- String Browsername

	public boolean launchBrowser(String browserName) {
		System.out.println("launching the browser...." + browserName);
		boolean flag = true;
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			System.out.println("Launch chrome --PASS");
			break;
		case "edge":
			System.out.println("Launch edge");
			break;
		case "safari":
			System.out.println("Launch safari");
			break;
		case "firefox":
			System.out.println("Launch firefox -- PASS");
			break;
		default:
			System.out.println("plz pass the right browser name..." + browserName);
			flag = false;
			break;
		}
		return flag;
	}

	// Writing the same browser logic as mentioned in the Acc Criteria
	// with multiple returns

	public boolean launchBrowserTest(String browserName) {
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			System.out.println("Launch chrome --PASS");
			return true;
		case "edge":
			System.out.println("Launch edge --PASS");
			return true;
		case "safari":
			System.out.println("Launch safari --PASS");
			return true;
		case "firefox":
			System.out.println("Launch firefox --PASS");
			return true;
		default:
			System.out.println("plz pass the right browser name..." + browserName);
			return false;
		}

		// The approach in the first launchbrowser method is better
		// as we are maintaining only one flag variable and writing the return statement only one time
	}

	public static void main(String[] args) {
		// Doesn't matter how many methods we have
		// written in the class the main method will
		// only be called once

		// We can also create Objects of a class in other classes and methods also

		Testing test = new Testing();
		if (test.launchBrowser("chrome")) {
			System.out.println("enter the url"); // launching the browser....chrome
													// Launch chrome --PASS
													// enter the url
		}

		if (test.launchBrowser("firefox")) {
			System.out.println("enter the url"); // launching the browser....firefox
													// Launch firefox --PASS
													// enter the url
		}

//		if(test.launchBrowser("Chrome")) {
//			System.out.println("enter the url"); // launching the browser....chrome
//			                                     // plz pass the right browser name...Chrome
//			                                     // enter the url
//			                                     // This is incorrect O/P as user has passed the right browser name
//			                                     // but with upper case 'C'. To fix this issue we will convert the
//			                                     // browserName parameter in the launchbrowser() method
//			                                     // to lower case every time irrespective of what case user has given
//		}

		if (test.launchBrowser("Chrome")) {
			System.out.println("enter the url"); // launching the browser....chrome
													// Launch chrome --PASS
													// enter the url
		}

//		if(test.launchBrowser(" Chrome ")) {
//			System.out.println("enter the url"); // launching the browser....chrome
//                                                 // plz pass the right browser name...Chrome
//                                                 // enter the url
//			                                     // Again incorrect O/P as user has passed correct
//			                                     // browser name but with some blank spaces
//			                                     // at the left and right ends of the browser name
//			                                     // To fix this problem we will trim the left and right
//			                                     // end spaces in the browserName parameter in
//			                                     // the launchbrowser() method
//		}

		if (test.launchBrowser(" Chrome ")) {
			System.out.println("enter the url"); // launching the browser....chrome
													// Launch chrome --PASS
													// enter the url
		}

		if (test.launchBrowser("Opera")) {
			System.out.println("enter the url"); // launching the browser....Opera
													// plz pass the right browser name...Opera
													// enter the url
													// Again wrong O/P Opera is wrong browser name
													// and in the output we are getting pass
													// the right browser and then enter the URL also.
													// But if the browser is not launched how is it possible
													// to enter the URL.
													// To fix this we will change the 'flag' value in the default case
													// to false in launchBrowser() method
		}

		if (test.launchBrowser("Opera")) {
			System.out.println("enter the url"); // launching the browser....Opera
													// plz pass the right browser name...Opera
		}

		boolean f = test.launchBrowserTest("chrome");
		System.out.println(f); // launching the browser....chrome
		                       // true

		boolean f1 = test.launchBrowserTest("safari");
		System.out.println(f); // launching the browser....safari
                               // true

		boolean f2 = test.launchBrowserTest("opera");
		System.out.println(f); // plz pass the right browser name...opera
                               // false
	}

}
