package javasessions.fundamentals;

public class StringWithQuotes {

	public static void main(String[] args) {

		// UC1: Display string output with some strings surrounded with quotes "".

		String str = "I love \'JAVA\'and it's concepts"; // O/P should be like - I love "JAVA" and it's concept
		// We cannot surround the string JAVA directly
		// with double quotes as double quotes have a special meaning
		// in JAVA to store Strings.
		// So, to format the O/P string in correct way
		// we will escape the double quotes with backslash as shown.
		System.out.println(str);

		String st = "This is my \"JAVA\" code and \"Selenium\" code";
		System.out.println(st); // This is my "JAVA" code and "Selenium" code

		// UC2: Appending username and password with the url in the form of parameters

		String username = "admin";
		String password = "admin123";

		System.out.println("Username is:" + username + "Is displayed");

		String url = "https://" + username + ":" + password + "@abc.com/login.html";

		System.out.println(url); // https://admin:admin123@abc.com/login.html
								// username and password variables will be resolved to
								// correct values at run time.

		// UC3: Appending strings while creating X-paths at run time in Selenium.

		String userName = "Shubham"; // this username is changing. We want to fetch it
		                            // and pass it to the desired xpath as shown below during
		                            // run time
		String xpath = "//input[text()='userName']";

		System.out.println(xpath); // O/P: //input[text()='userName']
		                           // because userName will not be recognised as a variable
		                           // and considered a string literal itself.

		xpath = "//input[text()='+userName+']"; // O/P: //input[text()='+userName+']
		                                        // We also cannot append single quote directly as shown
		                                        // in this line as plus will also start behaving like a string literal

		System.out.println(xpath);

		xpath = "//input[text()='"+userName+"']"; // O/P : //input[text()='Naveen']
		                                          // Now, we will get Correct value for
		                                          // xpath in the O/P if we pass the variable as shown here
		                                          // in the xpath string.

		System.out.println(xpath);


	}

}
