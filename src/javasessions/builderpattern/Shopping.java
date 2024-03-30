package javasessions.builderpattern;

public class Shopping {
	// This class implements the builder pattern and shows how it is designed.

	// What is Builder Pattern? How can we design it in JAVA?
	// When we design a workflow / functionality in JAVA (or most of the programming languages)
	// consisting of sequential steps to be followed to complete the workflow that pattern is called
	// a Builder Pattern.
	// We can implement builder pattern in JAVA by returning the class object
	// inside every method / function / step that is involved in a workflow.
	// And when we call the methods one by one it look like a chain.

	// The methods in a Builder Pattern behave as steps in a workflow.

	// So, in short Builder pattern is a design in which we build a workflow by repeatedly calling
	// the steps in the workflow until it is completed.

	// Builder Pattern is also called METHOD CHAINING

	// This is the 3rd use case of this keyword in JAVA.

	// Below lines show a Builder pattern involved in a workflow
	// of logging into an e-commerce app up to the check out and logging out
	// of it


	public Shopping login() {
		System.out.println("User logged in");

		return this; // returning this means we are returning current class object / or latest object.
		             // So, we will write class name as the method return type

		// OR, we can return the object like this also

		//return new Shopping();
		// But the problem with the above approach is whenever we call any method
		// that is returning the object like this a new keyword call to the constructor
		// will be made for the class and a new object will be created without any reference variable.
		// This will create n number of objects in the heap without any reference which is not a
		// good optimization technique and will also create a risk of null pointer exception.
		// So, to avoid this we return this keyword from the method which will
		// tell JVM to return the same object which is currently going on in the heap,
		// instead of creating so many objects.
		// So, by returning "this" whatever object is created at the very first time
		// to use the class's properties the same object will be returned in every method
		// call returning "this"
	}

	public Shopping login(String un, String pwd) {
		System.out.println("Login with "+ un + " : " +pwd);
		return this;
	}

	public Shopping search(String productName) {
		System.out.println("search product: "+ productName);
		return this;
	}

	public Shopping search(String productName, int price) {
		System.out.println("search product: "+ productName+" : "+price);
		return this;
	}

	public Shopping addToCart(String productName) {
		System.out.println("add to cart : "+ productName);
		return this;
	}

	public Shopping doPayment(String cc, int cvv) {
		System.out.println("do payment : "+cc+" : "+ cvv);
		return this;
	}

	public Shopping doPayment(String upi) {
		System.out.println("do payment : "+upi);
		return this;
	}

	public Shopping generateOrder() {
		System.out.println("generating order, order id is: "+12345);
		return this;
	}

	public Shopping logout() {
		System.out.println("logout");
		return this;
	}

}
