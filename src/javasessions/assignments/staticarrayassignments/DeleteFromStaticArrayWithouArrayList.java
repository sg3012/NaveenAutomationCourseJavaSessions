package javasessions.assignments.staticarrayassignments;

import java.util.Arrays;

public class DeleteFromStaticArrayWithouArrayList {

	public static void main(String[] args) {
		// Delete element(s) from a static array without using any collection
		// like ArrayList etc.
		
		int a[] = {1,4,5,2,3,22,31,2};
		
		// Delete 22 from this array:
		
		int b[] = new int[a.length-1]; // size will be one less than the original array
		                               // as we have to delete one element from it.
		int j = 0; // to track the indices of array "b"
		
		for(int i = 0 ; i< a.length; i++) {
			if(a[i]!=22) {
				b[j] = a[i];
				j++;
			}
		}
		System.out.println("Array after deleting the elements:"+Arrays.toString(b));
	}

}
