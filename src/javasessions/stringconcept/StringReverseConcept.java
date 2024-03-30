package javasessions.stringconcept;

import javasessions.exceptionhandling.FrameworkException;

public class StringReverseConcept {
	// IMPORTANT INTERVIEW QUESTION:

	// This class shows the logic of how to reverse a String in JAVA
	// For e.g.
	// Selenium will be displayed as muineleS

	public static String reverseString(String str) {

		//1. check if the passed String is null and if it is
		// then throw a custom exception
		if(str == null) {
			System.out.println("NULL VALUES ARE NOT ALLOWED");
			throw new FrameworkException("STRING CANNOT BE NULL"); // throwing custom exception
			// if String is null

			// NOTE: If you are designing a generic function and it takes a String parameter
			// then null checks MUST be written in the beginning of the function body
			// itself to avoid NPE
		}

		if(str.isBlank()) { // isBlank method of String class checks if any i/p string contains
			                // only blank spaces or not. If it contains only blank spaces then
			                // this function returns true.
			System.out.println("BLANK VALUES ARE NOT ALLOWED");
			throw new FrameworkException("STRING CANNOT BE BLANK");

			// IMPORTANT : if you implement this check in an interview question
			// then ASK the interviewer what they want to return as part of this check.
		}


		int len = str.length(); //8

		//2. Check if the user has passed empty string (of length 0)
		if(len == 0) {
			//return str;
			return "str length is Zero";
			//return "-1";

			// IMPORTANT: In the interview if you are asked
			// this problem and you implement this check
			// then you should ASK the interviewer that
			// WHAT THEY WANT TO BE RETURNED AS PART OF THIS CHECK
			// if the string length is 0.
		}

		//3. check if the String length is 1 and return it immediately if is.
		if(len == 1) {
			return str;
		}
		String rev = "";

		// We should make the control go inside the loop and reverse
		// the String if the passed is of length 1 only. It's of no use
		// as there is only one character, so nothing to reverse as such.
		// So, control will only come inside this loop if the String length is >1
		for(int i = len-1; i>=0; i--) {
			rev = rev + str.charAt(i); //muineleS
		}
		return rev;
	}

	public static void main(String[] args) {

		// (IMPORTANT) Whenever you are presenting this answer
		// in any interview follow the below:

		// 1. Try to write all possible test cases for how certain Strings will be displayed after reversed
		// and how can they be reversed like below ones:
		// Selenium --> muineleS
		// T --> T
        // te --> et
		// 123 --> 321 (Not a String but keep it as is)
		// null (JAVA inbuilt) --> nothing

		// 2. Don't write the core logic in the main method, create a generic method for it

		// (IMPORTANT INTERVIEW QUESTION)- Method 1: DON'T USE ANY INBUILT METHOD (see reverseString method above)

		// Test case1:
		System.out.println(reverseString("Selenium")); // muineleS

		// Test case2:
		System.out.println(reverseString("Selenium test")); // muineleS

		// Test case3:
		System.out.println(reverseString("123")); //321

		// Test case4:
		System.out.println(reverseString("T")); //T

		// Test case5 (passing null):

		//System.out.println(reverseString(null)); // O/P:

		// If we don't handle null in the reverse the O/P will be NPE

		// If null values are handled then O/P will be:
		// NULL VALUES ARE NOT ALLOWED
//		Exception in thread "main" javasessions.exceptionhandling.FrameworkException: STRING CANNOT BE NULL
//		at javasessions.stringconcept.StringReverseConcept.reverseString(StringReverseConcept.java:18)
//		at javasessions.stringconcept.StringReverseConcept.main(StringReverseConcept.java:70)

		// Test case6 (passing empty string (String of length 0)):
		System.out.println(reverseString("")); // O/P:
		// It depends on what user has returned as part of the empty string check
		// in the function.
		// In this case the o/p will be "str length is Zero".

		// Test case7 (passing spaces):
		System.out.println(reverseString(" ")); // O/P:
		// Again it depends on what user has returned as part of blank string check
		// while handling string having only spaces.
		// In this case it will be
//		BLANK VALUES ARE NOT ALLOWED
//		Exception in thread "main" javasessions.exceptionhandling.FrameworkException: STRING CANNOT BE BLANK
//			at javasessions.stringconcept.StringReverseConcept.reverseString(StringReverseConcept.java:29)
//			at javasessions.stringconcept.StringReverseConcept.main(StringReverseConcept.java:113)

	}

}
