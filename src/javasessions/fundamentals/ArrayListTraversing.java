package javasessions.fundamentals;

import java.util.ArrayList;

public class ArrayListTraversing {

	public static void main(String[] args) {

		// Integer type of Array List:
		ArrayList<Integer> marksList = new ArrayList<>(); //vc=10,pc=0
		marksList.add(100);
		marksList.add(200);
		marksList.add(300);
		marksList.add(400);
		marksList.add(500);

		// Print all the elements of an array list directly:
		System.out.println(marksList); // [100, 200, 300, 400, 500]

		System.out.println("--------");

		// Get the element at a particular index:
		System.out.println(marksList.get(2)); // 300

		System.out.println("---------");

		// Print all the values using loop:
		// 1. Index based for loop:
		for (Integer element : marksList) { // 100 200 300 Hii 400 500
			System.out.println(element);
			if (element == 300) {
				System.out.println("Hii");
			}
		}

		System.out.println("---------");

		for (Integer element : marksList) { // 100 200 300 Hii
			System.out.println(element);
			if (element == 300) {
				System.out.println("Hii");
				break;
			}
		}

		// Another way of comparing values in Array List:
		System.out.println("---------");

		for (Integer element : marksList) { // 100 200 300 Hii
			System.out.println(element);
			if (element.equals(300)) { // We should always use equals method to compare
												// values defined using wrapper classes as class
												// reference is a non-primitive type and equals() method
												// always compare memory addresses of Object references or more
												// precisely equals is used to compare non-primitive type of
												// values
				System.out.println("Hii");
				break;
			}
		}

		// 2. For Each Loop:

		System.out.println("---------");
		for (Integer e : marksList) {    //100 200 300 400 500
			System.out.println(e);
		}

		System.out.println("---------");
		for (int e : marksList) { // we can iterate the Integer type Array List using int also
								  // As Integer Wrapper class is ultimately converting
									// Integer values to int
			                        // O/P:100 200 300 400 500
			System.out.println(e);
		}

		// String type of Array List:
		System.out.println("-----------");
		ArrayList<String> monthsList = new ArrayList<>(); //vc=10,pc=0
		monthsList.add("JAN");
		monthsList.add("FEB");
		monthsList.add("MAR");

		for (String e : monthsList) { // JAN FEB MAR
			System.out.println(e);
		}

		// Object type of Array List:
		System.out.println("-----------");
		ArrayList<Object> empDataList = new ArrayList<>(); //vc=10,pc=0
		empDataList.add("Shubham");
		empDataList.add(30);
		empDataList.add(65.78);
		empDataList.add('m');
		empDataList.add(true);

		for(Object e : empDataList) {
			System.out.println(e); // O/P : Shubham 30 Age is Greater than 20 65.78 m true
			if(e.equals(30)) {
				System.out.println("Age is Greater than 20");
			}
		}
	}

}
