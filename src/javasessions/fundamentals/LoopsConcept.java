package javasessions.fundamentals;

public class LoopsConcept {

	public static boolean isVisible() {
		return true;
	}

	public static void main(String[] args) {
		// In JAVA Break statement will make the control/break
		// only the inner loop not the outer one, if
		// break is placed in inner loop.

		// While loop:

		// Print numbers from 1-10

		int i = 1;
//		while (i <= 10) {
//			System.out.println(i);
		i++;
//			or
//			++i;
//			or
//			i=i+1;
//		}
		System.out.println("----------");
		// Print odd numbers between 1-100 (both included)
//		while(i<=100) {
//			System.out.println(i);
//            i = i+2;
//		}

		// Print even numbers between 0-100 (both included)

		i = 0;
//		while(i<=100) {
//			System.out.println(i);
//            i = i+2;
//		}

//		i=20;
//
//		while (i <= 10) {
//			System.out.println(i); // Nothing will be printed on console
//			i++;
//		}

		int l = 1;
//		while(l<=100) {
//			if(l==5)
//			{
//				System.out.println("hi");
//			}
//			System.out.println(l); // Infinite times 1, the value of l
//		}

		while (l <= 100) {
			if (l == 5) {
				System.out.println("hi");
			}
			System.out.println(l); // 1234hi56789....100
			l++;
		}

		System.out.println("----------");

		l = 1;
		while (l <= 100) {
			if (l == 5) {
				System.out.println("hi");
				break;
			}
			System.out.println(l); // 1234hi
			l++;
		}

		System.out.println("----------");

//		l = 1;
//		while (l <= 100) {
//			if (l == 5) {
//				System.out.println("hi");
//			}
//			break;
//			System.out.println(l); // Error: dead code if write anything after break statement
//			l++;
//		}

		System.out.println("----------");

		l = 1;
		while (l <= 100) {
			if (l == 5) {
				System.out.println("hi");
			}
			System.out.println(l); // O/P : 1 (print initial value of l and then break)
			l++;
			break;
		}

		System.out.println("----------");

//		while (true) {
//				System.out.println("bye"); // infinite bye
//		}

		// Practical example of infinite loop in real world:
		// Random ticket generation systems inside a Casino

//		while(false) {
//			System.out.println("bye"); // Error: dead code if write anything in the loop body after a failed loop condition
//		}

		System.out.println("----------");

		int count = 0;
//		while (count <= 100) {
//			System.out.println(count); // O/P: Infinite times 0 as count is not increasing inside loop body
//			if (count == 25) {
//				System.out.println("25 runs");
//			}
//			if (count == 50) {
//				System.out.println("half century");
//			}
//			if (count == 100) {
//				System.out.println("century");
//			}
//		}

		System.out.println("----------");

		count = 0;
//		while (count <= 100) {
//			System.out.println(count); // O/P: 0123...25 25 runs 26 27 28....50 half century 51 52...100 century
//			if (count == 25) {
//				System.out.println("25 runs");
//			}
//			if (count == 50) {
//				System.out.println("half century");
//			}
//			if (count == 100) {
//				System.out.println("century");
//			}
//			count++;
//		}

		// real time use cases of while loop:
		// Important: We always use while loop in the cases where we don't know
		// how many times we have to repeat a case / block of code.
		// Here are some real time examples where we could use while loops:

		// In Selenium, wait for an element to appear on a web page as we don't know how
		// much the
		// script has to wait for an element to appear (wait time is not fixed)

		// In Selenium, wait for a page to load fully (wait time is not fixed and it
		// depends on
		// factors such as network speed, machine hardware etc.)

		// Employee drop-down values, where the number of employees keep
		// changing. So, we don't know how much iterations
		// it would take to traverse the whole drop-down

		// Locate an element on a webtable that has pagination
		// whose position is keeps changing due to many factors such as pages
		// increase/decrease,
		// element's position itself getting changed etc. So, we don't know how many
		// times we have to click the next button in the pagination

		// Calendar/Date picker - choose a particular date but we don't know how many
		// times we have to click
		// on next button

		// Carousel - locate an element on carousel whose position is not fixed. It can
		// be
		// on the first page today and some other page next day. So, we don't know
		// how many times we have to click the next button

		// for loop:
		// print 1 to 10:
		System.out.println("---------------");
//		for(int k=1; k<=10; k++) {
//			System.out.println(k);
//
//		}

		System.out.println("---------------");

//		for(int p = 1; p<=10;) {
//			System.out.println(p); // Infinite loop
//		}

		System.out.println("---------------");
		// another syntax for "for" loop

		int g = 1;
		for (; g <= 10; g++) {
			System.out.println(g); // 1..10
		}

		System.out.println("---------------");
		// another syntax for "for" loop

		int g1;
		for (g1 = 1; g1 <= 10; g1++) {
			System.out.println(g1); // 123....10
		}

		System.out.println("---------------");
		for (int m = 1; m <= 10; m++) { // O/P : 13579
			System.out.println(m);
			m++;
		}

		System.out.println("---------------");
		for (int m = 1; m <= 10; m++) { // O/P : 13579
			System.out.println(m);
			m++;
		}

//		System.out.println("---------------");
//		for(;;) { // Infinite bye, if we don't write anything in the condition part
		// inside a for loop then it will assume true
//			System.out.println("bye");
//		}

//		System.out.println("---------------");
//		for(;true;) { // Infinite bye, if we don't write anything in the condition part
//		              //inside a for loop then it will assume true
//			System.out.println("bye");
//		}

		System.out.println("---------------");
		for (;;) { // bye once, because we have applied break.
			System.out.println("bye");
			break;
		}

		System.out.println("---------------");

		for (int run = 0; run <= 100; run++) { // 0
												// DUCK....bye
			System.out.println(run);
			if (run == 0) {
				System.out.println("DUCK....bye");
				break;
			}
		}

		System.out.println("---------------");

		for (int run = 0; run <= 100; run++) { // O/P : DUCK....bye
			if (run == 0) {
				System.out.println("DUCK....bye");
				break;
			}
			System.out.println(run); // This statement will not be printed as after break loop also terminates.
			// It will not be considered a dead code at compile time as if the condition
			// inside if block is not satisfied and break is not executed, then the control
			// has to move to the remaining
			// lines of code to execute them inside the loop body. So, the dead code concept
			// will
			// only be applicable inside the if block (if we write anything immediately
			// after break inside the if block) if the break is written inside an if block.
			// It is designed like that in JAVA.

		}
		System.out.println("---------------");

		for (int run = 10; run <= 100; run++) { // O/P : 10Hello11Hello12Hello......100Hello
			System.out.println(run);
			if (run == 0) {
				System.out.println("DUCK....bye");
				break;
			}
			System.out.println("Hello"); // This statement will be printed
			// and will not be considered a dead code at run time also as if the condition
			// inside if block is not satisfied and break is not executed, then the control
			// has to move to the remaining
			// lines of code to execute them inside the loop body. So, the dead code concept
			// will
			// only be applicable inside the if block (if we write anything immediately
			// after break inside the if block) if the break is written inside an if block.
			// It is designed like that in JAVA.
		}

		// real time use cases of for loop:
		// Important: We always use for loop in the cases where we know
		// how many times we have to repeat a case / block of code.

		// to fetch values from a static array as the size of it is always fixed

		// fetch values from a drop-down having month values

		// Fetch values from a category drop-down which will mostly
		// fixed number of categories for e.g. : Big Basket application
		// only sells products belonging certain categories they will
		// not be changed frequently

		// Fetching values from a country drop-down - the number of countries will be fixed most of the time

		// Airline Seat allocation on flight booking app - the seats on a flight will be fixed most of the time

		// Number of attempts user is given to enter a valid password. The password prompt
		// will be seen on a net banking application most of the time and user
		// will be given only 3 attempts to provide a right password

		//

	}

}
