package javasessions.oopconcepts.methods;

public class EmployeeTest {

	// Whenever you write a function in your app, always write the
	// Acceptance criteria related like below

	// ACC Criteria: Write A Function (WAF)
	//  I want to calculate the score/marks of my employee
	// create a function : getEmployeeMarks
	// input parameters: empName (String)
	// return : marks (int)

	public int getEmployeeMarks(String empName) {
		System.out.println("getting employee marks for.." + empName);
//		int marks = -1;
		if(empName.equals("Abhishek")) {
			// marks = 90;
			return 90;
		}
		else if(empName.equals("Shubham")) {
			// marks = 95;
			return 95;
		}
		else if(empName.equals("Ravi")) {
			// marks = 80;
			return 80;
		}
		else if(empName.equals("Naveen")) {
			// marks = 10;
			return 10;
		}
		else {
			System.out.println("emp name not found for.."+empName);
			return -1;
		}

		// Instead of writing one single return at the end we can also
		// write return statement for corresponding conditions
		// But writing so many returns in the code block makes it
		// look ugly. So, do all the calculations in the code and finally write a single return
		// statement at the end. This looks neat.
		// return marks;
	}

	public static void main(String[] args) {

		EmployeeTest emp1 = new EmployeeTest();
		int marks = emp1.getEmployeeMarks("Abhishek");
		System.out.println(marks); // getting employee marks for..Abhishek
		                           // 90

		marks = emp1.getEmployeeMarks("Naveen");
		System.out.println(marks); // getting employee marks for..Naveen
                                   // 10

		marks = emp1.getEmployeeMarks("Tom");
		System.out.println(marks); // getting employee marks for..Tom
		                           // emp name not found for..Tom
                                   // 10. But this is slightly confusing Output
		                           // as what if there is an employee named Tom whose
		                           // marks is 0 but the code is still printing the
		                           // message emp not found...
		                           // To fix this condition we will use if condition like below:
//		if(marks>=0) {
//			System.out.println("print the marksheet"); // If we pass the value as Tom in the method call
//			                                           // then O/P :
//			                                           // getting employee marks for..Tom
//			                                           // emp name not found for..Tom
//			                                           // 0
//			                                           // print the marksheet
//			                                           // Again a confusion in the code O/P
//			                                           // that employee is not found and marks is 0 then why to print
//			                                           // the mark sheet? So, fix both the issues we will
//			                                           // return default value of marks as -1 instead of 0
//			                                           // So, if the employee is not there then it will return 0
//		                                               // and it's there and got 0 marks it will return 0.
//
//		}

		if(marks>=0) {
			System.out.println("print the marksheet");  // getting employee marks for..Tom
                                                        // emp name not found for..Tom
			                                            // -1
		}
	}

}
