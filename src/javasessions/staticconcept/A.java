package javasessions.staticconcept;

public class A {
	// INTERVIEW QUESTION:
	// Can we call B class main method in
	// A class main method? What will be the O/P?
	// Yes (SEE BELOW)

	// Can we call A class main method in
    // B class main method? What will be the O/P? (Provided A main method has already a call
	// to B main method )
	// Yes (SEE CLASS B). The O/P will be StackOverflowError
	// after multiple repeated calls to each class's main method

	public static void main(String[] args) {
		System.out.println("A-main");
		B.main(args); // A-main
		              // B-main
	}

}
