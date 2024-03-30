package javasessions.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {

		// Declaring an array list with custom Virtual Capacity (VC):

		ArrayList<String> ar = new ArrayList<>();// vc=10, pc=0 (By Default)

		ArrayList<String> ar1 = new ArrayList<>(20); // vc=20, pc=0 (Custom)

		// After all 20 virtual segments are filled the compiler will check
		// what was the number of initial virtual segments. In this case it is 20
		// So, it will give virtual segments according to the following formula:
		// VC = n/2 = 20/2 = 10
		// Where, n = number of segments which are already filledt

		// If initial virtual segments were 5 then new virtual segments
		// after filling all initial virtual segments will be:
		// VC = 5/2 = 2 (It will only take integer part of 2.5)

		// The Advantage of providing the VC at the time of array list declaration is
		// if we have to use only 5 segments then we could provide
		// only 5 segments instead of taking 10 default segments
		// when we not provide them. This helps in better memory optimization

		// Removing a value which may also be an index in the array list based
		// on the actual value itself:
		ArrayList<Integer> marksList = new ArrayList<>(); // vc=10, pc=0
		marksList.add(1); //0
		marksList.add(2); //1
		marksList.add(3); //2
		marksList.add(4); //3

		// First remove on the basis of index only:
		marksList.remove(1);
		System.out.println(marksList);  // it will remove value on index 1.
                                        // O/P : [1,3,4]

		// Remove on the basis of actual value when there are
		// some values which are equal to some
		// of the indices of the array:
		marksList.remove((Object)1); // We have to type cast the value we want to remove to Object
		                             // explicitly to remove it on the basis of value
		System.out.println(marksList); // [3,4]

		// ARRAY LIST LITERALS:
		// Using asList() method of Arrays class:
		ArrayList<String> browserList = new ArrayList<>(Arrays.asList("chrome","firefox","edge"));
		                                 // vc = 7, pc = 3 (as we have already entered the values in
		                                 // in the form of literals)

		System.out.println(browserList); // [chrome, firefox, edge]
		System.out.println(browserList.size()); // O/P = 3 , because 3 values are
		                                        // filled so, the physical capacity is 3
		System.out.println(browserList.get(0)); // O/P : chrome

		// We use the array list literals when we know the actual data
		// to be filled beforehand

		// Using for each loop to fetch the values from ArrayList literals:
		for(String e : browserList) {
			System.out.println(e);        // chrome firefox edge
		}

		ArrayList<String> empList = new ArrayList<>(Arrays.asList("Tom", "Peter", "Ravi", "Shubham","Sagar"));
		System.out.println(empList); // [Tom, Peter, Ravi, Shubham, Sagar]

		// Print list in reverse order:
		// Reverse Using Collections class
//		Collections.reverse(empList);
//		System.out.println(empList); // [Sagar, Shubham, Ravi, Peter, Tom]
//
//		// Print the list using for each loop after reverse
//		for(String e : empList) {
//			System.out.println(e); // Sagar Shubham Ravi Peter Tom
//		}

		System.out.println("---------");

		// Reverse using index based for loop:
		for(int i=empList.size()-1; i>=0; i--) {
			System.out.println(empList.get(i)); 	// Sagar Shubham Ravi Peter Tom
		}

		// Convert a static array to array list

		int num[] = {10,20,30,40,50,60};
//		List<int[]> numberList = Arrays.asList(num); // Error, we couldn't downcast
		                                                  // a List into Array List
		                                                  // as every Array List is a List but
		                                                  // every List not an arrayList.
		List<int[]> numberList = Arrays.asList(num);
		System.out.println(numberList.size()); // O/P : 1 (size is 1 because asList() is returning
		                                                   // a List of integer Arrays not
		                                                   // a list of int elements.So, the returned
		                                                   // list contains the whole array passed
		                                                   // in the asList() method at index 1. So, only
		                                                   // one index is created.
		                                                   // asList() method is behaving like this
		                                                   // because it takes whatever is passed as
		                                                   // a non-primitive value or an object. So, in this case
		                         // we have only one non-primitive object i.e, the int array as an entity.


		String browser[] = {"chrome","firefox","edge"};
		List<String> browserNamesList = Arrays.asList(browser);
		System.out.println(browserNamesList.size()); // O/P: 3 (because, in this case the passed
		                                             // Object in asList() is itself containing
		                                             // 3 non-primitive String Objects as String is a class
		                                             // in JAVA which is non-primitive)


		// Now, In case of int array if we have to get the converted List having same size
		// as the passed int array (6 in this case) we have to do some modifications
		// like this:

		Integer numbers[] = {10,20,30,40,50,60};
		List<Integer> numbersList = Arrays.asList(numbers);
		System.out.println(numbersList.size()); // O/P : 6 (because, in this case the passed
		// Object in asList() is itself containing
        // 6 non-primitive Integer wrapper class Objects)

		// NOTE: SO, KEEP IN MIND that whenever you want to convert an
		// Array to ArrayList always declare the array with Integer Wrapper
		// class type

		// DIFFERENT OTHER WAYS OF DECLARING AN ARRAY LIST:

		// 1.
		ArrayList<String> list = new ArrayList<>() {
			{
				add("JAVA");
				add("Python");
				add("Ruby");
			}
		};

		System.out.println(list.size()); // 3
		list.add("C#");
		System.out.println(list.size()); //4

		//2. Using of() method:
		List<Integer> listOfNumbers = List.of(1,2,3,4,5);
		System.out.println(listOfNumbers); // [1, 2, 3, 4, 5]
		System.out.println(listOfNumbers.size()); // 5
		//listOfNumbers.add(6);
		//System.out.println(listOfNumbers.size()); // UnsupportedOperation Exception
		                                          // at the previous line because
		                                          // whenever we create a List using
		                                          // of() method, it's size is always fixed.
		                                          // and we can't increase/decrease it and this type
		                                          // of List is called Immutable or Constant List.
//		listOfNumbers.remove(1);
//		System.out.println(listOfNumbers.size()); // UnsupportedOperation Exception again
		                                          // as the list size is fixed.

		//More Operations on the array list:

		// Triming the size of Virtual capacity
		ArrayList<String> monthsList = new ArrayList<>();// vc=10, pc=0
		monthsList.add("JAN");
		monthsList.add("FEB");
		monthsList.add("MAR"); // VC=7, PC=3

		monthsList.trimToSize(); // trimToSize() method will adjust the size of Virtual segments
		                         // and in turn Virtual Capacity to whatever elements
		                         // are actually present in the List i.e., Physical capacity.
		                         // In this example, physical capacity is 3 right now, so the
		                         // VC will be reduced to 3.
		// Now, if we want to add more values in the list after trim statement, then more
		// Virtual Segments will alloted by the load factor formula like this:
		// VC=(existing physical capacity)/2 = 3/2 = 1.5 = 1
		// So, 1 new virtual segment will be alloted.

		// Adding element before the 0th element and after (n-1)th element:
		ArrayList<String> monthsList1 = new ArrayList<>();// vc=10, pc=0
		monthsList1.add("JAN");
		monthsList1.add("FEB");
		monthsList1.add("MAR");
		monthsList1.add("APR");
		monthsList1.add("MAY");
		monthsList1.add("JUNE"); //VC=4, PC=6

		monthsList1.add(0, "MONTH"); // shift the existing list elements to the right side increasing the
		                             // size of each index by 1 and adding new one i.e, Month on the
		                             // 0th index
		monthsList1.add("JULY"); // No, need to pass the index as add() method will add a new element
		                         // just after the last element in the list by default.
		System.out.println(monthsList1); // [Month, JAN, FEB, MAR, APR, MAY, JUNE, JULY]

		// Swap 2 elements' indices in a list:
		Collections.swap(monthsList1, 0, 1);
		System.out.println(monthsList1); // [JAN, MONTH, FEB, MAR, APR, MAY, JUNE, JULY]

		// Create one empty list which could store any type of value:
		List<Object> listOfObjects = Collections.emptyList();
		System.out.println(listOfObjects.size()); // 0

		// Sort list alphabetically:
		Collections.sort(monthsList1); // By Default it will always sort in ascending order
		System.out.println(monthsList1); // [APR, FEB, JAN, JULY, JUNE, MAR, MAY, MONTH]

		// Add a value at the middle index in the list:
		ArrayList<Integer> nl = new ArrayList<>(); // vc=10, pc=0
		nl.add(1); //0
		nl.add(2); //1
		nl.add(3); //2
		nl.add(4); //3
		nl.add(5); //4
		nl.add(6); //5
		nl.add(7); //6

		int mid = nl.size()/2; // 7/2 = 3.5 ~ 3
		nl.add(mid, 30);
		System.out.println(nl); // [1, 2, 3, 30, 4, 5, 6, 7]

		// Replace value at a particular index:
		nl.set(6, 60);
		System.out.println(nl); // [1, 2, 3, 30, 4, 5, 60, 7]

		// NOTE: Traversing an array list or array is easy and fast as
		// the elements are stored in the order which they were entered
		// at continuous locations inside the memory. So, if there is an Integer
		// based Array List or Array and first elements is stored at
		// memory location 1001 next will be at 1032, next will be at 1064
		// (as integer will take 32 bits) and so on.
		// So, these are also called Fast Processing collections.







	}

}
