package javasessions.staticconcept;

public class Employee {
	
	// STATIC VARIABLES
	
	// class static variables: those variables which are starting with static keyword
	
	String name; // non static var / class var / instance var
	static int age; // static var / class var 
	// Static variables/methods are neither stored in heap nor
	// stack memory. They are stored in a separate
	// memory called Common Memory Allocation (CMA) or
	// Permanent Generation. JDK 1.8 onwards, CMA has been renamed to
	// MetaSpace.
	
	// Up to JDK 1.7 CMA was part of Heap but 1.8 Onwards they separated 
	// it from Heap memory and now CMA is a separate memory with name
	// as Metaspace.
	
	// Up to JDK 1.7 the name of the memory for static properties was CMA or
	// Permanent Generation. But JDK 1.8 Onwards, it got changed to Metaspace.
	
	// When it was CMA the memory was static but when it got changed to Metaspace
	// the memory is dynamic. Meaning, up to JDK 1.7 JAVA creators thought that
	// the developers won't require much space for static properties
	// so, they made CMA as static allocating only 100 MB space
	// to it and as soon as that space got used developers used
	// to get the memory leakage issues. But 1.8 Onwards, 
	// they created the Metspace as dynamic i.e, as soon
	// the 100 MB space got utilised the static properties would 
	// start taking the space on RAM and Metspace will grow
	// dynamically.
	
	// If we have created 10 Objects then 10 copies of all non-static
	// variables/methods will be created and given to each object. But
	// only 1 copy of all static variables/methods will be created and stored inside
	// the CMA or the MetaSpace. So, instance variables/methods take more space than the static variables/methods.
	
	// STATIC METHODS
	
	public void getEmail() {
		System.out.println("get email method");
	}
	
	// BELOW METHODS ARE STATIC AND OVERLOADED
	public static void sendEmail() {
		System.out.println("send email method");
	}
	
	public static void sendEmail(int a) {
		System.out.println("send email method "+a);
	}
	
	public static void sendEmail(int a, int b) {
		System.out.println("send email method "+ a+b);
	}
	
	// NOTE: IT IS AlWAYS RECOMMENDED TO USE THE STATIC VARIABLES/METHODS USING THE CLASS NAME ONLY
	// WHETHER YOU ARE TRYING TO ACCESS THEM IN THE SAME CLASS (STATIC METHODS OR NON STATIC METHODS)
    // OR DIFFERENT CLASS (STATIC METHODS OR NON STATIC METHODS)
	
	// DISADVANTAGE:
	// The major disadvantage of static keyword in test automation is that
	// it prevents the parallel execution while executing the test cases
	// as when we driver as static it gets stored in CMA and every test
	// case has to use the same driver reference but it will not be
	// released until the execution of some other test cases
	// will get completed on other browsers.
	

	public static void main(String[] args) {
		
		// To access non-static var inside static methods-
		// We have to create Object of the class
		// and can access them via Object ref only
		
//		name = "Shubham"; // Error, Cannot make a static reference to the non-static field name
		
		Employee e = new Employee(); // Now this employee object will only have one copy
		                             // of class variables i.e., non-static variable name
		                             // It will not hold any copy of static variable i.e., age
		                             // In General, Objects don't hold any copy
		                             // for static variables, methods. They only contain copies
		                             // of non-static variables, methods etc.
		e.name = "Tom";
		
		// To access static variables inside static methods (same class) - 
		// 1. We use class name (If we are trying to access in a different class or non-static methods):
		Employee.age = 20;
		// Employee.name = "Shubham"; // Again Error, Cannot make a static reference to the non-static field name 
		
		//2. Directly by using variable name (if we are trying to access in the same class 
		                                      // and static methods):
		// age = 30;
		
		//3. Using the Object reference name:
		// e.age = 40; // No error but it's not a good practice.
		            // But There is a warning message saying "The static field Employee.age 
		            //should be accessed in a static way"
		
		// To print the value of static variable:
		System.out.println(Employee.age); // 20, Again while printing the value
		                                  // We will use class name for static variables.
		// To print the value of non-static variable:
		System.out.println(e.name); // Tom, We have to use object ref only to print
		                            // the values of non-static variables
		
		// To access non-static methods inside static methods-
		// We have to create Object of the class
		// and can access them via Object ref only
		e.getEmail();	
		
		
		// To access static methods inside static methods (same class) - 
		//1. Using the class name:
		Employee.sendEmail();
		// Employee.getEmail();  Again Error, Cannot make a static reference to the non-static field name
		
		//2. Directly by method name:
		sendEmail();
		// getEmail(); Again Error, Cannot make a static reference to the non-static field name
		
		//3. Using Object reference name:
		// e.sendEmail(); // Warning , saying "The static field Employee.age 
        //should be accessed in a static way"
		
		
		
	}

}
