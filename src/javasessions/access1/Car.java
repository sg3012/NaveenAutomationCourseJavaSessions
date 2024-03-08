package javasessions.access1;

public class Car {
	// This class shows how many types of access specifiers are there
	// in JAVA. What is their scope and how we can use them.
	
	// There are 4 types of access modifiers/keywords in JAVA:
	// 1. public - with the keyword of same name
	
	// 2. protected - with the keyword of same name
	
	// 3. private - with the keyword of same name
	
	// 4. default - with no keyword defined explicitly. Meaning, 
	// if we write a variable / method name without using first
	// 3 keywords then it is considered a variable with default access.
	// So, variables with access modifier keywords written are considered default.
	
	// Within the same class the scope of all access modifiers is public. Meaning,
	// user can access a variable/method with any access modifier 
	// (private, public, protected, default) within the same class. 
	// So, within same class all variables / methods are public.
	
	public String name;
	protected int price;
	private int mileage;
	String color;
	
	public void start() {
		System.out.println("Car--start");
	}
	protected void stop() {
		System.out.println("Car--stop");

	}
	private void refuel() {
		System.out.println("Car--refuel");
	}
	
	// Method with default access modifier
	void billing() {
		System.out.println("Car--billing");
	}
	

	public static void main(String[] args) {
		
		Car c = new Car();
		
		// I can access all variables of a class defined with any access modifiers, 
		// within the same class. 
		c.name = "Car";
		c.price = 1000000;
		c.color = "black";
		c.mileage = 35;
		
		// I can access all variables of a class defined with any access modifiers, 
	    // within the same class. 
		c.start();
		c.stop();
		c.refuel();
		c.billing();	
	}

}
