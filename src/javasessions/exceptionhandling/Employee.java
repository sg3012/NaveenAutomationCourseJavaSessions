package javasessions.exceptionhandling;

public class Employee {

	// This class shows what are exceptions ? When and why do they occur?

	// EXCEPTION : An exception is any unwanted event in a program execution
	// that causes a program to terminate after it is occurred.

	// What is EXCEPTION HANDLING?
	// It is the technique by which we prevent the program from terminating
	// and continue further execution from the point / line
	// where exception occurred.

	// HOW DO WE DO EXCEPTION HANDLING?
	// We can handle exception in JAVA ONLY using try-catch block.

	// try block is used to execute the exception code and catch block is used to
	// to catch the exception and report it to the user.

	// Catch block's main purpose is reporting the exception to the user
	// When the exception is handled then the code written after the line
	// where exception is occurring will be executed. This is the main
	// purpose of exception handling that whenever an exception is happened
	// in the code execution the whole application shouldn't terminate
	// and program execution continues further.

	// The parent class of Exception class in JAVA is throwable

	// With a single try block we can write 'n' number of catch block

	// try and catch blocks must always be written in pairs. One cannot
	// be written separately without the other

	// We always read the stack trace of an exception from the bottom
	// most line number. The line number just above which the main exception
	// name is written, is the main culprit throwing the exception.
	// for e.g. consider following stack trace:
	// Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at javasessions.oopconcepts.exceptionHandling.ThrowsKeyword.m3(ThrowsKeyword.java:31)
//	at javasessions.oopconcepts.exceptionHandling.ThrowsKeyword.m2(ThrowsKeyword.java:26)
//	at javasessions.oopconcepts.exceptionHandling.ThrowsKeyword.m1(ThrowsKeyword.java:21)
//	at javasessions.oopconcepts.exceptionHandling.ThrowsKeyword.main(ThrowsKeyword.java:38)
	// We start reading this stack trace from bottom i.e., line number 38
	// and then go up. The line just above which the exception name (ArithmeticException : / by zero)
	// is written is the line number 31. So, the line 31 has some issue and throwing the actual exception.
	// That is how we read exception stack trace.

	// Throwable class is the superclass of Exception and Error classes in JAVA. Throwable is the
	// child of Object class which in turn is the parent classes of all the classes in JAVA by default.

	// DIFFERENCE BETWEEN CHECKED AND UNCHECKED EXCEPTIONS
	// Checked exceptions also called Compile time exceptions are the ones which compiler can identify
	// pro actively at the time writing code only and gives a red underlined error showing the exception.
	// For e.g. FileNotFoundException, InterruptedIOException etc.

	// Unchecked exceptions also called Run time exceptions are the ones which compiler cannot identify
	// pro actively at the time writing code and they mostly occur due to bad logic written.
	// For e.g. ArithmeticException, NullPointerException etc.

	// RuntimeException class and all it's subclasses and Error class and all it's subclasses
	// come under unchecked exceptions. All other exceptions are checked exceptions.


	String name;

