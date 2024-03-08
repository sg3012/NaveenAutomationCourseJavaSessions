package javasessions.oopconcepts.abstractionconcept.interfaces;

public interface UsMedical extends WHO, UN { // We have use to use extends keyword
	// to establish parent child relationship between interfaces.

	// An Interface is a construct that defines
	// a blueprint of a class. It means
	// what all are the basic functionalities a class
	// falling under that interface should have. Every class
	// falling under an interface writes the actual
	// logic for implementing those functionalities and
	// every different class has a different logic.

	// An Interface only declare the method bodies, no
	// implementation at all

	// By default all the methods will be treated as abstract in an interface
	// It is not mandatory to write the abstract keyword in the method signature.
	// We may or may not write it.

	// Interfaces can also have common methods like emergencyServices method defined
	// below

	// No objects of interfaces can be created any how. But Why?
	// Because interfaces just provide method declarations and no logics
	// or implementations of those functionalities. So, there is
	// no point of allowing users to create objects of interfaces.
	// If it would be allowed user would directly go and create interface objects
	// which is no of use. That is why in JAVA or any other OO programming
	// language we can create objects of classes only because they are the ones
	// which are implementing the interfaces.

	// Can we create constructors in Interface?
	// Not possible because constructor is called when object is created and
	// we cannot create object of an interface any how

	// Can we make interfaces as final ?
	// No because we must override and implement interface methods somewhere
	// But if we declare the interface as final no class could override
	// and implement the interface methods. So, interfaces cannot be final

	// Can we make interface methods as final ?
	// No because of the same reason as in above question

	// Can we create private methods interface?
	// No because private methods cannot be overridden at all.
	// But we must to override and implement all the methods of an interface.

	// An interface is an Abstract feature and defines a concept in OOP
	// which is called Abstraction. It means hiding the implementation details.

	// So, Encapsulation provides data hiding by restricting access to certain
	// variables
	// by declaring them as private whereas the Abstraction helps in implementation
	// hiding
	// by providing / creating interfaces or Abstract classes.
	
	// Interfaces allow 100% abstraction up to JDK 1.8 i.e., having all methods without any implementation.
	
	// But interfaces can allow partial abstraction also JDK 1.8 onwards i.e., we 
	// can methods with body

	// A single interface can have multiple parents
//	public void physioServices() { // Error cannot define method body in an interface
//		
//	}

	// Below methods can also be called as method prototypes

	public void physioServices();

	public void cardioServices();

	public void ENTServices();

	public void emergencyServices(); // common method

	// We can create a method that takes a parameter inside interface
	public void test(int a);

	// We can create a method that takes a parameter and returns something inside
	// interface
	public String get(int a);

	// We can also overload the methods inside interface
	public String get(int a, int b); // Now, because get method is overloaded it has to be implemented
										// the number of times it has been overloaded in the interface.
										// Because overloading means the same method is structured some other
										// way so we have to implement all the different structures.

	int min_fee = 10; // We can declare variables also in the interface. But interface variables are
						// always
						// FINAL and STATIC by DEFAULT. We don't need to put static and final
						// explicitly.
						// But we can write it (if we want).

	// Why these variables are static and final?
	// Because we cannot create objects of interface that is why they are static.
	// They are final because interfaces in JAVA define some rules
	// which all implementing classes must follow. Now, if the variables
	// wouldn't be made final any child class would change those variables
	// accidentally or intentionally. Which would violate the rules defined by the
	// interface.

	// For e.g : In this interface USMedical is the medical board / department of
	// the govt.
	// that defines minimum fees to be charged by any hospital (including Fortis).
	// So, that
	// has to be constant across all the hospitals and no hospital can change that.
	// That is why variables
	// are final

	// Can we only declare static abstract methods inside interface?
	// No, because we need to override all methods from the interface but static
	// methods cannot be overridden. See method declared below:

	// public static void test1(int a); // Error, this method needs a body instead
	// of semicolon.

	@Override
	public void covidVaccination(); // We can achieve overriding like syntax for the methods
									// inside an interface from a parent interface
	// FEATURES : JDK 1.8 Onwards

	// INTERVIEW: Is it possible to create methods with bodies inside an Interface ?

	// We can write static methods having method body (business logic) inside
	// interfaces like this:
	// This feature was given in JAVA so that if there is an interface that must
	// implement
	// some of it's own functionalities (related to only the interface) then it can
	// be done
	// by declaring a method and providing its related body.
	// We can do this by using static keyword only. Otherwise, it will give error
	// because at that time it will be considered a non-static for which we have
	// to create an object to access that method which is not possible in JAVA

	public static void USMedPharmacy() { // But these kind of methods will not be treated as abstract.
											// Meaning abstract methods cannot be static inside interfaces
											// as defined above.
		System.out.println("US -- Med Pharmacy");

		// INTERVIEW: Can this method be overridden in the implementing class?
		// No, because static methods cannot be overridden. But we can
		// have exactly same method (signature + body) in the child implementing class
		// in which case the child class method hides this method by a concept called
		// Method Hiding.

	}

	// Can I overload static method in an interface?
	// Yes, like below:

	public static void USMedPharmacy(int a) {
		System.out.println("US -- Med Pharmacy");

	}

	// INTERVIEW : Can we declare a non-static method with body inside an interface?
	// Yes, it is possible if you are using JDK 1.8 and above. Also, you must
	// declare the method as "DEFAULT" like this:

	default void billing() {
		System.out.println("US -- billing");
	} // How to access this method?
		// As this method is non-static it can be inherited by the implementing child
		// classes
		// (FortisHospital in this case) and can be accessed via Child class object
		// reference (Shown
		// in test hospital.java)

	// INTERVIEW : Can I override non-static method with body from an interface?
	// OR
	// Can I override default method of an interface?

	// Yes, we can do it but make sure that access specifier is of greater or larger
	// visibility
	// than default i.e., you cannot use default but can only use public (shown in
	// FortisHospital.java)

	// Can I overload default method in an interface?
	// Yes, like below:
	
	default void billing(int a) {
		System.out.println("US -- billing");
	}
}
