package javasessions.fundamentals;

import java.util.Arrays;

public class ArrayTraversing {

	public static void main(String[] args) {
		int k[] = new int[4];
		k[0] = 10;
		k[1] = 20;
		k[2] = 30;
		k[3] = 40;

		System.out.println(k); // Prints some random value which tells the address
								// of this array in memory

		// Traversing and printing the values of any array using toString() method of
		// Arrays class:
		System.out.println("---------");
		System.out.println(Arrays.toString(k)); // [10, 20, 30, 40] (prints array in the form of a list)

		// But toString() method will always access all the values at once and convert
		// them to a single string
		// If we have to access an individual value and perform a check on it, this
		// method is not useful.
		// We cannot traverse array one by one using this method.
		// To access all the values at once we will use toString() method.
		// But to access individual values (iterate the array) and perform some
		// operation on it,
		// we will use the loops as shown below.

		// using for loop to access and print individual element of an array

		System.out.println("---------");
		// index based loop
		for (int i = 0; i < k.length; i++) { // 10 20 30 Hi
			System.out.println(k[i]);
			if (k[i] == 30) {
				System.out.println("Hi");
				break;
			}
		}

		// Using Enhanced for loop or Advanced for loop or for each loop

		System.out.println("---------");
		// non-index based loop
		for (int ele : k) { // 10 20 30 Bye
			System.out.println(ele);
			if (ele == 30) {
				System.out.println("Bye");
				break;
			}
		}

		//short array
		short s[] = new short[5];
		s[0] = 100;
		s[1] = 200;
		s[2] = 300;
		s[3] = 400;
		s[4] = 500;
		
		System.out.println("---------");
		for (short e : s) { // 100 200 300 400 500
			System.out.println(e);
		}

		// String array
		String browsers[] = new String[4];
		browsers[0] = "Chrome";
		browsers[1] = "Firefox";
		browsers[2] = "Safari";
		browsers[3] = "Edge";
		
		System.out.println("---------");		
		for(String e : browsers) { // Chrome Firefox Safari Launch Safari
			System.out.println(e);
			if(e.equals("Safari")) {
				System.out.println("Launch Safari");
				break;
			}
		}
		
		// Question : Fill the data in an Employee Array that can hold multiple types of data like:
		// Name - String 
		// Age - int
		// Salary - double
		// Gender - char
		// IsActive or IsContractor or IsPermanent : boolean
		
		// To solve the above types problem statements we will use Object Array like this:
		Object emp[] = new Object[5];
		emp[0] = "Harry";
		emp[1] = "30";
		emp[2] = 198674.879;
		emp[3] = 'M';
		emp[4] = true;
//		emp[5] = "Bangalore"; // AIOB
		
		System.out.println("---------");
		for(Object e : emp) {//Tom 23 19.45 M true
			System.out.println(e);
		}
		
		// print the indices also along with the values in Enhanced for loop with the help of
		// counter variable
		Object emp1[] = new Object[5];
		emp[0] = "Tom";
		emp[1] = "23";
		emp[2] = 19.45;
		emp[3] = 'M';
		emp[4] = true;
		
		System.out.println("---------");
		int count = 0;
		for(Object e : emp) { // 0=Tom 1=23 2=19.45 3=M 4=true
			System.out.println(count+"="+e);
			count++;
		}
		
		// Print the elements in reverse order with index based for loop
		System.out.println("---------");
		for(int j = emp.length-1; j>=0; j--) {  //true M 19.45 23 Tom    
			System.out.println(emp[j]);
		}
	}

}
