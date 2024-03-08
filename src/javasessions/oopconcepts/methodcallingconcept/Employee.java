package javasessions.oopconcepts.methodcallingconcept;

public class Employee {
	// RULES FOR CALLING METHODS IN JAVA INSIDE THE SAME CLASS:
	
	// No Object reference is needed to call a non-static method (caller method) inside
	// other non-static method (calling method) because when we create object
	// of the class to call the calling method inside the main method which is static
	// in nature, the object will have copies of all the non-static methods inside it
	// and by calling just the one calling method inside the main class will
	// activate the calls for caller methods automatically. 
	// Also, as the object has copies of all the other non-static methods
	// one non-static method can call other non-static methods
	// directly inside them. So, only one object reference is required in main
	// to initiate the call to any one of the non-static methods.

	// Object reference is needed to call a non-static method inside
	// other static method because static method will be stored in CMA
	// and non-static methods will be in the Object inside the Heap memory.
	// So, static and non-static methods have no relation

	// No Object reference is needed to call a static method inside
	// other static method because all static methods will be stored inside
	// the CMA. So, one static method can call other static methods inside
	// them directly as they are related to each other by CMA or meta space.
	// But we will mostly use the class name to call the static methods inside any other methods

	// No Object reference is needed to call a static method inside
	// other non-static method of the same class. But we will mostly use the class 
	// name to call the static methods inside any other methods
	
	// Because program execution starts from the main method and its static in nature
	// at least one object reference is required to call any one of the non-static methods 
	// that contain calls to other non-static methods to activate the non-static method
	// call chain one by one
	
	// Because program execution starts from the main method we call the static method 
	// that contain calls to other static methods to activate the static method
	// call chain one by one using the Class Name.
	

	public void m1() {
		System.out.println("m1 method");
		m2(); // no object creation is required to call this non-static method inside
		      // other non-static method
	}

	public void m2() {
		System.out.println("m2 method");
		m3(); // no object creation is required to call this non-static method inside
	         // other non-static method
	}

	public void m3() {
		System.out.println("m3 method");
	}
	
	
	public static void t1() {
		System.out.println("t1 method");
		t2(); // No problem we can call one static method in other static method directly
	}
	
	public static void t2() {
		System.out.println("t2 method");
		t3(); // No problem we can call one static method in other static method directly
	}
	
	public static void t3() {
		System.out.println("t3 method");
		// m1(); // Again error, because m1() is inside object in Heap and
		      // t3() is inside CMA. So t3 could not call m1 directly as they
		      // don't have direct relation. We must use the object ref of this class
		      // to call m1 inside t3.
		Employee emp = new Employee(); // But creating the object of a class inside a method is not
		                               // a good practice. In fact, it is costlier in terms of memory usage
		                               // because let's say if we have 100 test cases which are calling
		                               // this type of method then an object is created at each call
		                               // creating 100 objects in the Heap and we have to create the object.
		                               // So, in such situations we will create the objects using
		                               // CALL BY REFERENCE TECHNIQUE i.e., calling a method
		                               // by class object reference (See
		                               // User class to see this technique in 
		                               // methodcallingconcept package)
		emp.m1();
		
	}

	public static void main(String[] args) {
		// To call the same class's non-static method
		
		Employee e1 = new Employee();
		e1.m1(); // with just one object ref and one method call 
		         // we are activating the calls to all the 3 methods
		         // i.e, m1(), m2(), m3().
		
		         // O/P : m1 method
		         // m2 method
		         // m3 method
		System.out.println("--------");
		
		// To call the different class's non-static method: 
		
//		 b2(); // Error, because b2 is defined in Browser
	           // and not defined inside Employee. And both the classes
               // have no relation. To call b2() we must create the Object of the browser class.
		Browser browser = new Browser();
		browser.b2(); // O/P
		              // b2 method
					  // m1 method
					  // m2 method
        			  // m3 method
		
		System.out.println("---------");
		
		// Calling Static Method of the same class:
		
		Employee.t1(); // t1 method
		               // t2 method
		               // t3 method
		
		System.out.println("---------");
		
		// Calling static method of the different class:
		
		// p1(); // Error, because p1 is defined in Browser
        // and not defined inside Employee. And both the classes
        // have no relation. To call p1() we must use the class name Browser
		
		Browser.p1(); // p1 method
		
		
		
		
		
	

	}

}
