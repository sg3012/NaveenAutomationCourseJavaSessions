package javasessions.staticconcept;

public class MainMethodConcept {
	// WHY MAIN METHOD IS STATIC IN NATURE?

	// main method is static in nature because main is the point
	// where the program execution is started and it is
	// automatically called by JVM and not manually.
	// Now, as main method is always defined at the class level
	// if it would not be static JVM would be required to create
	// an object of the class first internally and then call the main.
	// But in JAVA the authority of Object creation relies totally on the user/developer
	// and it doesn't create Objects internally. That is why main
	// method is static.

	// main method is stored in the CMA or Meta Space.

	// WHY MAIN METHOD IS VOID IN NATURE?
	// main method is designed to call the other methods which have actual business logics
	// written in them. So, it behaves like a caller or driver method that doesn't
	// contain any business logic in it. That is why main method is void in nature

	// CAN WE OVERLOAD THE MAIN METHOD?
	// Yes (SEE BELOW)

	// BUT AFTER OVERLOADING WHICH MAIN METHOD
	// JVM WILL CALL?
	// JVM will always look for the main method with
	// the default signature which is pre-defined in JAVA
	// i.e. , public static void main(String[] args)
	// others will be treated as normal methods/
	// args is just a variable name and we can name it anything
	// like String[] x or String[] y etc.
	// If the default signature for main method is not
	// found in the program then we will not able to
	// run that JAVA file.

	// But in REAL TIME / PRACTICALLY we NEVER
	// Use the main method overloading concept
	// as it is not required at all in automation framework.

	// This concludes that static methods can also be overloaded.

	public static void main(String[] args) {
		System.out.println("this is the starting point"); // O/P this is the starting point
		MainMethodConcept.main(10); // hi
		                            // 10
		MainMethodConcept.main(10,"Shubham"); // hello
		                                      // 10Shubham
	}

	public static void main(int a) {
		System.out.println("hi");
		System.out.println(a);
	}

	public static void main(int a,String b) {
		System.out.println("hello");
		System.out.println(a+b);
	}


}
