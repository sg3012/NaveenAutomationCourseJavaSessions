package javasessions.fundamentals;

public class SwitchCaseStatement {

	// Switch case structure works best when we have to
	// directly Jump to the right condition to be
	// executed with checking all the conditions

	// In switch case the control
	// jumps to the right case without
	// checking each and every case. So, if there is
	// correct/matching case at the bottom
	// it will not check all previous cases. This is the major advantage
	
	// Switch case is only allowed for int, short, byte, string, char

	public static void main(String[] args) {

		// if I pass chrome as browser, then it will jump to the 1st case itself
		String browser = "chrome";
		switch (browser) {
		case "chrome":
			System.out.println("Launch chrome");
			break;
		case "firefox":
			System.out.println("Launch firefox");
			break;
		case "safari":
			System.out.println("Launch safari");
			break;
		case "edge":
			System.out.println("Launch edge");
			break;
		default:
			System.out.println("Please pass the right browser..." + browser);
			break;
		}
		// O/p:
//		Launch chrome

		System.out.println("-----------");
		// if I pass firefox as browser, then it will jump directly to the firefox case
		// without checking chrome
		browser = "firefox";
		switch (browser) {
		case "chrome":
			System.out.println("Launch chrome");
			break;
		case "firefox":
			System.out.println("Launch firefox");
			break;
		case "safari":
			System.out.println("Launch safari");
			break;
		case "edge":
			System.out.println("Launch edge");
			break;
		default:
			System.out.println("Please pass the right browser..." + browser);
			break;
		}
		// O/p:
//		Launch firefox

		System.out.println("-----------");
		// if I pass edge as browser, then it will jump directly to the edge case
		// without checking chrome, firefox, safari
		browser = "edge";
		switch (browser) {
		case "chrome":
			System.out.println("Launch chrome");
			break;
		case "firefox":
			System.out.println("Launch firefox");
			break;
		case "safari":
			System.out.println("Launch safari");
			break;
		case "edge":
			System.out.println("Launch edge");
			break;
		default:
			System.out.println("Please pass the right browser..." + browser);
			break;
		}
		// O/P:
//		Launch edge

		System.out.println("-----------");
		// if I don't apply the break at all in any case or apply break in some cases
		browser = "firefox";
		switch (browser) {
		case "chrome":
			System.out.println("Launch chrome");
		case "firefox":
			System.out.println("Launch firefox");
		case "safari":
			System.out.println("Launch safari");
			break;
		case "edge":
			System.out.println("Launch edge");
		default:
			System.out.println("Please pass the right browser..." + browser);
			break;
		}

		// O/p:
//		Launch firefox
//		Launch safari

		System.out.println("-----------");
		// if I pass some condition inside cases
		browser = "chrome";
		double version = 111.11;
		switch (browser) {
		case "chrome":
			System.out.println("Launch chrome");
			if (version == 111.11) {
				System.out.println("Launch chrome version - 111.11");
				break; // break is allowed inside this if block as this is written inside switch-case
			}
			break;
		case "firefox":
			System.out.println("Launch firefox");
			break;
		case "safari":
			System.out.println("Launch safari");
			break;
		case "edge":
			System.out.println("Launch edge");
			break;
		default:
			System.out.println("Please pass the right browser..." + browser);
			break;
		}
		// O/p:
//		Launch chrome
//		Launch chrome version - 111.11

		// Limitations of switch-case:

		// If we have large number of cases like checking marks of
		// students for assigning them Grades like below
		// We cannot use switch case statements for such
		// scenarios as we will have to define 100 cases
		// for every possible marks
		int marks = 100;
//		switch(marks) {
//		case value:
//			break;
//			default:
//				break;
//		}                   // In this scenario we will go with the nested if-else conditions    

		// If we have double values then we couldn't use switch case in those scenarios
		double bmi = 12.33;
//		switch (bmi) {
//		case value:
//			break;
//		default:
//			break;
//		}                // Cannot use switch case with double values

		// If we have boolean values then we couldn't use switch case in those scenarios
		boolean flag = true;
//		switch (flag) {           Error cannot use switch with boolean values
//		case true:
//			break;
//		case false;
//		    break;
//		default:
//			break;
//		}

		char ch = 'b';
		switch (ch) {
		case 'b':

			break;

		default:
			break;
		} // We can use switch case with characters

		short s = 12;
		switch (s) {
		case 12:
			break;

		default:
			break;
		} // We can use switch case with short variables

		long l = 7643839L;
//		switch (l) {     // Error couldn't use switch case with type long
//		case 100045:
//			break;
//		default:
//			break;
//		}
		
		

	}

}
