package javasessions.oopconcepts.methodcallingconcept;

public class Browser {
	
	// RULES FOR CALLING METHODS OF ONE CLASS IN DIFFERENT CLASS IN JAVA:
	
	// Object reference is needed to call a non-static method (caller method) 
	// of one class inside other non-static method (calling method) 
	// of a different class because the classes have no relation.
	
	// Object reference is needed to call a non-static method (caller method) 
    // of one class inside other static method (calling method) 
	// of a different class because the classes have no relation.
	
	// Class name is required to call a static method (caller method) 
    // of one class inside other static method (calling method)
	// of a different class
	
	// Class name is required to call a static method (caller method) 
    // of one class inside other non-static method (calling method)
	// of a different class
	
	public void b1() {
		System.out.println("b1 method");
		b2(); // no object creation is required to call this non-static method inside
	         // other non-static method
	}
	
	public void b2() {
		System.out.println("b2 method");
//		m1(); // Error, because m1 is defined in Employee
//		      // and not defined inside Browser. And both the classes
//		      // have no relation. To call m1() we need to create object of Employee
		
		Employee e2 = new Employee();
		e2.m1();
	}
	
	public static void p1() {
		System.out.println("p1 method");
		
	}

}
