package javasessions.oopconcepts.constructorconcept;

public class LoginPage {
	String userName;
	String password;

	// This is the constructor used to initialize the object of this class
	public LoginPage(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	// This is a feature method defining the login functionality
	public void doLogin() {
		System.out.println("login to app");
		System.out.println("entering username: "+userName); // Can access the username class variable directly
		                                                    // here because it is also non-static and part of the
		                                                    // object accessing it

		System.out.println("entering password: "+password); // Can access the password class variable directly
                                                            // here because it is also non-static and part of the
                                                            // object accessing it
		System.out.println("User is logged in");
	}

	// This is a feature method defining the reset password functionality
	public void resetPwd() {
		System.out.println("reset my password");
	}



}
