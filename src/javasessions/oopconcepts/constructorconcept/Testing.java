package javasessions.oopconcepts.constructorconcept;

public class Testing {
	// INTERVIEW QUESTIONS:

	// Q1.
	// ACCEPTANCE CRITERIA:
	// No one outside this class can create the object of this class

	// For that we can create a private constructor like below:

	// But what if we have some public methods in the class
	// and I want to use those methods:

	// We have 2 ways to utilize those methods:
	// Create Object in the same class by creating the caller / main method (which
	// is not practical scenario)

	// Create all the public methods as static and access those methods
	// in the caller /driver/ main methods defined 
	// outside the private constructor classes as shown below
	
	// But we will not be able to access the public methods
	// of the caller class if they are not static
	// in the calling class as we cannot create object of 
	// the caller due to private constructor
	
	

	private Testing() {

	}

	public static void getApp() {

	}

	public static void getAppNumber() {

	}

	public static void getBrowserVersion() {

	}

//	public static void main(String args[]) { // But this approach of creating the main
//		                                     // method in the same class is not practical
//		Testing test = new Testing(); 
//	}

}
