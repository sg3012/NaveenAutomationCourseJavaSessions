package javasessions.oopconcepts.constructorconcept;

public class Constructor {
	// PRACTICAL USE CASE : This class shows what all code should be written inside a constructor

	// Constructor must always be used to initialize the class variables or the objects
	// Not to write the actual business logic

	// Business logic must always be written in the normal methods with the corresponding name

	// Those normal methods are called feature methods in real time

	// If you write a business logic inside a constructor and try to return
	// a value from it, you will not be able to do that because
	// constructor couldn't return anything

	// NEVER EVER WRITE Business logic inside the constructor

	String name;
	int custId;
	String city;
	long phoneNumber;

	public Constructor(String name, int custId, String city, long phoneNumber) {
		this.name = name;
		this.custId = custId;
		this.city = city;
		this.phoneNumber = phoneNumber;
	}

	public int getSalary(int totalCTC , int bonus) {
		return totalCTC + bonus;
	}


}
