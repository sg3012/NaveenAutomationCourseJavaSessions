package javasessions.exceptionhandling;

public class ThrowKeyword {
	// This class explains about throw keyword in JAVA and how to create your own 
	// CUSTOM exceptions
	
	// What is throw keyword? When and where to use throw keyword?
	// How to create custom exceptions etc ?
	
	
	// THROW KEYWORD: throw is a keyword which is used to deliberately throw an exception in JAVA
	// JAVA cannot provide exceptions for each and every case. So, in cases where we want
	// our own CUSTOM exceptions to be thrown , we use throw keyword to throw them.
	// So, throw keyword is mainly used in the cases where we want to throw custom exceptions
	// like if there is no data in excel then we can throw "Excel data not found", if
	// browser name is not correct then we can throw "Browser name not correct" exception like that.
	
	// throw keyword also doesn't handle the exception. We use try-catch block to do it.

	public static void main(String[] args) {

		String browserName = null;
		if(browserName == null) {
			try {
			throw new Exception("NOBROWSEREXCEPTION");      // this line shows how to throw
                                                            // your own exception. But if we write
                                                            // this plain line JAVA will throw a compile time
                                                            // error to handle this exception. To do that
            												// we surround throw statements with try-catch block.     
			                       
			} catch(Exception e) {
				System.out.println("browser not found.....please pass the right browser"); // O/P
				// browser not found.....please pass the right browser
				 
				e.printStackTrace(); // this line will print the whole exception just 
				                     // like throw keyword 
				                     // O/P : 
//				java.lang.Exception: NOBROWSEREXCEPTION
//				at javasessions.oopconcepts.exceptionHandling.ThrowKeyword.main(ThrowKeyword.java:25)
			} 
		}
	}
}
