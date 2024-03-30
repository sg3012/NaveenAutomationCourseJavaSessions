package javasessions.assignments.collectionsassignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortListUsingCollectionsSortMethod {

	public static void main(String[] args) {

		// Create an integer array list
		// Sort that list in descending using sort() method of Collections class

		ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(11,6,9,12,4,15));
		Collections.sort(numberList);
		System.out.println(numberList); // [4, 6, 9, 11, 12, 15]
		Collections.reverse(numberList);
		System.out.println(numberList); // [15, 12, 11, 9, 6, 4]


	}

}