	public static void main(String[] args) {
		System.out.println("A"); // A
		System.out.println("A"); // A
		System.out.println("A"); // A

		try {

//			Employee e = new Employee();
//
//			e = null;
//
//			System.out.println(e.name); // this line will throw NPE.

			 int i = 9/0; // Arithmetic exception divide by zero occurs at this line
		              // so we will handle this exception with the help of try-catch block
			// if I write the above code like:

			// int i = 9/3;

			// Then will an exception be occurred in the above line ? Ans: No
			// will the control go to catch block? Ans : No

			// So, the control goes to the catch block only when an exception is occurred

			// If exception is occurred in the line 9/0 then
			// all the lines (In fact any number of lines) below will not be executed at all and
			// control jumps to the catch block. But if there is no exception all below lines will be
			// executed.
			// So, it is NOT a good practice to write the remaining code (non-exception code)
			// including the exception code inside the try block because
			// all the code will be ignored after the exception code
			// inside the try block. Always write the good code
			// AFTER TRY-CATCH block is over.
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
		}
		// catch(Exception e) { // We can also write Throwable class reference as the parameter here.

				// System.out.println("Exception is coming......"); // o/p: Exception is coming......
				// e.printStackTrace(); // printstacktrace method is
				                     // used to give all possible details to the user
				                     // about an exception like what is the exception name,
				                     // why it is coming, at which line it is occurred etc.

				                     // O/P:  java.lang.ArithmeticException: / by zero
				// at javasessions.oopconcepts.exceptionHandling.Employee.main(Employee.java:27)
				                     // OR

				                     // java.lang.NullPointerException: Cannot
				                     // read field "name" because "e" is null
				// at javasessions.oopconcepts.exceptionHandling.Employee.main(Employee.java:33)

				// If I write any other specific exception then it should be
				// as the parameter of the catch method then the control will not
				// come inside the catch block and execute the statements
				// after it. Because try block was throwing different exception
				// and we are catching different exception.

				// Now, we can't remember the exception names
				// all the time. So, what should we pass as the parameter
				// in catch if we don't know the exception ?
				// There are 2 solutions:

				// Either create separate catch block for every exception

			    // OR

				// All the exceptions' classes are the child classes of the Exception
				// class. Meaning all exceptions are a type of Exception class
				// So, if we write Exception class reference variable as the parameter
				// it will be applicable to catch all types of exceptions.

				// We can also write Throwable class as the parameter in the catch
				// function block for catching all types of exception
				// because Throwable is parent class of Exception class in JAVA.

				// INTERVIEW QUESTION : Can I write Object class also as the catch block parameter
				// to catch all types of exceptions, as Object class is the parent of
				// all the classes in JAVA?

				// No, we cannot write Object class as parameter to catch block. Catch
				// block excepts the Throwable or any of its subclasses as the parameter only.
				// But we should not give Error class as the parameter of catch block
				// because it will not handle the exception that is coming and the code
				// written after catch block will not be executed.

				// Error should not be given as the catch block parameter because
				// errors are different than exceptions like CPU errors,
				// memory leakage errors etc.

				// How errors are different from exceptions?
				// Errors in JAVA come mostly because of the H/W or environment issues
				// due to which program is not getting executed but Exceptions
				// occur due to some mistake in the program logic itself. That
				// is why we don't give Error class as the parameter to catch block IN GENERAL.
				// We mostly use exception class as the parameter.
		        // E.g of errors are I/O errors, stackoverflow error, OutOfMemory error etc.
		        // E.g. of exceptions are ArithmeticException, NullpointerException etc.

				// But Passing Exception class using only one catch block
				// is not a good practice. Because if there are multiple exceptions in the code
				// then writing only Exception class as the parameter of the catch block makes
				// the code less readable. So, we should write specific exception classes
				// for better readability, to catch all the exceptions that are coming.
			// }
		catch(ArithmeticException e) {
			System.out.println("AE is coming.....");
			e.printStackTrace();
		}
		catch(NullPointerException e) {
            System.out.println("NPE is coming.....");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Some exception is coming..."); // Now if Exception
			                                                   // class is written along with
			                                                   // the specific exception classes
			                                                   // as last catch block
			                                                   // along with Arithmetic Exception
			                                                   // and NullPointer Exception
			                                                   // then control will go to
			                                                   // which catch block, the Exception class block
			                                                   // or Arithmetic or Null pointer blocker?
			                                                   // The control will always go to Arithmetic
			                                                   // exception block because we have defined
			                                                   // specific exception that is coming and JAVA will
			                                                   // always go to the specific exception if it
			                                                   // finds it.
			                                                   // If specific exception is not defined then
			                                                   // control will go the Generic Exception class
			                                                   // block
		// But what if the Exception catch block is written as the first catch block along with
        // Specific exceptions blocks later ? Where will the control go ?
		// The control will point to the Exception block and the remaining blocks
		// which are written will be treated as unreachable code and a compile time error
		// is generated. Why ? Because
		// JVM control always points to the immediate catch block after try and if
		// if exception can be caught by that catch block then what is the point
		// writing other catch blocks also. That is why it generates compile time error.
		}

		System.out.println("Bye"); // O/P:
		                           // This line will not be executed as exception occurs in
		                           // in the above line if the exception is not handled.

		                           // But if it is handled then Bye will also be printed.

		                           // Also, if no exception is coming then also this line
		                           // will be executed.

	}

}
