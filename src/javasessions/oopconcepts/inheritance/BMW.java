package javasessions.oopconcepts.inheritance;

public class BMW extends Car{
	// This class also explains Inheritance
	// But it mainly explains Overriding

	// METHOD OVERRIDING: When we have a method in the parent class
	// and a method in the child class with the same name, same
	// number of parameters, same type and sequence of type of parameters,
	// same return type as the parent class i.e., the exact same signature as the
	// parent class

	// Keep in mind that for Overriding the method must have the exact same
	// signature as
	// the same method in parent classSS

	// So, in overriding method return type matters but overloading it's not.
	// Meaning, the
	// Overridden and Overriding methods must have the same return type

	// This method is overridden from car class and called Overriding method
	// We can use annotation override also to differentiate it from
	// the parent class

	// WHAT IS THE REAL USE CASE OF OVERRIDDING?
	// For e.g. There are some methods in the parent class
	// which implement a feature in some way but in the child class
	// we want to implement that feature in a different way using some basic
	// logic from the same method in the parent class then we will use the
	// Overriding concept.

	// It is not mandatory to write @Override annotation in the child class
	// but we should use it to make the code more readable and don't create any
	// confusion

	// Method is also called RUN TIME/DYNAMIC POLYMORPHISM as JAVA decides at the
	// run time which
	// method to be called (Overridden method from parent or Overriding method from
	// child)

	// IMPORTANT: When you create a child class object pointed by parent class
	// reference
	// and call the overridden method from the parent class using the reference
	// the suggestions that will come after the dot(.) notation
	// are coming at the compile time and compiler decides/thinks
	// the method is coming from parent class. That, is why suggestion(s) in the
	// context menu
	// via Intellisense are coming for the parent class overridden method.

	// Method Overriding will always happen either from parent to child or
	// Grand parent to Grand child

	// CAN WE INHERIT FROM A FINAL CLASS?
	// No inheritance is not possible.
	// It will give you error: The type <child class> cannot subclass the final class <parent class>

	@Override
	public void start(int a, String h) { // One String and int parameter with exact same sequence
		System.out.println("BMW -- start--with parameters");
	}

	@Override
	public void start() {
		System.out.println("BMW -- start");
	}

//	@Override
//	public void engine() { // Considered overridden from car class at compile time
//		                   // but ultimately at the run time
//		                   // this method will only be given preference
//		                   // while calling
//		System.out.println("BMW -- Turbo Engine");
//	}

	// Individual method of child class
	public void autoParking() {
		System.out.println("BMW -- autoParking");
	}

//	@Override
//	public static void billing() { // IMPORTANT (INTERVIEW QUESTION) : Can we Override and inherit
	                               //   Static Methods in JAVA?
	                               // Inheritance is possible

//		                           // Overriding is not possible. Error: The method billing() of type
//		                           // BMW must override or implement a supertype method
//		                           // So, we cannot override static methods in JAVA because
//		                           // Overriding is a run time Polymorphism which can
//		                           // only be implemented using objects and references
//		                           // but static is not associated with any object creation.
//
//
//
//		System.out.println("BMW -- Billing");
//	}

	// BUT WHAT IF we remove the override annotation from the above method
	// as shown below?

//	public static void billing() { // NOW, if we write billing method from car class in the child
	                               // class like this it will be treated as individual method
//		                           // of child class (not overridden) and hides the same method from Parent class
//		                           // here. This concept is called METHOD HIDING
//		                           // Method hiding always happens when there are same methods (every thing same
//		                           // in signature) in the parent and child classes and both MUST be STATIC.
//		System.out.println("BMW -- Billing");
//	}

//	@Override
//	private void testing() {  // IMPORTANT (INTERVIEW QUESTION) : Can we Override or inherit
	                          // private Methods in JAVA?
//                            // Error: The method billing() of type
//                               BMW must override or implement a supertype method
	                          // No, we cannot do overriding.

	                          // Inheritance is also not possible as method is not visible at all.
	                          // The only way to access that outside parent is calling that method
	                          // in some public method in parent and then calling that public
	                          // outside parent (ENCAPSULATION).
//		System.out.println("BMW -- Testing");
//	}

//	@Override
//	public final void power() {  // IMPORTANT (INTERVIEW QUESTION) : Can we Override or inherit
	                             // final Methods in JAVA?
//                             Error: Cannot override the power method from Car
//	                           No, we cannot override. Because, if it was then any child class would
	                           // override the functionalities written in final methods
	                           // and change them which aren't meant to be changed.
	                           // For e.g: If there is a displayLogo() method in a page class
	                           // that displays a company's logo and declared as final.
	                           // Now, if JAVA would have allowed overriding the final methods
	                           // then any child page classes would have overridden the method,
	                           // change and display the LOGO of the company which is illegal.

	                           // Inheritance is possible for final methods
//		System.out.println("BMW -- POWER");
//	}


	// Individual private method of BMW. This is not method hiding, it is only possible
	// in case of STATIC methods
	private void testing() {  // Can we have private methods in the child class
		                      // same as the parent class?
		                      // Yes, as we have written like this
		System.out.println("BMW -- Testing");
	}

	// Individual method of child class.
	private static void testing1() {  // Can we have private static methods in the child class
		                              // same as the parent class?
                                      // Yes, as we have written like this. But this static
		                              // method will HIDE same static method from parent class
		System.out.println("BMW -- Testing1");
	}

}
