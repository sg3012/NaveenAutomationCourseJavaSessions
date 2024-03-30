package javasessions.oopconcepts.encapsulationconcept;

public class LoginPageTest {

	public static void main(String[] args) {
		LoginPage lp1 = new LoginPage();
		lp1.setUsername("admin@gmail.com");
		lp1.setPassword("admin@123");
		lp1.doLogin(); // Login with: admin@gmail.com | admin@123

		LoginPage lp2 = new LoginPage();
//		lp2.setUsername("admin@gmail.com");
//		lp2.setPassword("admin@123");
//		lp2.doLogin(); // Login with: null | null, because we haven't set the values for username and password

		lp2.setUsername("cust@gmail.com");
		lp2.setPassword("cust@123");
		lp2.doLogin(); // Login with: cust@gmail.com | cust@123
	}

}
