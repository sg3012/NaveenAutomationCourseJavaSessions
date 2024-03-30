package javasessions.oopconcepts.constructorconcept;

public class LoginTest {

	// This class behaves as the runner/driver/caller class for the
	// LoginPage class utilising it's methods and performing
	// the actual user actions and test them.

	// The main purpose of creating this class is
	// to show for every new Object creation the runner
	// class has to create new objects but the same
	// constructor template will be used every time a new Object
	// is created. We don't need to create separate constructors
	// every time for creating new Object.

	public static void main(String[] args) {

		// Shubham Object
		LoginPage lp1 = new LoginPage("shubham@gmail.com", "Test@1234");
		lp1.doLogin();// login to app
		             // entering username: shubham@gmail.com
		             // entering password: Test@1234
		             // User is logged in

		lp1.resetPwd(); // reset my password

		// Neil Object
		LoginPage lp2 = new LoginPage("Neil@gmail.com", "Neil@1234"); // At this line
		                                                              // No need to create new constructor
		                                                              // the already created constructor
		                                                              // Template will be used from the login
		                                                              // Page class
		lp2.doLogin(); /* login to app
                          entering username: Neil@gmail.com
                          entering password: Neil@1234
                          User is logged in
		             */

		lp2.resetPwd(); // reset my password






	}

}
