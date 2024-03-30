package javasessions.assignments.staticarrayassignments;

public class DeleteDuplicatesFromStaticArrayWithoutInBuiltMethod {

	// Given is an array and need to remove duplicate number {2,2,3,4,1,1,1,1}
	// Using only array.
	public static void main(String[] args) {
		int arr[] = { 2, 2, 3, 4, 1, 1, 1, 1 };

		// Method 1 : Without using in built function

		System.out.println("Before removing duplicates");
		for (int element : arr) {
			System.out.println(element);
		}
		System.out.println("After removing duplicates");
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[i] = -1;
				}
			}
		}

		for (int element : arr) {
			if (element != -1) {
				System.out.println(element);
			}
		}

//		System.out.println("------ Logic 2 ----");
//
//		// Method 2: With inbuilt-functions (Using HASHSET)
//
//		Set<Integer> setOfSampleArray = new HashSet<Integer>();
//
//		// Inserting each element of array in this set:
//
//		for (int e : arr) {
//			setOfSampleArray.add(e);
//		}
//
//		// Print the set. It will not allow duplicates to be added
//
//		for (int e : setOfSampleArray) {
//			System.out.println(e);
//		}
	}
}
