package javasessions.exceptionhandling;

public class TestException {

	public static void main(String[] args) {

		int i[] = new int[2]; // only 2 values can be stored in this array unless the size
		                      // is changed manually.
		i[2] = 10; // At compile time compiler will not catch and give the
		           // exception here. But when we run the code we get
		           // ArrayIndexOutOfBoundsException because we are trying
		           // to access and store a value at index 2 in the array which
		           // doesn't exist in the memory.
		           // This is a type of runtime/unchecked exception

		// FileInputStream ip = new FileInputStream(""); // at this line compiler
		                                              // catches and gives the underlined exception
		                                              // as FileNotFoundException when user mouse over the line.
		                                              // We have to handle this exception before running
		                                              // the code. This is called
		                                              // compile time/checked exception. To handle
		                                              // this we will either surround this line
		                                              // with try-catch block or add throws declaration
		// Thread.sleep(1000); // Again at this line compiler
        // catches and gives the underlined exception
        // as InterruptedException when user mouse over the line.
        // We have to handle this exception before running
        // the code. Again an example of checked / compile time exception.



	}

}
