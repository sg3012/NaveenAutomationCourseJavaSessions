package javasessions.oopconcepts.encapsulationconcept;

public class Employee {
	// This class explains Encapsulation Concept:

	// DEFINITION: Encapsulation means hiding the data members (variables +
	// functions) of a class

	// to be accessed directly from outside the class. We only provide access
	// to private members through public layer ( or, we can say public methods ).

	// In general, during encapsulation variables are declared private and methods
	// as public

	// Public methods or layer are called getters and setters methods.

	// We access and change the private members of a class using public layer
	// (methods)
	// (as shown in EmpTest class).

	// Encapsulation ensures data hiding and security of the private members.

	// SHORTCUT to generate getters and setters methods:

	// Right click on the line you want to start generating getters and setters
	// method from
	// In the context menu mouse hover the source option.
	// In the next context menu click option "generate getters and setters"
	// From the pop-up choose what all private variables you want to use to generate
	// the methods
	// Choose one of the following access modifiers for the methods:
	// public, protected etc. (don't choose private)
	// Click generate.

	// IMPORTANT:
	// Are we really securing the data and providing data security using
	// public getters and setters methods?
	// No, we are not because ultimately user can set/change the data using setter methods.

	// Then, How can we ACTUALLY IMPLEMENT DATA SECURITY using Encapsulation?
	// We will do the following:

	// We will create some private variables. (See Amount Variable below)
	// For those the private variables we will not provide ANY public setter method
	// which can change the value of that variable.

	// We will only provide public getter methods for those private variables
	// which will supply only the value of those variables. (See getAmount() method below)

	// We will change or set the value of those private variables internally
	// in the class using some other private methods and user cannot
	// access that method also. (see calculateAmount() method below)

	// We will call these private methods (setting the value of private variables)
	// within the getter methods and return the calculated values of these private variables
	// using these public getter method.  (See getAmount() method below)

	// Now, user can leverage these public getter methods and call them outside the class
	// to get the desired values they want without actually touching the respective
	// private variables and methods. THIS IS HOW WE CAN SECURE THE DATA.

	// So, We NEED NOT Provide getters and setters for every private variables of the class.

	// So, We can say that Encapsulation is not only through
	// making variables as Private but we can also
	// make private methods and call them internally in some
	// public or private methods to achieve Encapsulation.

	// But there must some public methods in the Encapsulated class
	// so that user could access the required properties/functionalities
	// of that class


	private String name;
	private int age;
	private double salary;
	private int amount;

	// public getters and setters methods

	private void calculateShareAmount(int fee) { // private method setting the value of amount which user couldn't access
		                             // METHOD SECURITY
		int i =10;
		// int fee = 20;
		amount = i + fee;
	}

	public int getAmount(int fee) {
		calculateShareAmount(fee); // calling private calculateAmount() method to get the amount value here
		return amount;     // returning the amount which user could finally access. VARIABLE SECURITY
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


}
