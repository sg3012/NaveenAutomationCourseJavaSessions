package javasessions.fundamentals;

import java.util.Arrays;

public class ArraysExamples {

	public static void main(String[] args) {

		// Real time use cases of static Arrays:

		// Categories (Nav Bar items) on an Ecommerce app
		// like Bigbasket will be having fixed categories under
		// which it will be selling the products, Myntra will
		// be having fixed categories under which it will selling products etc.

		// Sports news website like ESPNCricInfo for Cricket, which gives
		// score calculation for teams will fixed 15 (11 playing XI and 4 Extras)
		// players in every game.

		// Create an array for Player Info on ESPNCricinfo as below
		// Player info -
		// name - String
		// age - int
		// country - String
		// total Runs - int
		// strike rate - double/float

		Object player[] = new Object[5]; // static array is used because the app will mostly store
		                                 // only 5 info about the player as mentioned above
		player[0] = "Rashid Khan";
		player[1] = 30;
		player[2] = "AFG";
		player[3] = 1500;
		player[4] = 120.36;

		Object player1[] = new Object[5];
		player1[0] = "Shubham";
		player1[1] = 19;
		System.out.println(player1[2]); // null, as the default value of Object is null in JAVA
		System.out.println(player1[3]); // null, as the default value of Object is null in JAVA
		System.out.println(player1[4]); // null, as the default value of Object is null in JAVA

		System.out.println(Arrays.toString(player1)); // [Shubham,19,null,null,null]

		String student[] = new String[5];
		student[0] = "Ravishankar";
		student[1] = "Kailash";
		System.out.println(Arrays.toString(student)); // [Ravishankar, Kailash, null, null, null]
		                                              // null will be printed for empty blocks in array,
		                                              // as the default value of String
		                                              // variable declared using new keyword is null in JAVA

		int i[] = new int[5];
		i[0] = 100;
		System.out.println(Arrays.toString(i)); // [100, 0, 0, 0, 0]
		                                        // 0 will be printed for empty blocks
		                                        // as the default value for int is 0.

		short sh[] = new short[5];
		sh[0] = 200;
		System.out.println(Arrays.toString(sh)); // [100, 0, 0, 0, 0]
		                                         // 0 will be printed for empty blocks as
		                                         // the default value for short is also 0,
		                                         // because short is also coming from integer family

		// Note: default values for byte and long will also be 0 as they are also coming from
		// Integer family

		double d[] = new double[5];
		d[0] = 300.15;
		System.out.println(Arrays.toString(d)); // [300.15, 0.0, 0.0, 0.0, 0.0]
		                                         // 0.0 will be printed for empty blocks
		                                         // as the default value for double is 0.0

		// Note: default value for float is also 0.0 as it is also coming from decimal family

		char ch[] = new char[5];
		ch[0] = 'a';
		System.out.println(Arrays.toString(ch)); // [a, , , ,]
		                                         // a single blank space will be
		                                         // printed for empty blocks as the default value
		                                         // for char is ' '.
		boolean bool[] = new boolean[5];
		bool[0] = true;
		bool[1] = true;
		System.out.println(Arrays.toString(bool)); // [true, false, false, false, false]
		                                           // false will be printed for empty blocks because the
		                                           // default value of boolean will be false in JAVA.
		// Default values:
		// int, byte, short, long : 0
		// double/ float : 0.0
		// char : blank space
		// boolean : false
		// non-primitive (String, Object etc.) : null

		// array manipulation (playing with the data):

		int num[] = {23,56,78,90,43,63,120};
		System.out.println("Before Inserting value: "+Arrays.toString(num)); // [23,56,78,90,43,63,120]

		// inserting a value at index 0 which already has a value
		num[0] = 100;

		System.out.println("After Inserting value: "+Arrays.toString(num)); // [100,56,78,90,43,63,120]
		                                                                    // 23 at index 0
		                                                                    // will be replaced by 100. This is
		                                                                    // the default behavior in static
		                                                                    // arrays

		// When we try on insert a value on an index which already has a value
		// then new value will replace the old value which is a data loss in static array
		// To solve this problem, we will use Dynamic Arrays (ArrayList, List etc.)
		// Which will not replaced, instead the index of old values will be shifted
		// by +1 to the right side and 0th index will be emptied, if we want to insert
		// the data at the 0th index.

//		num[9] = 500; // AIOB on this line, because this is static array
		              // defined using literals having only 6 indices filled.
		              // To go till 9th index and fill the value, we have to first
		              // fill the 7th and 8th indices. Again this is a problem will static
		              // arrays and to solve this we will use Dynamic Arrays.

        System.out.println(num); // Compiler will not reach at this line.





	}

}
