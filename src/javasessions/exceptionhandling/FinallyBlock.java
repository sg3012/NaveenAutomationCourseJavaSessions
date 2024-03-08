package javasessions.exceptionhandling;

public class FinallyBlock {
	// This class shows the use of finally keyword in JAVA
	
	// Finally block is used to run a code irrespective of whether
	// exception is coming or not in the previous lines
	
	// Finally block is always written with try-catch block.
	// It CANNOT be written in isolation. (INTERVIEW).

	public static void main(String[] args) {
		
		System.out.println("ABC"); // ABC
		
//		finally {
//			// Not possible. We cannot write finally block before try-catch block
//			// because it will then be considered isolated.
//		}
		
		try {
			 int i = 9/0; // exception
			
			// if I write the above line like:
			//int i = 9/3; // no exception
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming...."); // AE is coming.... (if exception occurs)
			e.printStackTrace(); // stack trace will be printed
			
//			finally {
//				 // Not possible. We cannot write finally block inside catch block
//			}
		}
		
		// INTERVIEW: Can I write try block without catch block in JAVA?
		// ANS: If I comment the catch block above but finally
		// block written then can I write try block without catch?
		// yes, we can write try block without catch but with finally block.
		// But it's not a good practice to write try without catch block.
		
		// INTERVIEW: Can I write catch block without try block in JAVA?
		// ANS: Not possible
		
		finally {
			System.out.println("I am in finally block"); // I am in finally block
			                                             // finally this statement
			                                             // will be executed irrespective
			                                             // of exception is coming
			                                             // in try-catch block or not
			
			// We can also try-catch-finally blocks inside a finally block like this:
			
			try {
				 int i = 8/0; // exception
				
			}
			catch(ArithmeticException e) {
				System.out.println("AE is coming...."); // AE is coming.... (if exception occurs)
				e.printStackTrace(); // stack trace will be printed
			}
			finally {
				System.out.println("I am in second finally block"); // I am in second finally block
			}
		}
		
		
	}

}
