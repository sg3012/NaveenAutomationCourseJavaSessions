package javasessions.oopconcepts.inheritance;

public class Audi extends Car {
	// This class could be considered sibling of BMW
	// as they have both have same parent Car.
	// This class also depicts whether a sibling class can
	// inherit properties of another sibling class or not.

	@Override
	public void start() { // Overriden method from parent car
		System.out.println("Audi -- start");
	}

	public void theftSafety() { // If we try to access this method from BMW object we will get an error
		System.out.println("Audi -- theftSafety");
	}
	
}
