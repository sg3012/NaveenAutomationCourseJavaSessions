package javasessions.fundamentals;

public class StringConcatenation {

	public static void main(String[] args) {
		// String is a class in JAVA
		String s = "hello world";
		System.out.println(s); // O/P - hello world

		String s1 = "100";
		System.out.println(s1 + 20); // O/P - 10020

		System.out.println(10 + 20); // O/P - 30

		int a = 100;
		int b = 200;
		String x = "Hello";
		String y = "Selenium";

		System.out.println(a + b); // O/P - 300
		System.out.println(x + y); // O/P - HelloSelenium

		System.out.println(a + b + x + y); // O/P - 300HelloSelenium
		System.out.println(x + y + a + b); // O/P - HelloSelenium100200
		System.out.println(x + y + (a + b)); // O/P - HelloSelenium300
		System.out.println(a + b + x + y + a + b); // O/P - 300HelloSelenium100200

		System.out.println("Value of a: " + a); // O/P: Value of a: 100
		System.out.println("Value of b: " + b); // O/P: Value of b: 200

		System.out.println("The sum is: " + (a + b)); // O/P: The sum is: 300

		double c = 12.33;
		double d = 12.44;
		System.out.println(c + d); // O/P: 24.77
		System.out.println(x + y + c + d); // O/P: HelloSelenium12.3312.44
		System.out.println(a + b + x + y + c + d); // O/P: 300HelloSelenium12.3312.44
		System.out.println(a + b + x + y + (c + d)); // O/P : 300HelloSelenium24.77

		char c1 = 'a';
		char c2 = 'b';
		System.out.println(c1 + c2); // O/P: 97 + 98 = 195
		System.out.println(x + y + c1 + c2); // O/P: HelloSeleniumab (ASCII values will come into picture only when some
												// calculation
												// is involved. Otherwise, character value will be taken).
		System.out.println(c1 + c2 + x + y); // O/P: 195HelloSelenium

		System.out.println(a + b); // 300
		System.out.println(a - b); // -100
		System.out.println(b / a); // 2
		System.out.println(a * b); // 20000

		System.out.println(c2 - c1); // 98-97 = 1
		System.out.println(c1 * c2); // 97*98 = 9506

		System.out.println("This employee is: " + true); // This employee is true
		System.out.println("This bank account is: " + false); // This bank account is false

		System.out.println(9 / 3); // 3
		System.out.println(9 / 2); // 4 (only int part will be displayed)
		System.out.println(9.0 / 2); // 4.5 (because at least one decimal value is included )
		System.out.println(9 / 2.0); // 4.5 (because at least one decimal value is included )
		System.out.println(9.0 / 2.0); // 4.5 (because both are decimal values)

		System.out.println(0 / 1); // 0
		System.out.println(0 / 100); // 0

//		System.out.println(9/0); // Arithmetic Exception: divide by zero (AE)
//		System.out.println(0/0); // Arithmetic Exception: divide by zero (AE)

		System.out.println(9.1 / 0); // Infinity (because if division involves at least one floating point number
										// while dividing by 0, JAVA considers it as infinity
										// Arithmetic Exception will only be thrown in case of integer values)

		System.out.println(9.0 / 0); // Infinity

		System.out.println(9 / 0.0); // Infinity ( because if division involves dividing by 0.0, JAVA considers it as
										// infinity
										// Arithmetic Exception will only be thrown in case of integer values)
		System.out.println(9.0 / 0.0); // Infinity

		System.out.println(0.0 / 0.0); // NaN - Not a Number (because JAVA doesn't recognise it's result
										// as a number anymore.)
		System.out.println(0 / 0.0); // NaN - Not a number (Again JAVA doesn't recognise the result as a number
										// anymore )

//		System.out.println(0/0); // AE

//		System.out.println('a'/0); // AE (because internally JVM will take the ASCII value of 'a' i.e., 97 for division)

		System.out.println('a' / '0'); // 97/48 = 2 (This time it will not give AE as JAVA will take
//		                                                              ASCII value of '0' into consideration as it is enclosed in single quotes)

		byte a1 = 10;
		byte b1 = 20;

//		byte c1 = a1+b1; // This gives the compilation error that "cannot convert from int to byte"
		// as JAVA automatically promotes the arithmetic calculation on
		// byte variables as 'int' because compiler plays safe and assumes
		// if the results of the calculations on byte would be out of range
		// of what byte data type could store (-128 to 127), it could be a problem.
		// To see the proof of this see the code snippet below:

		Object result = a1 + b1;
		// getClass() - returns the fully qualified class name of an object
		// representation
		// getSimpleName() - returns only the class name of an object representation
		// we will use above 2 methods see the data type class of the result above:

		System.out.println(result.getClass().getSimpleName()); // O/P : Integer class, which proves that
																// the data type of 'result' was int which
																// was automatically promoted to Integer class.
		// To do the calculation on byte variables store the result in int or upper data, but at least int.
		// type like below:

		int result1 = a1 + b1;
		System.out.println(result1);

		int result2 = b1 - a1;
		System.out.println(result2);

		int f1 = 100;
		int f2 = 200;
		int f3 = f1 + f2;

		System.out.println(10 % 2); // 0 (Modulus (%) will return the remainder)
		System.out.println(9 % 2); // 1
		System.out.println(50 % 3); // 2
		System.out.println(100 % 3); // 1

		byte h = 065;
		System.out.println(h); // 53 (JAVA considers numbers starting with 0 as Octal number which has
//		                                           a base of 8. So it will convert the octal to decimal number internally
		// and then prints the decimal O/P on console)
//		Octal to Decimal conversion:
		// 065 = 0*8^2+6*8^1+5*8^0

		// byte b2 = 089; compile time error because Octal Numbers can only store digits
		// Ranging from 0-7
		// JAVA considers all numbers starting with 0 as Octal and when it
		// finds digits more than 7 the compiler will throw and error

		// byte b3 = 0736; compile time error again even if the digits in the octal number
		                            // are within the range. This is because after conversion from octal to decimal
		                            // it will result in 478 which again goes out of range for what byte
		                           // could store as a max positive value. So, we will store it in bigger data type like below:

		short t = 0736; // 478 (Again O/P is octal converted to decimal and then print to console)
		System.out.println(t);

		int u = 0765676543;
		System.out.println(u);
		// 0765676543 = (0 × 8⁹) + (7 × 8⁸) + (6 × 8⁷) + (5 × 8⁶) + (6 × 8⁵) + (7 × 8⁴) +
		// (6 × 8³) + (5 × 8²) + (4 × 8¹) + (3 × 8⁰) = 131562851

		byte x1 = 125;
		byte x2 = 120;
		byte x3 = (byte) (x1+x2);

		System.out.println(x3);  // -11 (This is because we are forcefully converting the result to byte
        // which is out of range for byte. So, as a result what happens internally
        // is byte could only store 256 numbers in total (+ve, -ve).
        // So, it will subtract 256 from 245 (125 + 120) and store -11 in byte).

		// SOME OPTIMIZATION TECHNIQUES:
		// - If there are some small numbers like age, daysInWeek etc store them in byte unless some calculation is involved
		     byte age = 10;
		     byte daysInWeek = 7;
		// - If there are some calculations involved and the numbers are still in range of byte,
		// then take the numbers in byte variables and store the result in "int" like below:

		     // Method1:
		     byte  u1= 120; // 1 byte
		     byte  u2= 125; // 1 byte
		     int u3 = u1 + u2; // 4 bytes
		     // Total = 6 bytes

		     // Method2:
		     int u4 = 120; // 4
		     int u5 = 125; // 4
		     int u6 = u4+u5; // 4
		    // Total = 4 bytes
		   // So, Method 1 is more optimized then method 2.



	}

}
