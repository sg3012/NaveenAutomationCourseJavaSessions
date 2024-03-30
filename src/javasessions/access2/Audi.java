package javasessions.access2;

import javasessions.access1.Car;

public class Audi extends Car {

	public static void main(String[] args) {

		// This class shows which one of the access modifiers
		// have their scope within the CHILD class of a class
		// created in DIFFERENT package as the parent class.

		// We can access a variable/method with only
		// public, protected access modifiers
		// within the Child class of a class created inside a different
		// package as the parent class.
		// We cannot access a variable/method with private and default access modifiers.

		// So, within the sub class defined in a different package as parent class
		// We can access only public, protected variables/methods. No
		// access is given for private, default.

		Audi a = new Audi();
		a.name = "BMW"; // accessible as it is public
		a.price = 10000000; // accessible as it is protected
		// a.color = "Blue"; // NOT accessible as it is default
		// b.mileage = 30; // NOT accessible as it is private

		a.start(); // accessible as it is public
		a.stop(); // accessible as it is protected
		// a.billing(); // NOT accessible as it is default
		// a.refuel(); // NOT accessible as it is private
	}

}
