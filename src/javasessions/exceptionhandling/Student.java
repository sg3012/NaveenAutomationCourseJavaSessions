package javasessions.exceptionhandling;

public class Student {

	// This class shows some frequently asked interview questions
	// from try-catch-finally blocks

	public static int getStudentMarks(String name) {
		System.out.println("getting marks for: "+name);
		if(name.equals("shubham")) {

			// First try block
//			try{
//				int i = 9/0;
//				// return 65; // If I write this return here it means we have a return statement
//				           // in try. So, if whole code inside try block gets executed then
//				           // control will return value from try otherwise it will jump to catch,
//				           // execute all the code and return value from there. So, we have a return
//				           // for both try and catch blocks. There is no use of return after catch block
//				           // and "return 100" will be an unreachable code.
//			}

			// Second try block:
//			try {
//				int i = 9/3;
//				return 45;
//			}

			// Third try block:
//			try {
//				int i = 9/0; // if exception comes here the control will jump to catch
//				return 45;
//			}

			// Fourth try block:
			try {
				int i = 9/3;
				System.exit(0); // if exception doesn't come here the control will not jump to catch
				                // and will reach this line and exits JVM as well as program. It
				                // also skips finally in this case.
				return 45;
			}
			// First catch block
//			catch(ArithmeticException e) {
//				System.out.println("AE is coming");
//			}
//			return 100;

			// But if I write like this:
			// Second catch block:
//			catch(ArithmeticException e) {
//				System.out.println("AE is coming");
//				return 85;
//			}

			// return 100;

			// Third catch block:
			catch(ArithmeticException e) {
			System.out.println("AE is coming");
			System.exit(0); // after handling exception the control will reach here and
			                // exits JVM and program and will never execute finally
			return 85;
			}

			// First finally block:
//			finally {
//
//				return 100; // Warning that finally block doesn't complete normally.
//				            // Why ? Because we have a return statement in catch
//				            // as well as finally block. Now, JAVA assumes that if
//				            // control comes in catch block and executes all the code
//				            // then it will return from catch. But in JAVA control
//				            // always executes finally block irrespective of whether
//				            // exception comes or not. So, here compiler is in confusion
//				            // as to whether excecute return from catch or finally.
//				            // That is why the warning.
//			}

			// Second finally block:
			finally {
		    }

		}
		else if(name.equals("sapna")) {
			return 90;
		}
		else {
			System.out.println("student not found...");
			return -1;
		}
	}

	public static void main(String[] args) {

		int m1 = Student.getStudentMarks("shubham");
		System.out.println(m1); // getting marks for: shubham
		                        // AE is coming
		                        // 100.
		                        // control will go to try-catch execute all statements and execute
		                        // the return statement at last.
		                        // this will be for first catch and first try block
		                        // after if condition in this function.
		System.out.println("-------");

		int m2 = Student.getStudentMarks("shubham");
		System.out.println(m2); // getting marks for: shubham
		                        // AE is coming
		                        // 85.
		                        // control will go to try-catch execute all statements and execute
		                        // the return statement in the catch block and will skip
		                        // return statement after catch block.
		                        // This O/P will be for second catch and first try block
		                        // when finally block is not there
		                        // after if condition in this function.

		System.out.println("-------");

		int m3 = Student.getStudentMarks("shubham");
		System.out.println(m3);

		// O/P:

		// getting marks for: shubham
        // AE is coming
        // 100.
		// 100, because in JAVA when there is a return statement in both
		// try-catch and finally blocks JVM will execute return statements in
		// try-catch as well as finally blocks. So, in the method
		// when control jumps to catch block (SECOND catch block) it returns 85 from catch.
		// But after coming to finally it will execute return there also and
		// Overwrites 85 to 100 and final value 100 will be returned.
		// This O/P will be for the FIRST FINALLY and FIRST try block inside the if condition
		// in the method

		System.out.println("-------");

		int m4 = Student.getStudentMarks("shubham");
		System.out.println(m4);

		// O/P:
		// getting marks for: shubham
        // 100.
		// 100, because in JAVA when there is a return statement in both
		// try-catch and finally blocks JVM will execute return statements in
		// try-catch as well as finally blocks. finally will be executed
		// every time whether exception comes or not. So, in the method
		// when there is no exception in the SECOND try block it returns 45 from try.
		// But after coming to finally it will execute return there also and
		// Overwrites 45 to 100 and final value 100 will be returned.
		// This O/P will be for the FIRST FINALLY and SECOND TRY block pairs inside the if condition
		// in the method

		System.out.println("-------");

		int m5 = Student.getStudentMarks("sapna");
		System.out.println(m5);

		// O/P:
		// getting marks for: sapna
		// 90. Because if condition is not satisfied for shubham
		// and try-catch is only written from shubham inside if.
		// So, else if part for Sapna will be true and code block
		// inside that condition will be executed.

		System.out.println("-------");

		int m6 = Student.getStudentMarks("karan");
		System.out.println(m6);

		// O/P:
		// getting marks for: karan
		// student not found...
		// -1

		System.out.println("-------");

		int m7 = Student.getStudentMarks("shubham");
		System.out.println(m7);

		// O/P:
		// getting marks for: shubham
		// 45
		// 45 because in the try block
		// there was no exception and the value returned was 45. Now, when control jumped to finally
		// there is no return statement or any other code written. So, JVM
		// assumes 45 as the final return value.
		// This O/P will be for SECOND try block and SECOND finally
		// block inside the if condition in the method.

		System.out.println("-------");

		// INTERVIEW QUESTION: Can we skip the finally block execution in JAVA?
		// Yes. Answer explained in the O/P of below lines.

		int m8 = Student.getStudentMarks("shubham");
		System.out.println(m8);

		// O/P:
		// getting marks for: shubham
		// AE is coming

		// When exception comes the control jumps to catch block
		// But in catch block after the print statement we have written
		// System.exit(0). The exit command shuts the JVM and the program
		// without executing any block further. So, control will never
		// go to finally and it will be skipped.
		// This O/P is for THIRD try and Catch blocks.

		System.out.println("-------");

		int m9 = Student.getStudentMarks("shubham");
		System.out.println(m9);

		// O/P:
		// getting marks for: shubham

		// When exception does not come the control doesn't jump to catch block
		// But in try block after the print statement we have written
		// System.exit(0). The exit command shuts the JVM and the program
		// without executing any block further. So, control will never
		// go to finally and it will be skipped.
		// This O/P is for FOURTH try and THIRD Catch blocks.
	}

}
