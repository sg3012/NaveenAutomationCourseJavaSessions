package javasessions.oopconcepts.methods;

public class Customer {

	// Class Variables:
	String name;
	int age;

	// Methods and functions have same meaning in JAVA

	// Methods are also data members of the class

	// Methods are the blocks of code that are used to write the business logics or features
	// or perform any user action

	// We cannot create a method inside a method in JAVA like in the main method

	// So methods are always created parallel each other

	// But we can call a method inside a method

	// Once an Object of a class is created a copy of methods is also created and allocated to
	// that Object

	// types of methods:

	//1. no return and no input

	public void test() { // 0 parameters
		System.out.println("test method");
		int i = 10;
		System.out.println(i);
	}

	//2. some return and no input

	public int sum() { // return type : int
		System.out.println("sum method");
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
	}

	// The advantage of using return keyword to print the value over
	// printing it directly using println() method in the function itself
	// is:
	// Using return statement we are getting something from the function
	// which we could print and use it for further calculations/manipulations
	// later but the same I couldn't do it with the println() directly
	// it will just print the value we have to again to do the further calculations
	// in the function itself which is not good practice as a function has
	// the standard behaviour to return the value only.
	// This the reason why we use return in the methods (TO DO FURTHER MODIFICATIONS
	// IN THE CODE USING THE RETURNED VALUE)

	public String getTrainerName() { // return type: String
//		return name; // below code will be dead code as we cannot write anything
		             // after a return statement in a block of code. It is the last statement
		             // in the code block
		System.out.println("Getting trainer name from Naveen Automation Labs");
		String name = "Naveen";
		int a = 100;
		return name;
		// return a; // Error we can only have one return statement in the function
		          // meaning it could only return one type of value
	}

	public short getNumber() { // return type : short
		System.out.println("getting number");
		return 100; // This syntax is also fine for return. We can return a value
		            // directly in the return statement instead of returning a variable
	}

	//3. some return and some input
	public int add(int a ,  int b) { // a and b in the method signature are called
		                             // parameters
		System.out.println("adding two numbers");
		int z = a+b;
		return z;
	}

	public int multiply(int a , int b) {
		System.out.println("multiplying two numbers");
		int mul = a*b;
		return mul;
	}

//	public double getTotalMarks(double score, int handWritingScore, int attendanceScore) {
//		System.out.println("calculating marks");
//		double finalScore = score + handWritingScore;
//		return finalScore; // We are writing the method logic and not using
//		                   // the 3rd parameter attendanceScore anywhere
//		                   // This is bad practice. Always use all the parameters you are providing
//		                   // in a method signature otherwise remove it. Because if
//		                   // you are not using it then the code looks ugly
//	}

	public double getTotalMarks(double score, int handWritingScore, int attendanceScore) {
		System.out.println("calculating marks");
		double finalScore = score + handWritingScore+attendanceScore;
		return finalScore;
	}

	public void get() {
		System.out.println("print the url");
		return; // This is also called a blank return (not returning anything)
		        // and it's equivalent to void. So, if we are writing a void return type method
		        // we could also write a blank return like this at the end. But if return something
		        // then compiler will throw an error.
		        // There are many functions which don't return anything like click()
		        // on any webElement.
	}

	public static void main(String[] args) {
		// create object of the class:
		Customer c1 = new Customer();
		c1.name = "Tom";
		c1.age = 20;
		c1.test(); // calling a method (calling from another method that is main method)

		int m1 = c1.sum(); // the return statement will return the final result
		          // to the function call
		System.out.println(m1-5+10); // 35
		                             // we could do the manipulations with the returned value
		                             // m1 like this
		String trainerName = c1.getTrainerName();
		System.out.println(trainerName+ " for JAVA and Selenium"); // Getting trainer name from Naveen Automation Labs
		                                                           // Naveen for JAVA and Selenium
		if(trainerName.equals("Naveen")) {
			System.out.println("PASS"); // PASS
		}

		System.out.println(c1.getNumber()); // 100. But this is not a good practice to pass
		                                    // the method call to print statement directly.
		                                    // Because if I want to do some modifications with the returned
		                                    // value multiple times and I don't want
		                                    // to change the call in any print statement
		                                    // then we have to write the print statements and method
		                                    // calls again and again which
		                                    // creates repetitive code
		                                    // So, better to write the method call only once
		                                    // and store the returned value in some variable
		                                    // and do further calculations like below
		short m2 = c1.getNumber();
		System.out.println(m2+10); // 110

		// System.out.println(c1.test()); // Error, we cannot call void functions
		                               // inside the print statement because it is meant to print something
		                               // and void doesn't return anything and print statement
		                               // will not have anything to print.

		int sum = c1.add(10, 20);
		System.out.println(sum); // 30
		sum = c1.add(100, 200); // values 100 and 200 in the method call are called Arguments
		System.out.println(sum); // 300

		int multiple = c1.multiply(2, 3);
		System.out.println(multiple); // 6

		double score = c1.getTotalMarks(13.56, 40, 25);
		System.out.println(score); // calculating marks
		                           // 78.56




	}

}
