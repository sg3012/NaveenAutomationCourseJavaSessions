package javasessions.assignments.collectionsassignments;

import java.util.Set;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class PrintSingleKeyWithMultipleValuesGoogleGuava {

// This class will implement a HashMap Using Google Guava API
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

		// Create a multimap class object:
		Multimap<String,String> multimap = ArrayListMultimap.create();

		// Put multiple values in the multimap for a single key:
		multimap.put("Mayur", "QA");
		multimap.put("Mayur", "Lead");
		multimap.put("Siddharth", "Lead");
		multimap.put("Siddharth", "Lead");
		multimap.put("Siddharth", "Head");

		// Create set of multi map:
		Set<String> setOfMultiMap = multimap.keySet();

		// Iterate the set, print the corresponding values and keys:

		for(String key : setOfMultiMap) {
			System.out.print(key+"=");
			System.out.print(multimap.get(key));
			System.out.println();
//			System.out.print("}");
		}

	}
}
