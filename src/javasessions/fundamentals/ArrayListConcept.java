package javasessions.fundamentals;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		// ArrayList is a class in JAVA
		// It is a dynamic array
		
		// Declaring ArrayList
		
		
		ArrayList ar = new ArrayList(); // This is called a Raw type of Array List, Meaning
		                                // we could add any type of data in the Array list.
		
		                                // Array list is an index based array
		
		                                // When we declare an array list JAVA will create some
		                                // segments in the memory called VIRTUAL CAPACITY. Initially,
		                                // When we declare an array list the Virtual capacity (VC) is 10
		
		                                // This Virtual Capacity in the form of Virtual Segments
		                                // and will not take any bits and bytes in the memory, but JAVA
		                                // will maintain these Segments internally.
		
		                                // There is one more concept called Physical capacity 
		                                // which the actual number of segments filled with elements
		                                // Initially, when we declare an array List 
		                                // the Physical Capacity (PC) is 0
		System.out.println(ar.size()); // 0 as the PC is 0 
		
		// Adding elements in the list
		
		ar.add(100); //0 Index
		ar.add(200); //1 Index
		ar.add(300); //2 Index
		
		// Get the size of array list:
		System.out.println(ar.size()); // pc=3, vc=7
		
		ar.add(400); // 3 Index
		ar.add(500); // 4 Index
		
		System.out.println(ar.size()); // 5
		
		ar.add(600); // 5 Index
		ar.add(700); // 6 Index
		
		System.out.println(ar.size()); //7
		
		ar.add("Shubham"); // 7 Index
		ar.add(12.33); // 8 Index
		ar.add(1000);
		
		System.out.println(ar.size()); //pc=10, vc=0;
		
		// Get the element at a specific index:
		System.out.println(ar.get(0)); // 100
		System.out.println(ar.get(8)); // 12.33
//		System.out.println(ar.get(-1)); // Index Out Of Bounds Exception, not 
//		                                // Array index out of bounds exception as this is an array list.
//		System.out.println(ar.get(9)); // Index Out Of Bounds Exception
		
		ar.add(1100);
		
		// DEFINE GENERICS IN THE ARRAYLIST
		// Generics Meaning we define explicitly that what type of data
		// the Array List is going to store
		
		// Make it a habit to always decide what type of 
		// data you are going to store in the Array List
		// and always define Array List with Generics
		
		// ArrayList with only Integer data:
		ArrayList<Integer> marksList = new ArrayList<Integer>(); // We cannot write int or float or any primitive
		                                                         // data type in the anchor brackets as
		                                                         // Array List itself is non-primitive and will
		                                                         // take only non-primitive type of generics like
		                                                         // Integer, Float etc.
		                                                         // vc=10,pc=0;
		marksList.add(100);
//		marksList.add(12.33); // Error, Cannot hold Float/Double value in the Integer type of list
		
		// Array List with only Double data:
		ArrayList<Double> bmiList = new ArrayList<Double>(); // vc=10, pc=0
		bmiList.add(12.33);
//		bmiList.add(100); // Again Error, Cannot hold Float/Double value in the Integer type of list
		bmiList.add(100.0);
		
		// Array List with all types of Data:
		ArrayList<Object> empDataList = new ArrayList<Object>(); //vc=10,pc=0
		empDataList.add("Shubham");
		empDataList.add(30);
		empDataList.add(65.78);
		empDataList.add('m');
		empDataList.add(true);
		// We could also define the Generics like this:
//		ArrayList<Object> empDataList2 = new ArrayList<>(); //vc=10,pc=0 (Providing Generics only in LHS not RHS)
		
        // Array list with only String type of Data:
		ArrayList<String> monthsList = new ArrayList<String>(); //vc=10,pc=0
		monthsList.add("JAN");
		monthsList.add("FEB");
//		monthsList.add(1000); // Again Error, Cannot hold Integer value in the String type of list
		monthsList.add("1000"); // This is allowed as 1000 is inside double quotes
		
		
		

	}

}
