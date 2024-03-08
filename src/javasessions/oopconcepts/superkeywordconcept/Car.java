package javasessions.oopconcepts.superkeywordconcept;

public class Car extends Vehicle {
	
	// This class shows the use of Super keyword
	
	 int min_speed = 100; // Individual variable of Car
	
	public Car() {
		this(90); // parameterized constructor Car(int i) will be called
		System.out.println("Car default const......");
	}
	
	public Car(int i) {
		System.out.println("Car const......"+i);
	}
	
	public void speed() {
		System.out.println("Car Speed");
	}
	
	// We can access static methods also using super keyword
	public static void testing() {
		System.out.println("Car -- Testing");
	}

}
