package javasessions.oopconcepts.encapsulationconcept;

public class Employee {
	// This class explains Encapsulation Concept:

	// DEFINITION AND CONCEPT BRIEF: 
	// 1. Encapsulation means combining data and the functions that 
	// work on that data into a single unit, like a class providing
	// a controlled access and change rights over some private
	// members of the class.
	
	// 2. Encapsulation means hiding the required data members or functions (variables +
	// functions) of a class to be accessed directly from outside the class (private). 
	// We only provide access to private members through public layer 
	// ( or, we can say public methods ). 
	
	// 3. All the private member variables and member functions plus public functions 
	// together make a cohesive unit (a unit consisting of same type of things. All these
	// private functions, variables and public methods are of same type i.e., the class type). 
	
	// 4. The word Encapsulation comes from the English word CAPSULE where internal contents are
	// protected. Now, to understand the concept of capsule take example of human cell
	// which contains some important things like organelles which are not exposed 
	// (private members) to external substances, some protein channels(public) at the cell's
	// surface which allow some specific substances to pass through to the cell. So,
	// think of these private organelles as private variables+functions of the class,
	// public protein channels as public getter/setters to access and change private variables
	// and the cell as the class or capsule itself. So, imagine class itself as 
	// the actual container or capsule that provides a boundary full of getter/setters
	// to access it's private members/contents. Getters and setters are on the surface
	// boundary of capsule.
	
	// 5. Following are the members of the class in context of encapsulation:
	//  --> Private member variables and methods
	//  --> Public methods (getters and setters)
	
	// 6. During runtime or in actual implementation terms the class's objects
	// are the actual capsule that contains their own copy of it's private 
	// and public members of the class. It provides public getters and setters
	// to access or change the private functions or variables of the class.
	// The class is a logical thing that defines the rules for encapsulation
	// i.e., what will be private and what public.

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
	// private variables and methods. THIS IS HOW WE CAN SECURE THE DATA AND THIS
	// IS THE REAL-TIME USE OF ENCAPSULATION/DATA MEMBERS HIDING where we are not
	// allowing user to change/set the values of private data members anyhow 
	// and only providing a way to only ACCESS/SEE their respective values. 
	// Also, the main purpose of creating those private methods and
	// changing implementing the logic to change the value(s) of private
	// variables is restricting the user of that class to actually change
	// the logic for changing the values of those private variables
	// according to their use.

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
