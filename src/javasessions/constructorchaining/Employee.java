package javasessions.constructorchaining;

public class Employee{
	
	// This class explains CONSTRUCTOR CHAINING and how it can be created / implemented.
	
	// Constructor chaining : A mechanism by which we call the constructors of a class
	// achieve a task one after the other in sequence.
	
	// We will achieve this by using this() function call. this is an inbuilt function
	// in JAVA that calls constructor of a class. This is 4th use case of
	// this keyword
	
	String name;
	int age;
	double salary;
	
	//1.
	public Employee() {
		this("Kapil",30); // 1st constructor call
		// this(name,age); // Error constructor call must be the 1st call in a method
		                // Meaning if we call a constructor in a line other than starting line
		                // in a method the compiler will give an error. We must call a Constructor
		                // at the very first line in a method
	}
	
	//2.
//	public Employee(String name, int age) {
//		this(name, age, 90.0); // 2nd constructor call
//		this.name = name;
//		this.age = age;
//	}
	
	//3.
		public Employee(String name, int age) {
			this(name, age, 90.0); // 2nd constructor call
			this.name = "Mitaj";
			this.age = 35;
		}
	
    //4.
	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public static void main(String args[]) {
		Employee obj = new Employee(); // At this step default 
		                               // constructor (1st one) will be called
		
//		System.out.println(obj.name); // Kapil
//		System.out.println(obj.age);  // 30
//		System.out.println(obj.salary);  // 90.0
		
		// Now, if we change the value of name and age in the 2nd constructor
		// after the 1st line
		System.out.println(obj.name); // Mitaj, why ? because after the constructor call in 1st line 
		                              // in the 3rd constructor
		                              // the control will come to 2nd and 3rd line of that constructor
		                              // and change the value of age and name variable inside object to Mitaj
		                              // and 35 respectively. It will take latest updated values.
		
		System.out.println(obj.age);  // 35 why ? because after the constructor call in 1st line 
                                      // in the 3rd constructor
                                      // the control will come to 2nd and 3rd line of that constructor
                                      // and change the value of age and name variable inside object to Mitaj
                                      // and 35 respectively. It will take latest updated values.
		
		System.out.println(obj.salary);  // 90.0
		
	}

}
