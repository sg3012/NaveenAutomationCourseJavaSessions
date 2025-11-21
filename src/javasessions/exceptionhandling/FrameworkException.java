package javasessions.exceptionhandling;

public class FrameworkException extends RuntimeException {
	// This class shows how to create your own custom exception

	// To create custom exception we have to extend the RunTimeException class
	// Why we extend run-time exception class which creating our custom exceptions?
	// Ans: We do that because RuntimeException class doesn't force the user (developer)
	// to handle it at compile time itself and an exception is thrown. 
	// We create custom exceptions because we want them to occur in case
	// the code's logic fails at run-time and it is properly handled
	// by the developer in the code it occurs. So, our intention is to write
	// the code and allow the exception to occur at run-time and only
	// handling at the original place where it occurred which is only
	// possible when we Extend run-time exception not Exception (we will
	// force the user to handle it every time before running the code).
	// This will not create multiple try-catch block in the code 
	// where we see potential exceptions that looks ugly. 

	public FrameworkException(String msg) {
		super(msg);   // super keyword will be used to call constructor of
		           // parent RuntimeException class. The constructor
		           // takes a string message as parameter and displays on the console
		           // as exception.
	}

}
