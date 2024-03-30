package javasessions.oopconcepts.inheritance;

public class TestCar {

	public static void main(String[] args) {

		// Child class reference pointing to child class Object
		BMW b = new BMW();
		b.stop(); // Inherited method. Can access parent property using child class object
					// O/P = Car -- stop

		b.refuel(); // Inherited method. Can access parent property using child class object
					// O/P = Car -- refuel

		b.start(); // Overridden method from car class. It will decide at the run time and call
					// the BMW child class's start method (because of Reason 1 below)
					// O/P = BMW -- start

		b.autoParking(); // Individual method of child class.
							// O/P= BMW -- autoParking. As it will call the child class (BMW) auto-parking
							// method
		b.engine(); // Grand child class BMW can inherit and access
		            // grand parent (Vehicle) class's properties
		            // without any problem
		            // O/P - Vehicle -- Engine

		b.power(); // Inherited. Possible. We CAN INHERIT FINAL methods in JAVA.
		           // O/P : Car -- Power
		Car.billing(); // Inherited static method. Possible from car class
		// b.testing(); // Not possible as this is private method.
		b.power();   // Inherited. Possible from car class

		//b.theftSafety(); // Not possible to inherit individual method of sibling Audi
		                 // and we get error that this method is not defined for BMW

		// Reason 1 : When we are pointing the child class reference to the child
		// class Object only and try to access the overridden method from parent class
		// JAVA will always give preference to Child class Overriding method while
		// calling. Because
		// JAVA assumes that if you have already overridden a method in the child
		// class and written your own logic then there is no use to call
		// the parent class Overridden method using the child class reference and
		// Object.

		System.out.println("----------");

		Audi au = new Audi();
		au.start(); // Overridden method from Audi
		au.theftSafety(); // individual method of Audi
		au.stop(); // Inherited from Car
		au.refuel(); // Inherited from Car
		Car.billing(); // Inherited static method of Parent class. Possible
		au.power(); // Inherited final method of parent class. Possible
		Car.ABS(); // Inherited static final method of parent class. Possible.

		System.out.println("----------");

        // Parent reference pointing to parent class Object
		Car c = new Car();
		c.start(); // Individual method of car class. It will call
					// parent class start method (because of Reason 2 below )
					// O/P = Car -- Start

		// Reason 2 : When we are pointing the parent class reference to the parent
		// class Object only and try to access the overridden method from parent class
		// JAVA will always give preference to parent class Overridden method while
		// calling. Because parent class couldn't take anything from the child
		// So, compiler decides at the compile time only that it must
		// call start() from Parent class only.
		c.stop(); // O/P - Car -- stop
		c.refuel(); // O/P - Car -- refuel
//		c.autoParking(); // Error, method is undefined. Because parent class couldn't access
//		                 // and Hence, override properties from child class
		c.engine(); // The child class Car can inherit and access
		            // parent class vehicle's properties without
		            // any problem
		            // O/P: Vehicle -- Engine

		System.out.println("----------");

		// child class Object pointed by Parent class reference

		// TOP CASTING (WITH PARENT):
		Car c1 = new BMW(); // This is also called TOP CASTING or up-casting in JAVA where
		                    // Parent class reference pointing to child class Object.
		                    // This means that EVERY BMW IS A CAR (considering that BMW doesn't make Bike)

		// Below lines explain the concept of REFERENCE TYPE CHECK in JAVA:

		c1.start(); // Reference type check will be passed because this method
		            // is in parent class (Car) and all properties of parent are visible
		            // in child class through inheritance. So, parent ref variable will be able
		            // to call the start method but at run time JVM will decide to call
		            // the BMW class start method because it is overridden in it. But
		            // start is also related to Parent that is why parent ref variable
		            // is able to call start.

		c1.stop();  // Reference type check will be passed because this method
                    // is in parent class (Car) and all properties of parent are visible
                    // in child class through inheritance. So, parent class ref variable
                    // can access it's own properties which are stored in child class Object

		c1.refuel();  // Reference type check will be passed because this method
                      // is in parent class (Car) and all properties of parent are visible
                      // in child class through inheritance. So, parent class ref variable
                      // can access it's own properties which are stored in child class Object

		// c1.autoParking(); // Reference type check will be failed because this method
		                  // is only defined in child class (BMW) and parent(CAR) couldn't access
		                  // properties of child class through inheritance. So, parent class
		                  // reference variable cannot access child class individual properties
		                  // even though the object is pointed by parent class reference but
		                  // there is no connection between parent class ref and child class
		                  // individual property.
		c1.engine(); // Reference type check passed because child class (Car)
		             // as well the grand child class(BMW) can access properties
		             // of Grand parent (Vehicle). So, here engine method
		             // is connected to the Car class through inheritance
		             // from parent Vehicle. That is why we are able
		             // to access engine method using car class reference.
		             // O/P : Vehicle -- Engine

		System.out.println("---------------");

		// Child class Object pointed by GRAND Parent class reference

		// TOP CASTING (WITH GRAND PARENT):

		Vehicle v = new BMW();
		// v.start();  // Error, Reference type check will be failed because this method
        // is only defined in child class (CAR) and parent (VEHICLE) couldn't access
        // properties of child class through inheritance. So, parent class
        // reference variable cannot access child class individual properties
        // even though the object is pointed by parent class reference because
        // there is no connection between parent class ref and child class
        // individual property.
		// Same error will be there if we try to access start(), stop(), refuel(),
		// and autoparking() methods as they are from child and grand child classes not the
		// vehicle class.

		v.engine(); // Vehicle -- Engine

		// Parent class object pointed by child class reference:

		//DOWNCASTING (WITH PARENT):
		// BMW bmw = new Car(); // This line tries to implement DOWNCASTING but it is not allowed
		                     // In JAVA. It will give you an error that cannot convert from car
		                     // to BMW
		                     // This means that EVERY CAR IS NOT BMW

		// To write down casting looking code we have use following syntax:

		//BMW bmw = (BMW) new Car(); // We have explicitly casted the car Object to BMW.
		                           // This means that a new car is created and
		                           // converted (modified) to BMW.
		// In the above line compiler will not give any error
		// but at run time we will get ClassCastException.
		// So, it seems that we have down casted the parent class
		// to child because compiler doesn't give any error (because it
		// doesn't find any) but in reality the code will not run at all.

		// Why classcastException ? Why Down casting is not allowed in JAVA?
		// Ans: Consider the parent class object as a big box and child class
		// reference as a small box. Now, can we fit big one into smaller one?
		// Yes, by folding it or cutting into multiple pieces (or any other way)
		// but after fitting into small box is that bigger box usable now?
		// No, it is not usable. So, the same thing happens with parent class object
		// also. It becomes distorted when you try to downcast it by casting explicitly.

		// bmw.start(); // classcastexception in the above line itself. Control will not reach this line

		// GRAND PARENT class object pointed by GRAND CHILD class reference:

		//DOWNCASTING (WITH GRANDPARENT):

		// BMW bmw1 = (BMW)new Vehicle(); // Again classcastexception because of the same reason above
		                                // (Down casting with parent)

		// HOW TO CALL THE STATIC METHODS OF PARENT OR CHILD CLASS WHICH ARE EXACTLY SAME

		Car.billing(); // static method from child
		               // O/P: BMW -- Billing

		Car.billing(); // static method from parent
		               // O/P: Car -- Billing

		System.out.println("--------------");

		// BUT WHAT IF WE REMOVE THE billing() or any other static method implementation
		// from the child class?

		// BMW.billing(); // Now, this line calls the inherited method
		               // from parent class (Car). So, we can INHERIT
		               // STATIC methods in JAVA.
		               // O/P : Car -- Billing

		// LIMITATIONS OF TOPCASTING:
		// We cannot access the individual method of the child class using parent reference.

	}

}
