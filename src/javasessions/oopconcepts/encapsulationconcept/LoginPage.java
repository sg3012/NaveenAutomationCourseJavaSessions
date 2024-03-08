package javasessions.oopconcepts.encapsulationconcept;

public class LoginPage { // Login page is one of the most critical pages of the application
							// as user enters the application from this page only.
	// So, encapsulate the variables in private layer and access them
	// via public layer (getters and setters)

	String username;
	String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void doLogin() {
		System.out.println("Login with: "+username+" | "+password);
	}

}
