package javasessions.stringconcept;

import java.util.Arrays;

public class StringMethods {

	// This class shows applications
	// of various inbuilt methods of the String class in JAVA
	public static void main(String[] args) {
			String s = "this is my java code and i am so happy";
			// Remember Strings are always stored in the form
			// of character array in the memory starting from index 0.
			
			// How to calculate length of String:
			System.out.println(s.length()); // 38
			
			// Find value at a specific index:
			System.out.println(s.charAt(0)); //t
			System.out.println(s.charAt(37)); //y
//			System.out.println(s.charAt(38)); // StringIndexOutOfBoundsException
			// because we are trying to access a value beyond the maximum
			// index i.e, 37. This is unchecked exception
			
//			System.out.println(s.charAt(-1)); // Again StringIndexOutOfBoundsException
			// because we are trying to access a value lower than minimum
			// index i.e, 0. This is unchecked exception
			
			System.out.println(s.charAt(4)); // single space as there is only
			// one space at 4th index.
			
			// Find index of a particular element in the String:
			System.out.println(s.indexOf("t")); // 0
			System.out.println(s.indexOf("i")); // 2 as indexOf method always gives 
            // the index of the first occurrence of
            // any character
			
			
			// How to use indexOf if there is a character which
			// is occurring more than once in a string
			
			// For e.g in the above String "i" is coming multiple times
			// and we want index of every occurrence of "i" or any
			// occurrence of "i" (of our choice)
			
			System.out.println(s.indexOf("i", 3)); // 5, 2nd occurrence of i
			
			// But above is not a good practice to give hardcoded value
			// in the fromindex parameter of indexOf(str, fromIndex)
			// because if the I/P string is changed (added or removed some characters)
			// then this from index will fail and we have to change it again
			// and again in the code. So, below will be the generalised formula
			// to find 2nd Occurrence:
			
			System.out.println(s.indexOf("i", s.indexOf("i")+1)); // 5
			
			
			// generalised formula to find 3rd occurrence of "i":
			System.out.println(s.indexOf("i",s.indexOf("i",s.indexOf("i")+1)+1));
			
			// Find index of a string/sub-string:
			
			System.out.println(s.indexOf("java")); // 11. In case of sub-string/string
			                                       // the index of method will ALWAYS give
			                                       // the index if the starting letter of the sub-string
			                                       // once it is found while counting character by character
			
			System.out.println(s.indexOf("cypress")); // -1, if any string or sub-string passed
			                               // is not found in the I/P String
			                               // indexOf will return -1.
			// (IMPORTANT) This technique is WIDELY used in automation framework
			// also to check of a particular character is present in an
			// I/P string or not like below:
			
			String msg = "welcome null";
			
			if(msg.indexOf("admin")>0) {
				System.out.println("admin is present");
			}
			
			else {
				System.out.println("FAIL");
			}
			
			// remove the left and right end spaces:
			
			String test = "    selenium     ";
			System.out.println(test.trim()); //selenium
			
			// But trim will only remove the spaces from left and right corner
			// What if we have to remove spaces in the middle? Do we have any
			// inbuilt method in JAVA?
			// Ans: No. But if still want to remove the spaces from the middle
			// then we can use replace() method in JAVA like below:
			
			// remove spaces from the middle:
			// replace():
			
		    String dob = "01-01-1990";
		    // But we want to be in this format: "01/01/1990"
		    // So, we will use replace method to display dob in expected format:
		    
		    dob=dob.replace("-", "/");
		    System.out.println(dob); //01/01/1990
		    
		    
		    // use replace to remove spaces (left, right and middle) from a string:
		    String test1 = "    selenium automation     ";
		    
		    // first remove from the left and right ends:
//		    test1 = test1.trim();
		    
		    // then remove from the middle:
		    test1 = test1.replace(" ", "");
		    
		    System.out.println(test1); // seleniumautomation
		    
		    // We can also get the same O/P as in above line
		    // if we don't use trim to remove
		    // end spaces and directly use replace method.    
		    
		    System.out.println("---------");
		    
		    
		    // (IMPORTANT INTERVIEW)
		    String dob1 = "01-01-1990";
		    dob1 = dob1.replace("-","/" );
		    System.out.println(dob1); // 01/01/1990
		    
		    String dob2 = "01/01/1990";
		    
		    System.out.println(dob1 == dob2); // false
		    // because any inbuilt method in JAVA that is used
		    // for string manipulation will create a new entry
		    // inside the HEAP memory and not in the SCP.
		    // So the lines dob1 = dob1.replace("-","/" );
		    // will result in a new entry in the heap
		    // and dob1 will point to it and the line
		    // dob2 = "01/01/1990" will create an entry in
		    // SCP and dob2 will start pointing to it.
		    // As both dob1 and dob2 point to different
		    // memory addresses == comparison will result in FALSE
		    
		    
		    String s1 = "JavaProgram";
		    String s2 = "Java";
		    String s3 = s2 + "Program";
		    String s4 = "Java" + "Program";
		    
		    System.out.println(s1 == s3); // false,
		    // because line String s3 = s2 + "Program"; will
		    // create a new entry in heap and
		    // line String s1 = "JavaProgram" will create an entry
		    // in SCP. So, both s1 and s3 point to different
		    // memory addresses
		    
		    System.out.println(s1==s4); // true, because "JavaProgram"
		    // is already there in SCP via s1 and s4 will also
		    // start pointing the same.
		    
		    
		    // So, remember that if we are using any internal method of 
		    // String class they will ALWAYS create an entry inside the heap memory.
		    // Similarly, if we are using any arithmetic operation
		    // with a String literal using another String VARIABLE
		    // then also the resultant String will be created inside the HEAP.
		    
		    String ts = "this is my java code";
		    
		    // convert String to Upper case:
		    System.out.println(ts.toUpperCase()); // THIS IS MY JAVA CODE
		    
		    // convert String to Lower case:
		    System.out.println(ts.toLowerCase()); // this is my java code
		    
		    // fetch a sub-string from a big string:
		    //substring:
		    
		    String mg = "your username is naveen"; // now, in this
		    // string <naveen> is the actual username which could be
		    // anything but the remaining string is always the same.
		    // So, string <naveen> is variable and the remaining
		    // string is constant.
		    // Now, I want to fetch only actual username i.e, naveen
		    // from the main string. I will do it
		    // using sub-string method like below:
		    
		    // fetch from an starting index:
		    System.out.println(mg.substring(17)); // O/P: naveen 
		    // give the index
		    // from which the actual sub-string (naveen) is starting.
		    // Here, naveen is starting from index 17 
		    
		    // fetch between a starting and an ending index (range):
		    System.out.println(mg.substring(0, 7)); // your us
		    // REMEMBER, substring method taking a range doesn't
		    // include the character present at the ending index
		    // and skips it in the O/P. So, 'e' is skipped
		    // from the index 7 in the O/P
		    
		    // Now if we want to print the character
		    // at 7th index also then do it like this:
		    System.out.println(mg.substring(0, 8)); // your use
		    
		    // Another More Generic formula to fetch the actual username
		    // from the main string:
		    System.out.println(mg.substring(mg.indexOf("is")+3, mg.length())); // naveen
		    
		    // check if some string is a part of main string or not
		    // contains:
		    
		    // Find if actual user name "naveen" is there or not
		    // in the below string:
		    String g = "your username is naveen";
		    System.out.println(g.contains("naveen")); // true
		    System.out.println(g.contains("Naveen"));// false, because
		    // it contains method is case sensitive.
		    
		    if(g.contains("naveen")) {
		    	System.out.println("TEST PASS"); //TEST PASS
		    }
		    else {
		    	System.out.println("TEST FAIL"); // doesn't execute
		    }
		    
		    
		    // checking the equality of Strings irrespective of the case:
		    // equalsIgnorecase:
		    
		    String p1 = "Hello Selenium";
		    String p2 = "Hello selenium";
		    
		    System.out.println(p1.equals(p2)); // false
		    // because equals is case sensitive and 
		    // checks whether each and every character
		    // in both the Strings are same or not along with
		    // there cases (whether all of them have same case or not).
		    // This is called HARD COMPARISON
		    
		    System.out.println(p1.equalsIgnoreCase(p2)); // true
		    // because equalsIgnoreCase is NOT case sensitive and 
		    // checks whether each and every character
		    // in both the Strings are same or not only but skips/ignores
		    // there cases (whether all of them have same case or not).
		    // This is called SOFT COMPARISON
		    
		    String p3 = "Hello selenium ";
		    System.out.println(p2.equalsIgnoreCase(p3)); // false
		    // because equalsIgnoreCase will ignore the cases
		    // of the characters but not the actual characters.
		    // If length of one string greater than the other
		    // then they are not equal. Here, there is one
		    // extra space at the end of p3 which is not there in p2.
		    
		    // break a string from a character into several parts
		    
		    // SPLIT(VERY IMPORTANT):
		    
		    // Separate ALL programming languages' names
		    // from the below string without underscore(_):
		    String lang = "JAVA_PYTHON_RUBY_JAVASCRIPT";
		    String lg[] = lang.split("_"); // As split method returns
		    // a static array of Strings, that is why we have stored the result
		    // in a Static String array.
		    
		    // Now we can print the array values in 2 ways:
		    
		    // Using index based notation:
		    System.out.println(lg[0]); // JAVA
		    
		    // Using toString() method of Arrays class
		    // which will convert whole array to String
		    // and print the whole array at once:
		    System.out.println(Arrays.toString(lg)); // [JAVA, PYTHON, RUBY, JAVASCRIPT]
		    
		    // (IMPORTANT)INTERVIEW QUESTIONS FOR SPLIT:
		    
		    //1.
		    // Given the following String:
		    String top = "xXtestingXxXSeleniumXXxXAutomationxXXCypress";
		    
		    // if We Split the String on xX like below and store it in an array of string:
		    String tp[] = top.split("xX");
		    
		    // What will the o/p of the below lines:
		    System.out.println(tp[0]); // Nothing (EMPTY STRING) in the O/P
		    // because split method stores the values
		    // before and after the splitting character in the String
		    // (here it is "xX") at the array indices. But in the above String
		    // there is nothing before the first occurrence of "xX".
		    // So nothing will be there at the 0th index of the array.
		    
		    System.out.println(tp[1]); // TestingX
		    System.out.println(tp[2]); // SeleniumXX
		    System.out.println(tp[3]); // Automation
		    System.out.println(tp[4]); // XCypress
		    // System.out.println(tp[5]); // AIOB, because after splitting the whole
		    // String on the basis of the given pattern there will be
		    // only 5 elements in the returned array. So, no index beyond
		    // 4 is created.
		    
		    //2. 
		    String top1 = "helloxXtestingXxXSeleniumXXxXAutomationxXXCypress";
		    String tp1[] = top1.split("xX");
		    
		    // What will the O/P of the following lines:
		    System.out.println(tp1[0]); // hello
		    
		    // we can use split function to split a String
		    // based on any pattern (pattern of characters).
		    
		    // So, We can split a String to extract the username
		    // from a Welcome message as shown in an example above like
		    // this:
		    
		    String  msg1= "your username is naveen";
//		    String messages[] = msg1.split("is");
//		    String userID = messages[1];
//		    System.out.println(userID.trim()); //naveen. Used trim here
		    // because after splitting the above String from is
		    // the String stored after "is" in the returned array
		    // contains a blank space in it like this " naveen".
		    
		    // Also, we can retrieve the index of the needed element
		    // in the returned array after splitting the String
		    // from "is" in the same line as split function along with
		    // the trim method and store it in userID String 
		    // variable directly like this:
		    
		    String userID = msg1.split("is")[1].trim();
		    System.out.println(userID); //naveen
		    
		    // We will also use the similar logic in the above example
		    // to fetch the user data in organized manner from
		    // an unorganized data
		    
		    System.out.println("----------");
		    
		    // suppose this is the data:
		    String empData = "Mitaj;Automation;Pune;India;323232;SDET;123.33";
		    
		    // Split above data on the basis of semicolon:
		    String emp[] = empData.split(";");
		    
		    //Iterate the array using for each loop and print each info
		    // for the employee in organized form:
		    for(String e : emp) {
		    	System.out.println(e);// Mitaj
		    						  // Automation
		    	                      // Pune
		    	                      // India
		    	                      // 323232
		    	                      // SDET
		    	                      // 123.33
		    }
		    
		    // Now, if the above data contains pipe(|) as the separator
		    // instead of semicolon like this:
		    String empData1 = "Sagar|Automation|Pune|India|323232|SDET|123.33";
		    
		    System.out.println("----------");
		    
		    // Split data on the basis of pipe and remaining steps
		    // will remain exactly the same:
		    
		    String emp1[] = empData1.split("|");
		    
		    for(String e : emp1) {
		    	System.out.print(e+" ");// S a g a r | A u t o m a t i o n | P u n e | 
		    	// I n d i a | 3 2 3 2 3 2 | S D E T | 1 2 3 . 3 3 
		    	
		    	// It splits the String character by character because
		    	// pipe (|) has a special meaning in JAVA's in built RegEx
		    	// engine which means logical OR meaning either of the Strings
		    	// on either side of OR (either this string or this string) . 
		    	// Now, in the split method we have passed only "|" in the argument
		    	// which means an EMPTY String/Nothing (String of length 0) 
		    	// on either side of the OR (meaning an empty String OR empty String ).
		    	// And there is an empty String (NOTHING) after each letter in a word
		    	// that is why split actually breaks the String by each word.
		    }
		    
		    // Now, to split the main string on the basis of pipe String 
	    	// NOT pipe Logical OR we have to escape the pipe symbol
	    	// as mentioned in below lines of code:
		    System.out.println("----------");
		    String empData2 = "Sagar|Automation|Pune|India|323232|SDET|123.33";
		    String emp2[] = empData2.split("\\|");
		    
		    // Why do we need two backslashes to escape the pipe character?
		    
		    // Ans: Because split method takes a String parameter for a regular expression
		    // and Regular expression for escaping pipe symbol is \|. But this
		    // RegEx need to be completely passed as "\|" as the parameter 
		    // So, that Split method understands that it needs to escape pipe, which cannot
		    // be done if we only pass single backslash followed by pipe. Because
		    // in that case it is not correctly formatted RegEx.
		    // To correctly pass the RegEx we need to escape single backslash also.
		    // Hence, the argument "\\|".  
		    
		    for(String e : emp2) {
		    	System.out.println(e);
		    }
		    
		    String d1 = "I love Java and I am so happy";
		    
		    // Enclose Java in the above string in "" (double quotes)
		    // and get the O/P as I am love "Java" and I am so happy
		    
		    // How can we do it as the main String is also enclosed in double
		    // quotes?
		    // Solution:
		    d1 = "I love \"Java\" and I am so happy"; // We need to escape
		    // double quotes as double quotes represent the boundaries
		    // of a String to compiler, if we use them in a regular fashion.
		    // So, we need to tell the compiler to treat them as part
		    // of the main String.
		    
		    System.out.println(d1); // I love "Java" and I am so happy
		    
		    // REAL-TIME USE cases of modifying Strings according to our need:
		    
		    // Create a dynamic xpaths at run-time in the automation framework 
		    // that change according to the names passed (see createXpath method below)
		    createXpath("Dinesh");
		    
	}
	
	public static void createXpath(String empName) {
		// This method creates dynamic xpaths
		// that change according to the employee names passed
		
		String xpath = "//a[text()='"+empName+"']"; // We will append 
		// the empName variable with the main xpath string
		// in such a way that empName parameter in the method
		// will be treated as the Xpath variable. And it
		// changes according the empName passed
		
		System.out.println(xpath);
	}

}
