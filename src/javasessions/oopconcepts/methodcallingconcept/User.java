package javasessions.oopconcepts.methodcallingconcept;

public class User {
	
	// This class depicts the use of CALL BY REFERENCE technique
	
	// Always REMEMBER that while using call by reference
	// technique an Object of the class in consideration
	// MUST be created somewhere in the code (Mostly in the driver or caller method).
	// Otherwise you will start getting nullpointerException
	
	public void sendEmail() {
		System.out.println("Sending email");	
	}
	
	public static void getName(Employee e) {
		e.m3();
	}

	
	public static void getEmail() {
		System.out.println("Getting email");
		
		// Call sendEmail() method here:
		
		// Approach 1: creating object of User first and then call
		User u1 = new User();
		u1.sendEmail();  // But this approach is very expensive as if we are calling
		                 // getEmail 100 times then 100 Objects will be created in the Heap
		                 // and fill it quickly. So, to optimize this we will use 
		                 // calling by object reference technique as shown in approach 2 below.
	}
	
	public static void getEmail(User u) { // u = u1
		System.out.println("Getting email");
		
		// Call sendEmail() method here:
		
		// Approach 2: creating object reference only first, then create the object 
		// only once at a different place and then call
		
		u.sendEmail();
		User.readEmail(u);
		u.test(20);
	}
	
	// Again using Call By reference technique to call sendEmail() method in readEmail():
	public static void readEmail(User u) {
		System.out.println("Reading email");
		
		// Call sendEmail() method here:
		
		u.sendEmail();
	}
	
	public void test(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		
		User u1 = new User();
		
		User.getEmail(u1); // This is called call by reference meaning calling
		                   // the functions by object reference.
		                 
		                   // Now, we are creating the Object only once like in above line
		                   // and using the pointer to that Object (u1) to call other methods (like getEmail())
		                   // Now, if we call the getEmail() method 100 times Object 
		                   // is created only once for the user class
		                   // O/P: 
		                   // Getting email
		                   // Sending email
		                   // Reading email
		                   // Sending email
		u1.test(10); // 10 -- This time we are passing the actual value in the function
		             // call. So, it is called CALL BY VALUE
		
		Employee emp = new Employee();
		User.getName(emp); // m3 method
		
		

	}

}
