package javasessions.assignments.collectionsassignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintSingleKeyWithMultipleValuesHashMap {

// This class will implement a HashMap
// Which can store multiple values for a single
// Key and Print those values	

//	Display all
//	Role value
//	with name
//	key Name|Role:
//		
//  Mayur| QA
//  Mayur | lead 
//	Siddharth|lead 
//	Siddharth|lead 
//	Siddharth|head 
//	
//	OutPut:
//	Mayur= {QA,lead}
//	Siddharth= {lead,head}

	public static void main(String[] args) {
		Map<String, List<String>> mapOfNameAndRole = new HashMap<String, List<String>>();

		// Create 1st List which will hold multiple values for Mayur:
		List<String> listOfMayur = new ArrayList<String>();
		listOfMayur.add("QA");
		listOfMayur.add("Lead");

		// Create 2nd List which will hold multiple values for Siddharth:
		List<String> listOfSiddharth = new ArrayList<String>();
		listOfSiddharth.add("Lead");
		listOfSiddharth.add("Lead");
		listOfSiddharth.add("Head");

		// Put the values in the map for corresponding keys as List:
		mapOfNameAndRole.put("Mayur", listOfMayur);
		mapOfNameAndRole.put("Siddharth", listOfSiddharth);

		// Create entryset for the map, get the keys
		// Iterate the Set using for each loop and print corresponding values:

		Set<Map.Entry<String, List<String>>> setOfMap = mapOfNameAndRole.entrySet();

		for (Entry<String, List<String>> key : setOfMap) {
			List<String> valueList = key.getValue();
			
			// Print and format O/P according to need:
			System.out.print(key.getKey()+"=");
			System.out.print("{");
			for(int i=0; i<valueList.size(); i++) {
				System.out.print(valueList.get(i));
				if(i!=valueList.size()-1) {
					System.out.print(",");
				}
			}
			System.out.print("}");
			System.out.println();
		}
	}

}
