package javasessions.oopconcepts.abstractionconcept.abstractclasses;

public class AmazonTest {

	public static void main(String[] args) {
		
		/////// CONSTRUCTORS CALLS WITHOUT SUPER KEYWORD IMPLEMENTATION /////////
//		LoginPage lp = new LoginPage(); // O/P : Page -- Const....5 
//		                               // Page -- Default Const.... 
//		                                // Login Page -- Default Const....
//		                                // As soon as we create child class object
//		                                // first parent class constructor will be called
//		                                // and then child class constructor will be called.
//		
//		lp.title(); // O/P : Login Page - title. Inherited and Overridden
//		lp.url(); // O/P:Login Page - url. Inherited and Overridden
//		lp.displayLogo(); // O/P: Page -- displayLogo. 
//		                 //  Un-Iherited and non-overridden
//		Page.displayFooters(); // we will access this method
//		                       // using class name as this is
//		                       // a static method
//		                       // O/P: Page -- displayFooters
//		                       // Un-Iherited and non-overridden
//		lp.defaultPageTimeOut(); // O/P: Login page -- timeout = 5 secs
//		                         // Inherited and Overridden
//		lp.doLogin(); // O/P: Login page -- login to app
//		              // Individual method. // Un-Iherited and non-overridden
//		
//		System.out.println("------------");
//		
//		LoginPage lp1 = new LoginPage(10); // O/P: Page -- Const....5 
//		                                   // Page -- Default Const....
//		                                   // Login Page -- Const....10
		
	/////// CONSTRUCTORS CALLS WITH SUPER KEYWORD IMPLEMENTATION /////////
		LoginPage lp2 = new LoginPage(10);// Page -- Const....5
		                                   // Login Page -- Default Const....
		                                   // LoginPage lp2 = new LoginPage();
		
		System.out.println("------------");
		
		LoginPage lp3 = new LoginPage(10); // Page -- Const....5
		                                   //Login Page -- Const....10
		
		
		System.out.println("------------");
		
		// TOP CASTING IN ABSTRACT CLASSES (WITHOUT SUPER KEYWORD)
		
//		Page p = new LoginPage(); // O/P: Page -- Const....5
//		                          // Page -- Default Const....
//		                          // Login Page -- Default Const....
//		
//		p.title(); // O/P : Login Page - title. Inherited and Overridden
//		           // Reference type check PASSED.
//		p.url(); // O/P:Login Page - url. Inherited and Overridden
//		         // Reference type check PASSED.
//		p.displayLogo(); // O/P: Page -- displayLogo. 
//	                     //  Un-Iherited and non-overridden
//		                 // Reference type check PASSED.
//		Page.displayFooters(); // O/P: Page -- displayFooters
//                               // Un-Iherited and non-overridden
//		p.defaultPageTimeOut(); // O/P: Login page -- timeout = 5 secs
//		                        // Inherited and Overridden
//		                        // Reference type check PASSED.
////		p.login(); // Cannot be accessed through parent class reference
//		           // even if it is present in child class object
//		           // referred by parent class reference because Reference
//		           // Type check is FAILED
		
		// DOWN CASTING IN ABSTRACT CLASSES
		
		// Not possible at the compile time itself because we can't create
		// object of Abstract class
		
		// new Page(); // Error at compile time itself that: 
		            // Cannot instantiate the type Page
	}

}
