package javasessions.oopconcepts.inheritance;

public class Car extends Vehicle {

//	 This class Explains the Inheritance concept in JAVA. In fact,
//	 every class in this package explains inheritance.
//
//   DEFINITION: Inheritance meaning a class can inherit properties from
//	 parent, grandparent, grand-grand parent etc
//
//	 But a class couldn't inherit from Siblings (classes have same parent). Not allowed in JAVA.
//
//	 A class couldn't inherit properties from child
//	
//	 Diamond problem is the one when a child is trying to inherit properties from
//	 more than one parent. This is called MULTIPLE INHERITANCE which is not
//	 allowed in JAVA
//
//	 When a class inherits properties from parent, parent inherit from
//	 grand-parent, grand parent from grand-grand parent etc then it is called
//	 MULTILEVEL INHERITANCE

// 	 DON'T Apply unnecessary inheritance between the classes. Only Establish a parent child
//   Child relationship between the classes when there is a possibility of having
// 	 Parent child relationship between them in real-world / practical use case also.

	// This method is called Overridden method
	public void start() { // no parameter
		System.out.println("Car -- Start");
	}

	// This method is called Overridden method
	public void start(int i, String b) { // One String and int parameter with exact same sequence
		System.out.println("Car -- Start--with parameters");
	}

	// This method is called Overridden method
	// @Override
	// public void engine() { // Engine method is overridden here in the child
	// class (Car) of Vehicle as well as the grand child
	// (BMW) of Vehicle. But at the time of calling
	// using BMW reference, the engine method
	// of BMW class will be given preference.
	// So, internally the method gets overridden from
	// parent of BMW i.e, CAR.
	// So, if there is multilevel of method
	// overriding in the child, grand child etc. classes
	// we can say that the method in the last child class
	// gets overridden from the nearest parent / grand parent or any
	// other super class implementing the method.
//		System.out.println("Car -- Engine");
//	}

	public void stop() {
		System.out.println("Car -- stop");
	}

	public void refuel() {
		System.out.println("Car -- refuel");
	}

	// Cannot be overridden as it is static. But they can be inherited
	public static void billing() {
		System.out.println("Car -- Billing");
	}

	// Cannot be overridden as well as Inherited as it is private
	private void testing() {
		System.out.println("Car -- Testing");
	}
	
	// Cannot be overridden but can be inherited as it is final method 
	public final void power() {
		System.out.println("Car -- Power");
	}
	
	// STATIC AND FINAL METHOD IN PARENT
	// Cannot be Overridden but can be inherited as this is static and final both.
	public static final void ABS() {
		System.out.println("Car -- ABS");
	}
	
	// Encapsulating private method call in public method
	public void carTesting() {
		testing();	
	}
	
	private static void testing1() {
		System.out.println("Car -- Testing1");
	}
}
