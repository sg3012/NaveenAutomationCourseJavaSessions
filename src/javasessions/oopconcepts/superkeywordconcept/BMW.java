package javasessions.oopconcepts.superkeywordconcept;

public class BMW extends Car {

	// This class shows the use of Super keyword

	// Can we use super keyword outside any method at the class level ?
	// No. It will give error as shown below:

	//super.min_speed; // error. Syntax error on token(s), misplaced construct(s)

	// Main difference between this and super keyword is this keyword
	// always calls the current class constructor in which it is used
	// but super calls the parent class constructor from the child class.

	// This and super constructor calls MUST always be the first line of method call
	// in a constructor

	 int min_speed = 200; // Individual variable of BMW
	                     // Not overridden from Car. There is
	                     // no such concept as variable overriding in JAVA.
	                     // If someone is saying do he/she is completely
	                     // wrong.

	public BMW() {
		// If we want to call the super class constructor (default or parameterized) in child class constructor
		// then we will use super keyword like below:
		super();

		// super(10); // Valid call as we can call parameterized constructor also
		              // But compiler will throw error if I use both this and above line.
		// this(); // Compile will throw this Error :
		        // Constructor call must be the first statement in a constructor

		// But always keep one thing in mind
		// that if you are calling constructor of any class
		// inside a constructor of another class either using SUPER keyword
		// or using THIS KEYWORD or implicitly by JVM then that constructor call MUST
		// be the first line in the method body. Otherwise, compiler
		// will throw an error.
		// So, this means that constructor calls inside
		// any other constructor are always the first calls
		// that are executed when control comes inside method body.

		// So, can we have multiple constructor calls
		// inside a constructor ? NO. Because after the first line
		// constructor call all further lines will come at number 2, 3 and so on
		// which again violates the rule the any constructor call must be
		// the first line in a constructor either you are calling
		// that constructor using THIS OR SUPER OR it is called implicitly

		// It is not mandatory to call the same type of parent class
		// constructor inside the child class constructor. Meaning,
		// it is not mandatory to call the default constructor of parent
		// child class inside the default constructor of child. We can
		// call parameterized constructor of the child class also (see above).
		System.out.println("BMW default const......");
	}

	public BMW(int i) {
		super(20); // Super class parameterized constructor will be called
		System.out.println("BMW const......"+i);
	}

	public void displaySpeed() {
		 System.out.println(min_speed); // 200. Variable from BMW
		                               // will be given preference
		// Now, what should I do if I want to access the parent class
		// min_speed variable also?

		// I will use the SUPER keyword like below:
		 System.out.println(super.min_speed); // 100. Variable from car will be accessed.
		                                     // if there is min_speed
		                                     // variable in car class

		// Now, if there is no variable called min_speed in the parent
		// class car as well as BMW class then can we access Grandparent class min_speed
		// variable?

		// Yes, using the super keyword exactly same as in the above code:

		// System.out.println(super.min_speed); // 50. Variable from grandparent vehicle
		                                     // will be accessed.
                                             // if there is no min_speed
                                             // variable in car class

		 // IMPORTANT, if there is a variable called min_speed in the parent
		// class car as well as Grandparent vehicle class but no min_speed variable in
		// the BMW class then which min_speed variable will be accessed, from
		// the parent class or the grandparent class ?

		// System.out.println(super.min_speed); // 100. Preference will always be given to immediate
		                                      // parent class property even if we have the same
		                                      // property in the grandparent but not in the child
		                                      // class (BMW)
	}

	@Override
	public void speed() {
		System.out.println("BMW Speed"); // Overridden from parent class

		// But if I want to access Car class speed method also
		// then we will use super keyword like:

		super.speed();

		// Can I access the static methods also from the parent class using super keyword?
		// Yes, like below:

		super.testing();
	}

}
