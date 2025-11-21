package javasessions.exceptionhandling;

public class Browser {

	// This class shows what are custom exception ? When to
	// use them ?

	public static void main(String[] args) {

		String name = "test";

		if(name.equals("chrome")) {
			System.out.println("Launch Chrome");
		}
		else{
			System.out.println("browser not found"); // If browser name matches in the input browser name
			                                         // then enter url line will be executed.
			                                         // But when browser name doesn't match then
			                                         // also enter url line will be executed
			                                         // which is wrong. Meaning, if there is no
			                                         // browser then how can user enter URL.
			                                         // So, to handle such situation we will construct
			                                         // our own custom exception
			                                         // (shown in FrameworkException.java class)
			                                         // and throw it via this class like below
			throw new FrameworkException("browser not found");

			// INTERVIEW: Where we will use these custom exceptions in the framework?
			// Whenever we are testing negative test cases and the input
			// is not matching with the expected value then we will throw these custom
			// exceptions.
		}

		System.out.println("enter the url");

	}

}
