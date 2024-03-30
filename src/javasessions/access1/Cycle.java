package javasessions.access1;

public class Cycle {

	public static void main(String[] args) {

		// This class shows which one of the access modifiers
		// have their scope within a class (not a sub-class of any other class)
		// created in the SAME package as some other class(s).

		// This cycle class is defined within the same package as Car and BMW classes.

		// We can access a variable/method with any
		// access modifier(public, protected, default)
		// except private within a class created inside the same
		// package as some other class(s).
		// So, within a class defined in the same package as
		// as some other class(s) all variables / methods are
		// accessible except private ones

		Car c = new Car();
		c.name = "Car"; // accessible as it is public
		c.price = 1000000; // accessible as it is protected
		c.color = "Blue"; // accessible as it is default
		// c.mileage = 30; // NOT accessible as it is private

		c.start(); // accessible as it is public
		c.stop(); // accessible as it is protected
		c.billing(); // accessible as it is default
		// c.refuel(); // NOT accessible as it is private






	}

}
