package javasessions.oopconcepts.classesandobjects;

public class Employee {
	
	// Class is a Category or BluePrint or Templates for all the objects
	
	// Object is a physical entity or a real world
	// implementation of a specific Blue print or a class.
	
	// Every Object has its own properties defined with the help of class or Blue print as follows:
	
	// These are called class variables / global variables
	String name;
	int age;
	double salary;
	String city;

	public static void main(String[] args) {
		
		int i=10; // local variable
		
		// Inside Main we will always create the objects of the 
		// class using the class variables and Methods
		
		// We create an object using new keyword
		Employee emp1 = new Employee();
		
		// Employee - class name
		// emp1 - Object reference name(This could be any name)
		// new - keyword used to create the object
		// new Employee() - Actual Object
		
		// When we create an Object of a class, a copy is created internally
		// for all the class variables and it's given to the Object that
		// has been created.
		
		// But no copy of the local variables (variables created inside main method
		// or inside any other block) will be given to an object. Meaning,
		// local variable will not be associated to class and in turn any of
		// its object.
		
		// Initialising class variables using Object reference:
		// We use dot operator to initialize the class variables.
		emp1.name = "Shubham";
		emp1.age = 30;
		emp1.salary = 34.66;
		emp1.city = "Delhi";
		
		System.out.println(emp1.name); // Shubham
		System.out.println(emp1.age); // 30
		
		// creating another object:
		Employee emp2 = new Employee(); // Now we have 2 objects of the Employee class
		System.out.println(emp2.name); // null (default value of String as we haven't
		                               // initialised name with emp2)
		System.out.println(emp2.age); // 0 (default value of int as we haven't
                                      // initialised age with emp2)
		System.out.println(emp2.salary); // 0.0 (default value of double as we haven't
                                         // initialised salary with emp2)
		System.out.println(emp2.city); // null (default value of String as we haven't
                                       // initialised city with emp2)
		
		// There is no limit on the creation of Objects for a class
		// We could create 'n' number of Objects for a class
		
		
		

	}

}
