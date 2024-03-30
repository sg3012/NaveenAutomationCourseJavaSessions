package javasessions.exceptionhandling;

public class FrameworkException extends RuntimeException {
	// This class shows how to create your own custom exception

	// To create custom exception we have to extend the RunTimeException class

	public FrameworkException(String msg) {
		super(msg);   // super keyword will be used to call constructor of
		           // parent RuntimeException class. The constructor
		           // takes a string message as parameter and displays on the console
		           // as exception.
	}

}
