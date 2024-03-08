package javasessions.oopconcepts.constructorconcept;

public class User {
	// This class shows the need of constructor. Why is it required,
	// Even though we could achieve the same objective with
	// normal methods also?
	
	// The first purpose of using constructor is it is restricting 
	// the user to create unnecessary objects of the application if
	// we are using parameterized constructor. We can then only
	// create objects with certain properties only. So, it is not
	// allowing unnecessary default object creation.
	
	// For e.g. : On Amazon application if a user is able
	// to create account without filling any info on the signup form
	// then there will be so many fake user accounts created with
	// almost no info about them in the DB.
	
	// Use the following steps to generate the constructor of your choice (without
	// manually writing the code):
	// Right click anywhere in the class
	// Go to source
	// In the context menu opened click the option "Generate Constructor using fields"
	// From the pop-up choose the class variables you want
	// Click generate and your constructor will be generated
	
	// How do we define the basis for creating a constructor with certain fields?
	// Do we create them randomly or we have some requirement?
	// The requirement or the basis to create a constructor 
	// comes from the Product owner in terms of AC or Business Logic
	// For e.g create user using following fields:
	// name, age
	// name, age, city
	// name, age, gender
	// all fields
	
	// It's always a bad practice to create the main method in the same class
	// in which the Business logic is defined. Main is a driver method
	// and it should be in a separate class
	
	String name;
	int age;
	String city;
	double salary;
	char gender;
	boolean isActive;
	
	// Creating a constructor which creates user on the basis of name, age
	//1. 
//	public User(String name, int age) {
//		
//	}
	
	//2.
//	public User(String name1, int age1) {
//		name = name1;
//		age = age1;
//	}
	
	//3.
	public User(String name, int age) {
		this.name = name; // this keyword will point to global variable, stored in the current
		                  // object accessing this variable.
		this.age = age;
	}
	
	// Creating a constructor which creates user on the basis of name, age, city
	
	public User(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	// Creating a constructor basis of name, age, gender
	
	public User(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	// Creating a constructor basis of name, city, isActive
	public User(String name, String city, boolean isActive) {
		this.name = name;
		this.city = city;
		this.isActive = isActive;
	}
	
	// Create a constructor using all the class fields:
	public User(String name, int age, String city, double salary, char gender, boolean isActive) {
		this.name = name;
		this.age = age;
		this.city = city;
		this.salary = salary;
		this.gender = gender;
		this.isActive = isActive;
	}
	

	public static void main(String[] args) {
		
//		User u1 = new User("Tom", 25);
//		
//		System.out.println(u1.name+" "+u1.age); // null 0, because above constructor
		                                        // call (user constructor in point 1) is passing the arguments
		                                        // to the parameters defined in the
		                                        // respective constructor at the class level.
		                                        // Those parameters are local to the constructor body only
		                                        // they are not reflected outside it at the class level.
		// To rectify this O/P we will modify the User constructor parameters and 
		// assign the local variables of constructor to global (class level) variables ( See User 
		                                                                               // constructor modified
		                                                                               // in point 2 at the 
		                                                                              //  class level above)
		// But what if I want to use the same names for
		// the local variables as the global variables
		// in the constructor signature. Because maintaining
		// different variable name for every local variable
		// will be a headache. So, to get the correct o/p
		// from the function call with same local variable
		// names in the constructors we will use this keyword (See constructor modified in point 3 above
		// at the class level)
		
		User u1 = new User("Tom", 25);
		System.out.println(u1.name+" "+ u1.age); // O/P Tom 25
		
		User u2 = new User("Sandeep", 40, "Bangalore"); 
		System.out.println(u2.name+" "+ u2.age+" "+u2.city); // Sandeep 40 Bangalore
		
		User u3 = new User("Shubham", 30, "Delhi", 13.90, 'M', true);
		System.out.println(u3.name+" "+u3.age+" "+u3.city+" "+u3.salary+" "+u3.isActive ); 
		// Shubham 30 Delhi 13.9 true
		
		// Testing test = new Testing(); // Error 
		                                 // constructor testing is not visible
		Employee emp = new Employee();
		
		Testing.getApp();
		Testing.getBrowserVersion();
		
		// INTERVIEW QUESTION:
		
		// Q2. Which class has private constructors in JAVA?
		// Ans - System class has a private constructor and we cannot create object of System class
		//       anyhow
		
		// System sys = new System();// Error 
                                  // constructor System is not visible
		
		                                              
		
		
	}


}
