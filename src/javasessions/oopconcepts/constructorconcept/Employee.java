package javasessions.oopconcepts.constructorconcept;

public class Employee {
	// This class explains the constructor concept
	// DEFINITION OF CONSTRUCTOR:
	// For a method to qualify for constructor both the conditions below must be satisfied
	// at all times:
	// Constructors have the same name as the class name
	// They DON"T have a return type ever (NOT EVEN VOID).

	// To call a constructor we just need to create object of the class and it
	// be called automatically. Which constructor will be called depends on
	// the arguments passed while creating the object.

	// Constructor is not part of the Object. They will not be stored
	// either in Heap or stack instead there will be a separate
	// memory allocated to them. That memory is allocated as
	// class Loaders as Constructors behave as class loaders

	String name;
	int age;
	String city;

	public Employee() { // 0 param constructor or default constructor
		// This is a constructor
		System.out.println("I am deafult constructor");
	}

	// We can also overload the constructors like this:
	public Employee(int a) { // 1 param constructor
		System.out.println(a);
	}

	public Employee(int a, int b) { // 2 param constructor

	}

    public Employee(int a, String b) { // 2 param constructor with different data types
    	System.out.println(a+" "+b);

	}

    public Employee(String a, int b) { // 2 param constructor with different sequence of data types

    }

//	public int Employee() {
//		// This is not a constructor and just a method
//		// as it is returning a value
//		return 100;
//	}

	public static void main(String[] args) {
		// Let's say we have a requirement of creating multiple Objects of employee
		// and assign some values to the class variables and use those objects.
		// We can create the objects in the following ways:

		// 1. Using Traditional way like this:
//		Employee e1 = new Employee();
//		e1.name = "Tom";
//		e1.age = 20;
//		e1.city = "LA";
//
//		Employee e2 = new Employee();
//		e2.name = "Lisa";
//		e2.age = 26;
//		e2.city = "Pune";
//
//		Employee e3 = new Employee();
//		e3.name = "Peter";
//		e3.age = 25;
//		e3.city = "NY";

		// But the problem with the above way is that the code is getting repeated
		// and it's becoming lengthy. Also, there will be some cases where we have created
		// the Objects only like below:

//		Employee e4 = new Employee();
//		Employee e5 = new Employee();
//		Employee e6 = new Employee();
//		Employee e7 = new Employee();

		// Now, the above Objects have the references pointing
		// to them in stack and the actual Objects are stored in Heap. But
		// we are not leveraging the references created to assign values to class
		// variables and other methods. So, these objects are useless and just occupying the memory.

		// So, there are 2 major problems with above approach
		// Repeated and lengthy code unnecessarily.
		// Some Objects are created but never used and occupying
		// memory unnecessary.

		// So, to mitigate/eliminate these issues we use Constructors concept.
		// Where we only create the objects whenever needed. Also, we
		// can create the objects using constructors with only the properties that user needs.
		// This way we will RESTRICT the user to create unnecessary objects.

		// 2. Using Constructors:
		Employee e8 = new Employee(); // default constructor will be calledy
		                              // O/P : I am deafult constructor
		Employee e9 = new Employee(10); // constructor with corresponding matching arguments will be called
		                                // 10
		Employee e10 = new Employee(10, "Tom"); // constructor with corresponding matching
		                                        // arguments will be called
                                                // 10 Tom


	}

}
