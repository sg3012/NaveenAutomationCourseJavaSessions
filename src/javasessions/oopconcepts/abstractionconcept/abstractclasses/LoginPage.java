package javasessions.oopconcepts.abstractionconcept.abstractclasses;

public class LoginPage extends Page { // Will give error if we don't
										// implement the abstract methods
										// of the parent abstract class

	                                    // Cannot achieve multiple inheritance
	                                    // using abstract classes. If write
	                                    // comma separated class names after
	                                    // extends compiler will generate error

	// Hidden default constructor will be created and called here if not present

	//////////////////// CHILD CLASS- CONSTRUCTOR /////////////////////

	public LoginPage() {
		// Before executing below line(s) parent constructor will be called first
		// Parent default constructor will be called
		System.out.println("Login Page -- Default Const....");
	}

	// Overload login page constructor
	public LoginPage(int i) {
		// Before executing below line(s) parent constructor will be called first
		// Parent default constructor will be called
		System.out.println("Login Page -- Const...."+i);
		// So, the parent class DEFAULT CONSTRUCTOR will be called in any
		// case, IRRESPECTIVE of either parent or child classes
		// have parameterized constructor or not.

		// Now, if we have to call the parameterized constructor of the parent class also
		// then we will call that constructor inside the default constructor using this keyword.
		// (see page class default constructor for more info).
	}


	@Override
	public void title() {  // Overridden from page class

		System.out.println("Login Page - title");
	}

	@Override
	public void url() { // Overridden from page class
		System.out.println("Login Page - url");
	}

	@Override
	public void defaultPageTimeOut(){ // Overridden from page class
		System.out.println("Login page -- timeout = 5 secs");
	}

	public void doLogin() { // Individual method
		System.out.println("Login page -- login to app");
	}
}
