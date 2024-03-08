package javasessions.fundamentals;

import java.util.ArrayList;

public class ArrayListRemoveConcept {

	public static void main(String[] args) {
		// HOW TO REMOVE ELEMENTS FROM ARRAY LIST
		// ArrayList is also called Order based collection
		// as it stores and displays the values in the order they were filled

		ArrayList<String> empList = new ArrayList<String>(); // Vc= 10, Pc= 0;
		
//		System.out.println(empList.get(0)); // IOB, as we haven't filled any value in the list
		                                    // so the PC is 0
		System.out.println(empList); // Blank List like this: []
		empList.add("Shubham"); // 0
		empList.add("Ashish"); // 1
		empList.add("Sham"); // 2
		empList.add("Rado"); // 3
		empList.add("Rajat"); // 4 // Vc = 5, Pc = 5

		System.out.println(empList); // [Shubham, Ashish, Sham, Rado, Rajat]

		empList.add("Bharat"); // 5 It will go to the fifth index, Vc = 4, Pc = 6
		empList.add("Testing"); // 6

		System.out.println(empList); // [Shubham, Ashish, Sham, Rado, Rajat, Bharat]

		// But if we want to add an element at a certain index (not the consecutive one)
		// then we will use another version of add method, add(int index, String
		// element)

		// empList.add(1, "Sonu"); // Writing the value at index 1 again.
		// It will enter the new value at index 1 by creating a new
		// blank index instead of overwriting the original value. Also, it
		// will increase the list size by 1 and shift all the elements starting
		// from index 1 to right. This is the advantage with ArrayList
		// as the data is preserved and not lost

		// System.out.println(empList); // [Shubham, Sonu, Ashish, Sham, Rado, Rajat,
		// Bharat]

		// Remove the values by specifying index:

//		empList.remove(3);
//		System.out.println(empList); // [Shubham, Sonu, Ashish, Rado, Rajat, Bharat]
		// So, after deletion it will remove the value at the index
		// and automatically adjust the size of the list.

//		empList.add(0, "Ravi");
//		System.out.println(empList); // [Ravi, Shubham, Ashish, Sham, Rado, Rajat, Bharat]
//		
//		empList.add("Testing"); // If we add the value without specifying the index
//		                        // it will always be added at HighestIndex + 1.
//		                        // Meaning, the size of the list will be increased by one
//		                        // and the value will be added at the last index.
//		System.out.println(empList); // [Ravi, Shubham, Ashish, Sham, Rado, Rajat, Bharat, Testing]

//		empList.add(8, "Cypress"); 
//		System.out.println(empList); // Index out Of Bounds Exception (IOB) as the indices
//		                             // 6 and 7 are still empty and we cannot skip
//		                             // empty indices in the ArrayList. It always
//		                             // allocates continuous memory addresses. 
//		                             // That is why it is an order based collection.

		// Remove the values by specifying actual value:

		empList.remove("Rado");
		System.out.println(empList); // [Shubham, Ashish, Sham, Rajat, Bharat]

		// Adding duplicate values:
		empList.add("Bharat"); // 5
		System.out.println(empList); // [Shubham, Ashish, Sham, Rajat, Bharat, Testing, Bharat]

		// Remove a value that doesn't exist:
		empList.remove("Karan"); // [Shubham, Ashish, Sham, Rajat, Bharat, Testing, Bharat]
									// It doesn't do anything just prints the same O/P again.

		// Remove a duplicate value by passing value:
//		empList.remove("Bharat"); // It will remove the value which is occurring at the
//									// lowest index i.e, which occurs first while traversing left to right
//		System.out.println(empList); // [Shubham, Ashish, Sham, Rajat, Testing, Bharat]

		// Remove a duplicate value by passing index:
		empList.remove(6); // Now, it will remove the value at the specified index
		System.out.println(empList); // [Shubham, Ashish, Sham, Rajat, Bharat, Testing]
		
		// Adding null values in an array list:
		empList.add(null); // adding null values are allowed
		System.out.println(empList); // [Shubham, Ashish, Sham, Rajat, Bharat, Testing, null]
		
		// Adding multiple null values:
		empList.add(null); 
		System.out.println(empList); // [Shubham, Ashish, Sham, Rajat, Bharat, Testing, null,null]
		
		
		// Removing a value which may also be an index in the arraylist:
		ArrayList<Object> empDataList = new ArrayList<Object>(); //vc=10,pc=0
		empDataList.add("Shubham");
		empDataList.add(2);
		empDataList.add(65.78);
		empDataList.add('m');
		empDataList.add(true);
		
		empDataList.remove(2); // O/P [Shubham, 2, m, true] it will remove value on index 2
		                       // because when there is a value in an arrayList
		                       // which is equal to an index in the list
		                       // JAVA will always give preference to the index based
		                       // remove function i.e, remove(int index) by default. 
		                       // So, in this example it will remove 65.78 instead of value 2. 

	}

}
