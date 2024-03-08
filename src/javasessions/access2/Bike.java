package javasessions.access2;

import javasessions.access1.Car;

public class Bike {

	// This class shows which one of the access modifiers
	// have their scope within a class (not a sub-class of any other class)
	// created in a DIFFERENT package as some other class(s).

	// This Bike class is defined within a different package as Car, BMW and Cycle
	// classes.

	// We can access a variable/method with only
	// public access modifier within a class created inside a different
	// package as some other class(s).
	// We cannot access a variable/method with private, protected and default access modifiers.
	
	// So, within a class defined in a different package as
	// as some other class(s) we can access only 
	// public variables/methods. No access is given 
	// for private, protected and default.
	
	// IMPORTANT : We have to create an object of the same class
	// whose properties we want to access in the other class

	public static void main(String[] args) {

		Car c = new Car();
		c.name = "BMW"; // accessible as it is public 
//		c.price = 10000000; // NOT accessible as it is protected
//		 c.color = "Blue"; // NOT accessible as it is default
//		 c.mileage = 30; // NOT accessible as it is private
		
		c.start(); // accessible as it is public 
		// c.stop(); // NOT accessible as it is protected
		// c.billing(); // NOT accessible as it is default
		// c.refuel(); // NOT accessible as it is private
	}

}
