package javasessions.assignments.stringassignments;

public class PrintAllOccurrencesOfAnyCharacterInAString {
	
	// WAP to find all the occurrences of 
	// any given character in an I/P String in JAVA
	
	public static void main(String[] args) {
		
		// find all Occurrences Of "i" in the below String:
		
		String s = "this is my java code and i am so happy and i am so cool";
		
		for(int j=0; j<s.length(); j++) {
			if(s.charAt(j) == 'i') {
				System.out.println("Index: "+j);
			}
		}
	}

}
