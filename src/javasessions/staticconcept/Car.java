package javasessions.staticconcept;

public class Car {

	// This class depicts the REAL TIME use cases when we should use the static
	// keyword for methods and variables

	// FOR VARIABLES:
    // We should use static keywords for variables as depicted in the following examples:
	// In the below car example, every car Object (a real car from car class)
	// will have same value for the property wheels i.e. , every car has 4 wheels
	// So, When we know that some properties for all the objects of a class
	// will have the same value in any case always then we declare those properties
	// with static keyword. So, that we do not create separate copies of those properties
	// for every new Object. Those, properties will only have one copy created
	// in the CMA. Thereby, improving memory utilization.

	// Browser class will have different names for all the browsers. So, browser
	// name should be
	// non-static

	// Browser version will have different versions for all the browsers. So,
	// browser version should be
	// non-static

	// FOR METHODS:

	// We should use static keyword for functions
	// whenever we want to create some Utilities
	// having some Generic functions that have a common functionality
	// in most of the cases. Then we define those methods as static
	// For e.g. : function displaying Logo of an application will be static
	// as Logo will be same on all pages, function displaying url
	// of pages will be non-static as all pages will have different URL
	// functions displaying footer, searchbar, Header Nav, Categories in header nav
	// will be static

	// If we think that all the static properties MUST not
	// be changed later in the code by any developer
	// then we should declare all of those properties as final also using final keyword.

	// All final properties should be declared with Upper case letters

	// In most cases static properties are declared as Final.

	// If we don't assign value to a final variable it will start giving error
	// as Final variables must be assigned a value. We have to assign the value
	// in the same line which they are declared.

	// DIFFERENCE between static and final is:
	// static means a common property value for all objects, but they could be changed
	// later in the code if user requires.
	// Final mean a common value but it cannot be changed at all even
	// if the user tries to change it

	String name;
	String engineNumber;
	String chasisNumber;
	double price;
	static final int WHEELS = 4; // static final class variable

	public static void displayLogo() {

	}

	public void getUrl() {
		
	}

	public static void main(String[] args) {

		// static int i = 10; // Error, local variables couldn't be made as static
		                      // because they are associated with class directly.
		                      // and they are stored at common memory allocation
		                      // area as soon as the class is loaded. So, whenever
		// sees a variable declared as static it checks under which scope it is declared
		// directly. If it is directly under class scope then there will not be any error
		// else if it is declared directly under a method scope then it will throw an error.
		final int i =10; // this is possible. Local variables can be made as final
		
		Car c1 = new Car();
		c1.name = "Audi A6";
		c1.chasisNumber = "AAAJJ18728482";
//		c1.wheels = 4; // Instead of assigning wheels like this
		// for every new object create it as static and assign
		// at the class level itself.

		Car c2 = new Car();
		c2.name = "Audi Q5";
		c2.chasisNumber = "AUDIJJ18728482";
//		c2.wheels = 4;

		Car c3 = new Car();
		c3.name = "BMW X7";
		c3.chasisNumber = "BMWJJ18728482";
//		c3.wheels = 4;

//		Car.WHEELS = 5; // The final field Car.WHEELS cannot be assigned

		System.out.println(c3.name + " " + c3.chasisNumber + " " + Car.WHEELS); // BMW X7 BMWJJ18728482 4

	}

}
