package javasessions.oopconcepts.constructorconcept;

public class Person {
	// This class shows if we could create constructors using static variables or not
	String name;
	static String collegeName;
	
	public Person(String name, String collegeName) {
		this.name = name;
		
		// this.collegeName = collegeName; // warning that static field should always be used in
		                                // a static way
		
		Person.collegeName = collegeName; // This is correct way but what
		                                  // about if different users create person class object?
		                                  // and one of them assign the college name as "abcd"
		                                  // then every new person object created will have the same college name.
		                                  // This will again be a problem. So, it's a bad practice
		
		// So Never supply static data in the constructor
	}
	
	
	
	public Person(String name) {
		this.name = name;
	}



	// Passing extra variable in the constructor signature which is not class variable
//	public Person(String name, int amount) {
//		// We can pass extra variable in the signature
//		// it will not give any error. But as "amount"
//		// is not part of the class variables 
//		// it means it is an extra variable using
//		// which you are going to define some other logic
//		// in the constructor itself which is again not permitted.
//		
//		// So, don't pass variables apart from class variables in the constructor
//	}
	
	public static void main(String args[]) {
		Person p1 = new Person("Naveen", "ABCD");
		Person p2 = new Person("Tom");
		System.out.println(p2.collegeName); // ABCD, because collegename is static
		                                    // and every object will be getting the same copy
		                                    // of the latest value initialized
		
		System.out.println(collegeName); // ABCD
	}
	
	
	
	

}
