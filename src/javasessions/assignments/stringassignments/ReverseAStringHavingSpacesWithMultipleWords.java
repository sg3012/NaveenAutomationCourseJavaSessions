package javasessions.assignments.stringassignments;

import javasessions.exceptionhandling.FrameworkException;

public class ReverseAStringHavingSpacesWithMultipleWords {
	
	// This class shows the logic of reversing a String
	// containing multiple words separated by blank spaces
	// for e.g. The String "testing selenium cypress"
	// will be reversed as "sserpyc muineles gnitset"
	
	public static String reverseString(String str) {
		//1. null check
		if(str == null) {
			System.out.println("NULL VALUES ARE NOT ALLOWED");
			throw new FrameworkException("STRING CANNOT BE NULL");
		}
		
		//2. blank check
//		if(str.isBlank()) {
//			System.out.println("BLANK VALUES ARE NOT ALLOWED");
//			throw new FrameworkException("STRING CANNOT BE BLANK");
//		}
		
	
		int len = str.length();
		
		//3. len == 0 check
		if(len == 0) {
			return "str length is 0";
		}
		
		//4. len == 1 check
		if(len == 1) {
			return str;
		}
		
		//5. Normal String after failing above checks
		String rev = "";
		for(int i = len-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		
		System.out.println(reverseString("testing selenium cypress")); // sserpyc muineles gnitset
		
//		System.out.println(reverseString(" ")); // O/P
//		BLANK VALUES ARE NOT ALLOWED
//		Exception in thread "main" javasessions.exceptionhandling.FrameworkException: STRING CANNOT BE BLANK
//			at javasessions.assignments.stringassignments.ReverseAStringHavingSpacesWithMultipleWords.reverseString(ReverseAStringHavingSpacesWithMultipleWords.java:22)
//			at javasessions.assignments.stringassignments.
//		ReverseAStringHavingSpacesWithMultipleWords.
//		main(ReverseAStringHavingSpacesWithMultipleWords.java:49)
		
		
//		System.out.println(reverseString("")); //str length is 0
//		System.out.println(reverseString("t")); //t
//		System.out.println(reverseString(null)); // NPE
	}

}
