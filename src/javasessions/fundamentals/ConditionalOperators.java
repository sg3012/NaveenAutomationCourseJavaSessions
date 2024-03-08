package javasessions.fundamentals;

public class ConditionalOperators {

	public static void main(String[] args) {
		System.out.println(10 == 10); // true
		System.out.println(10 == 20); // false

		int x = 10;
		int y = 20;
		if (x == y) {
			System.out.println("x is eq to y");
		} else {
			System.out.println("x is not eq to y"); // x is not eq to y
		}

		if (x >= y) {
			System.out.println("x is grtr than or eq to y");
		} else {
			System.out.println("bye"); // bye
		}

		// Following are the comparison operators used in JAVA:
		// == , !=, >, <, <=, >=

		if (x != y) {
			System.out.println("PASS"); // PASS
		} else {
			System.out.println("FAIL");
		}

		if (true) { // Writing an if condition like this will always execute the if block as we are
					// intentionally passing true as the condition
			System.out.println("Hiii"); // O/P: Hiii
		}
//		else { 
//			System.out.println("Hello Bye"); This will be a dead code as the previous if condition will always be true
		// and control will never come inside the else block
//		} 

		boolean flag = false;
		if (flag) { // In this method we are passing the variable itself as a condition.
					// Meaning, the value of flag will always be a boolean
					// and if true the if block will be executed.
			System.out.println("Hii");
		} else {
			System.out.println("Bye"); // Bye
		}

		double d1 = 12.33;
		double d2 = 12.33;

		if (d1 == d2) {
			System.out.println("both are eq"); // both are eq
		}

		else {
			System.out.println("both are not eq");
		}

		// Equal to operator (==) : is applicable to all primitive data types

		// Applying equal to operator on chars

		char ch1 = 'a';
		char ch2 = 'a';

		if (ch1 == 97) {
			System.out.println("c1 and c2 are eq"); // c1 and c2 are eq
		}

		// nested if-else

		int marks = 100;
		if (marks <= 100) {
			if (marks >= 90) {
				System.out.println("Grade A"); // Grade A
				if (marks >= 95) {
					System.out.println("Eligible for scholarship"); // Eligible for scholarship
				} else {
					System.out.println("Not eligible for scholarship");
				}
			} else {
				System.out.println("Grade B");
				if (marks >= 70) {
					System.out.println("You got 20% discount on Fee");
				}
			}
		} else {
			System.out.println("Incorrect Marks");
		}
		
		// if-if-if-if (Multiple ifs structure)
		// Let's we have to implement a Cross-browser logic and execute the code block according
		// to the browser being passed
		String browser = "Chrome"; 
		if(browser.equals("Chrome")) {
			System.out.println("Launch Chrome");
		}
		if(browser.equals("firefox")) {
			System.out.println("Launch Firefox");
		}
		if(browser.equals("safari")) {
			System.out.println("Launch Safari");
		}
		if(browser.equals("edge")) {
			System.out.println("Launch Edge");
		}
		else {
			System.out.println("Plz pass the right browser..."+browser);
		}
		
		// O/p : 
		// Launch Chrome
		// Plz pass the right browser...Chrome
		
		// The above code written with multiple ifs is very in efficient
		// as every if condition is going to be executed/checked
		// irrespective of whether first condition was true or false and we got the browser as "Chrome"
		// That is why the statement from else block is getting executed even if we
		// got the browser as chrome. The above structure is also called independent ifs
		// or parallel ifs
		
		// To fix the above problem we if-else-if structure like below:
		
		String browser1 = "Chrome"; 
		if(browser1.equals("Chrome")) {
			System.out.println("Launch Chrome");
		}
		else if(browser1.equals("firefox")) {
			System.out.println("Launch Firefox");
		}
		else if(browser1.equals("safari")) {
			System.out.println("Launch Safari");
		}
		else if(browser1.equals("edge")) {
			System.out.println("Launch Edge");
		}
		else {
			System.out.println("Plz pass the right browser..."+browser);
		}
		
		// In the above code if the condition is satisfied in the beginning itself
		// the control will not go to other conditions. But if we found the browser
		// in a condition which is not in the beginning rather at the bottom
		// then again the control will go to every condition and it is checked.
		// To solve this problem we have SWITCH-CASE Structure in JAVA.
		
		
	}

}
