package javasessions.fundamentals;

import java.util.Arrays;

public class ArrayLiteralsConcept {

	public static void main(String[] args) {
		int k[] = new int[10];
		k[0] = 100;
		k[1] = 200;
		System.out.println(k[0]); // 100
		System.out.println(k[2]); // 0 - default value of int

		k[5] = 500;
		System.out.println(k[5]); // 500

		// Above syntax is lengthy for more values. If we know the values already
		// then we should use Array Literals

		// Array Literals:
		// Difference between Array and Array literals:
		// In Normal array declaration we use new keyword, but in Array literal we
		// don't.

		// If we declare an array using new keyword, the compiler will immediately
		// allocate those number of segments (equal to length) in the memory. But if
		// some segments are not initialized with values then those will remain empty,
		// this
		// is not the case with Array literals. When we declare an array using literals
		// then the new memory is allocated only when we put a value after comma. This
		// is a
		// major advantage of Array literal over Arrays with new keyword.

		// we can use array literals when the following conditions are met:
		// If we know the values going to be stored in the array
		// The size of the values is not much.

		// we can use array with new keyword when the following conditions are met:
		// If we don't know the values going to be stored in the array
		// The size of the values is not much.

		int p[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int l = p.length;
		System.out.println(l); // 10
//		p[10] = 200; // AIOB
//		System.out.println(p[10]); // Compiler will not reach at this line

		// double array literal:
		double d[] = {34.67, 89.76, 12.33};

		// char array literal:
		char c[] = {'a','b','y'};

		// String array literal:
		String emp[] = {"Jill", "Robin", "Shubham"};

		// Object array literal:
		Object studentInfo[] = {"Chirag", 31, 56.88, 'm', "Delhi", "India", true};

		// Printing array literals using toString() method:
		System.out.println("-------");
		System.out.println(Arrays.toString(d));
		System.out.println("-------");
		System.out.println(Arrays.toString(c));
		System.out.println("-------");
		System.out.println(Arrays.toString(emp));
		System.out.println("-------");
		System.out.println(Arrays.toString(studentInfo));

		// Traversing and Printing Array literal using for each loop:
		System.out.println("-------");
		for(String e : emp) {
			System.out.println(e);
		}

		System.out.println("-------");
		for(Object e : studentInfo) {
			System.out.print(e+" ");
		}
	}
}
