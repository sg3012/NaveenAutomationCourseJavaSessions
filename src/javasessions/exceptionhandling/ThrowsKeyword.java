package javasessions.exceptionhandling;

public class ThrowsKeyword {
	
	// This class explains what is throws keyword in JAVA? When and where to use it?
	// We will also prove that throws keyword cannot handle exception.
	
	// Throws keyword is used to tell the compiler that a particular method
	// may throw an exception. We use throws keyword when we have an idea about 
	// which exception a method will throw. So, it basically is used
	// in case of checked exceptions.
	
	// Throws keyword DOES NOT handle exception. It only gives a signal
	// that a particular method may throw an exception but when an exception
	// occurs the program terminates and the execution doesn't continue further.
	
	// ONLY try-catch block handles exception.
	
	// 
	
	public void m1() throws ArithmeticException{ // m1 method throws the exception
		                                         // we can remove this throws keyword also
		                                         // as m3 has handled the exception
                                                 
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() throws ArithmeticException{ // m2 method throws the exception
		                                         // we can remove this throws keyword also
                                                 // as m3 has handled the exception                                     
		System.out.println("m2 method");
		m3();
	}
	
	public void m3() throws ArithmeticException { // m3 method throws the exception
		                                          
		System.out.println("m3 method");
		
		try {
		int i = 9/0;
		} catch(ArithmeticException e) {
			System.out.println("AE is coming...");
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args){ // main method also throws the exception
                                                                     
		ThrowsKeyword tk = new ThrowsKeyword();
		tk.m1();
		System.out.println("Bye"); // control will not reach this line and exception will be thrown
		                           // Why ? Because throws keyword just throw the exception 
		                           // from one method to other i.e. from m3 to m2 to m1 to main. 
		                           // When control JVM comes to main method it doesn't handle the exception
		                           // on it's own as well. So, we can say that throws keyword just alerts
		                           // the compiler of certain method throwing exception and eventually
		                           // throws it on the console and terminates the program without
		                           // executing further lines  of code from the point exception
		                           // occurred. That is why we can say that throws keyword cannot handle 
	                               // exception.
		                           // O/P : Bye, if the exception is handled.
		
		// INTERVIEW QUESTION : Should we handle the exceptions inside main method when every method
		//                        in the program is throwing exceptions to other methods?
		// No, it is not a good practice because the main method is just a caller
		// method for the actual methods in which business logic is written and it
		// is exposed to the end user. Now, is it user's responsibility to handle exception?
		// No. That is why the exception should always be handled either in the method
		// at the line where actual exception is coming or in any one of the methods
		// that are calling the culprit method.
		// The BEST practice is always handle the exception in the method and line
		// which is the actual cause of exception. 
		// Also, we should not use throws keyword if we are not creating a
		// programs for some third party program to use it. If all the code
		// is ours we should not delegate the exceptions using throws
		// to other method. Instead, the exceptions should always be handled within the 
		// same method or line throwing exception.
		// TRY avoiding delegating exceptions to other methods be handled.
		
		// A real-time example of an application in which exceptions are
		// thrown by different functions but caught at one point 
		// may be Payments module of Amazon app which is interacting with bank servers
		// for payments processing. But due to some issue the bank server is 
		// throwing an exception to Amazon server and Amazon app. Now,
		// if Amazon web page throws the exception to the end user also
		// then it will not be readable at all. So, in this case it's Amazon's responsibility 
		// (not the end user) to handle the exception and provide a meaning generic message on the page 
		// like "The server is down. Please try later" instead of exception like
		// "File not found exception".

	}

}
