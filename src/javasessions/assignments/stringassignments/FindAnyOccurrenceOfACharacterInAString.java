package javasessions.assignments.stringassignments;

public class FindAnyOccurrenceOfACharacterInAString {

	// WAP to find any occurrence of any character
	// in an I/P String in JAVA

	public static void main(String[] args) {

		// find 4th Occurrence Of "i" in the below String:

		String s = "this is my java code and i am so happy and i am so cool";

		System.out.println(s.indexOf("i",s.indexOf("i",
							s.indexOf("i",
								s.indexOf("i")+1)+1)+1));



	}

}
