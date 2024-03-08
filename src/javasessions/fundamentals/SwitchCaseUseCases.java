package javasessions.fundamentals;

public class SwitchCaseUseCases {

	public static void main(String args[]) {

		// use case 1: Write a code to identify if the entered character is a vowel or
		// consonant

		char alphabet = 'a';

		switch (alphabet) {
		case 'a':
			System.out.println("This is a vowel");
			break;
		case 'e':
			System.out.println("This is a vowel");
			break;
		case 'i':
			System.out.println("This is a vowel");
			break;
		case 'o':
			System.out.println("This is a vowel");
			break;
		case 'u':
			System.out.println("This is a vowel");
			break;
		default:
			System.out.println("This is a consonant");
			break;
		}

		// use case 2 : Switch to the right environment(dev/qa/stage/UAT/ prod)
		// according to the case

		String envName = "QA";

		switch (envName.trim().toLowerCase()) { // we have converted the env name to lowercase because
												// user can pass the env name
												// in any case and to support our cases which
												// are written in lowercase we have converted
												// it to lowercase
												// Also, we have used trim method to remove
												// all the white spaces in the env name as
												// user could also pass spaces while running the scripts
												// But if user passes and env name having spaces in the middle
												// then we will not handle this and the default
												// is executed showing some error message as below.
		case "qa":
			System.out.println("run it on QA");
			break;
		case "dev":
			System.out.println("run it on DEV");
			break;
		case "stage":
			System.out.println("run it on STAGE");
			break;
		case "uat":
			System.out.println("run it on UAT");
			break;
		case "prod":
			System.out.println("run it on PROD");
			break;
		default:
			System.out.println("no env is found by name..." + envName);
			break;
		}

		// Use case 3: Cross-bowser testing : chrome/ff/safari/edge
		// Use case 4: days in a week / months in a year
		// Use case 5: Ride Booking App - Uber (switch the cases according to the car
		// type provided)

		String carType = "Sedan";
		int persons = 6;
		switch (carType) {
		case "Mini":
			if (persons <= 4) {
				System.out.println("Book Mini"); // We could also pass if-else conditions inside switch case statement
			}
			break;

		case "Sedan":
			if (persons >= 5) {
				System.out.println("Book Sedan");

				switch (persons) { // We could also pass nested switch-case statement inside
									// a case body
				case 1:
					break;
				case 6:
					System.out.println("Extra price is 50 USD");
					break;
				default:
					break;
				}
			}
			break;

		case "Hatchback":
			System.out.println("Book Hatchback");
			break;

		default:
			System.out.println("Please provide the right car type" + carType);
			break;

		}

		// Use case 6: UpdateObjectReferencePointers based access permissions (RBAC): Giving access to users
		// based on their roles
		// For e.g. Amazon : Admin, Seller, Customer, Partner, Vendor

		// Use case 7: Run test cases based on Test Suite selection : Smoke, Regression,
		// Sanity, Prod

		String testSuiteType = "Regression";

		switch (testSuiteType) {
		case "Smoke":
			System.out.println("Run Smoke test cases");
			break;
		case "Sanity":
			System.out.println("Run Sanity test cases");
			break;
		case "Regression":
			System.out.println("Run Regression test cases");
			break;
		case "Prod":
			System.out.println("Run Production test cases");
			break;
		default:
			System.out.println("Please provide the right test suite type" + testSuiteType);
			break;
		}

	}
}