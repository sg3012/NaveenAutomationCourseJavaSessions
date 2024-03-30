package javasessions.fundamentals;

public class ArraysConcept {

	public static void main(String[] args) {

		// Static Array
		// An array in which size is always fixed once it is declared.

		// After declaration if we try to increase the size, JAVA will not allow us to
		// do it at run time

		// Even at compile time if we want to go beyond the length of
		// the array and do something with the indices we cannot
		// do it unless we increase the size manually again.

		// It can only hold similar type of data. So, int array will only
		// hold integer values not floating point numbers.

		// So, we will use static arrays only when we know the size
		// of the it holds will remain fixed most of the time

		// defining an integer array:
		int k[] = new int[4];

		// low = 0
		// high = 3 --> Length -1
		// Length = 4 --> high + 1
		// Range = 0-3

		// Filling an array without using loops:

//		k[-1] = 60; //Array Index Out of bounds exception (AIOB) at run time
		k[0] = 10;
		k[1] = 20;
		k[2] = 30;
		k[3] = 40;
//		k[4] = 50; // AIOB (At the time of adding values)

		// Printing array values without loops:

		System.out.println(k[0]); // 10
		System.out.println(k[3]); // 40
//		System.out.println(k[4]); // AIOB (while fetching the values at run time )

		// double array:
		double d[] = new double[2];
		d[0] = 12.33;
		d[1] = 34.44;

		// char array:
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = 'A';
		c[2] = '0';

		// String array:
		String browsers[] = new String[4];

		browsers[0] = "Chrome";
		browsers[1] = "Firefox";
		browsers[2] = "Safari";
		browsers[3] = "Edge";



	}
}
