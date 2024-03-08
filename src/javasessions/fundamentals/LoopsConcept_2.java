package javasessions.fundamentals;

public class LoopsConcept_2 {

	public static void main(String[] args) {

		// Print 10 to 1:
		int i = 10;
		while (i >= 1) { // 10 9 8...1
			System.out.println(i);
			i--;
		}

		System.out.println("------------");

		for (int p = 10; p >= 1; p--) {
			System.out.println(p);
		}

		// do-while:
		// The major difference between the while and do-while loop is that
		// the statement in the loop body will execute at least once in a do-while loop
		// > then the condition is checked
		// and subsequent statements will be executed.
		// On, the other hand in while loop the condition is checked 1st > then only the
		// statements will
		// will be executed if the condition is true

		// 1 to 10:
		int s = 1;

//		System.out.println("------------");
//		do {
//			System.out.println(s); // Infinite loop, will keep printing print 1 
//		}
//		while(s<=10);

//		System.out.println("------------");
//		do {
//			System.out.println(s); 
//			s++;
//		}
//		while(s<=10);

		// making the condition false in the start itself

		System.out.println("------------");
		s = 15;
		do {
			System.out.println(s); // Loop will executed at least once and the value of s will be printed i.e, 15
			s++;
		} while (s <= 10);

		System.out.println("------------");
		s = 1;
		do {
			s++;
			System.out.println(s); // 2 3 4...11
		} while (s <= 10);

		System.out.println("------------");
		s = 1;
		do { // 2,4,6...10
			s++;
			System.out.println(s);
			s++;
		} while (s <= 10);

		// real-time use cases of do while loop:

		// There is a role drop-down in which a default value of Admin is already
		// selected
		// but sometimes that value is taking 2 secs, sometimes 5 secs to appear
		// So, we will apply a do-while loop in which we always check that if the value
		// is there or not in the do body, initially. If it's there then we will
		// immediately break the loop
		// otherwise, check the while condition and execute the loop again, to wait for
		// the value to appear.

		System.out.println("------------");

		int l = 1;
		do { // 12345Hi
			System.out.println(l);
			if (l == 5) {
				System.out.println("Hi");
				break;
			}
			l++;
		} while (l <= 100);

		System.out.println("------------");

		// even numbers : for loop

		for (int e = 2; e <= 10; e = e + 2) { // 246810
			System.out.println(e);
		}

		// another way of increasing the value of a variable by 2
		// inside a for loop

		System.out.println("------------");

		for (int e = 2; e <= 10; e++) { // 246810
			System.out.println(e);
			e++;
		}

		// Print the numbers between 1 to 100 but also print Hii if a number is
		// divisible by 5

		System.out.println("------------");
		for (int n = 1; n <= 100; n++) { // 12345Hii678910Hii......100Hii
			System.out.println(n);
			if (n % 5 == 0) {
				System.out.println("Hii");
			}
		}

		System.out.println("------------");

		// Using double data type with loops:

		for (double d = 1.0; d <= 10.0; d++) { // 1.0 2.0 3.0 ...... 10.0
			System.out.println(d);
		}

		System.out.println("------------");

//		for(double v = 1.0; v<=10.0; v=v+0.1) { // 1.0, 1.1 ...... 10.0
//			System.out.println(v);
//		}

		// Using char data type with loops:
		// Print the ASCII table for characters from a-z (IMPORTANT interview question)
		System.out.println("------------");
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(c + " " + (int) c);
		}

		// Print the ASCII table for characters from A-Z (IMPORTANT interview question)
		System.out.println("------------");
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.println(c + " " + (int) c);
		}

		// Using conditions inside a loop
		System.out.println("------------");
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(c);
			if (c == 'y') {
				System.out.println("Execute my test cases");
				break;
			}
		}

		System.out.println("------------");
		for (;;) { // Bye (only one due to break).
			System.out.println("Bye");
			break;
		}

		System.out.println("------------");
		int count = 0;
//		for (;;) { // Infinite Bye
//			System.out.println("Bye");
//				if (count == 5) {
//				break;
//				}
//		}
		
		System.out.println("------------");
		for (;;) { // Bye Bye Bye Bye Bye Bye
			System.out.println("Bye");
				if (count == 5) {
				break;
				}
				count++;
		}
		
		System.out.println("------------");
		int pointer = 0;
		while(true) { // passing true in any loop condition will generate an infinite loop
			System.out.println("checking element in the attempt: "+pointer); // We will use infinite loops in Selenium where 
			                                        // we have to keep on waiting for a certain 
			                                        // element to be available, until a maximum time limit
	                                                // is reached.
			if(pointer==10) {
				System.out.println("Element is displayed....Click on the element");
				break;
			}  
			pointer++;
			
		}	
		
		

	}

}
