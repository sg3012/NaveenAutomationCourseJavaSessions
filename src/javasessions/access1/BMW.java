package javasessions.access1;

public class BMW extends Car {

	// This class shows which one of the access modifiers
	// have their scope within the CHILD class of a class
	// and in SAME package as the parent class.

	// We can access a variable/method with any
	// access modifier(public, protected, default)
	// except private within the Child class of a class created inside the same
	// package as the parent class.
	// So, within the sub class defined in the same package as parent class
	// all variables / methods are
	// accessible except private ones

	public static void main(String[] args) {

		BMW b = new BMW();
		b.name = "BMW"; // accessible as it is public
		b.price = 10000000; // accessible as it is protected
		b.color = "Blue"; // accessible as it is default
		// b.mileage = 30; // NOT accessible as it is private

		b.start(); // accessible as it is public
		b.stop(); // accessible as it is protected
		b.billing(); // accessible as it is default
		// b.refuel(); // NOT accessible as it is private


	}

}
