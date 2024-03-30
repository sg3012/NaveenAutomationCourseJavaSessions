package javasessions.stringconcept;

public class StringTest {

	// This class shows why JAVA has given special treatment to Strings and
	// explains the following concepts:
	// What is String constant pool?
	// What are some important methods related to String ?
	// What is mutability and immutability ? Why Strings are immutable in JAVA?

	public static void main(String[] args) {

		String s = "testing"; // This type of String declaration is called String Literals
		String s1 = new String("testing"); // This type of String declaration is called String Object
		                                   // with new keyword.

		// What are the technical differences between String literals and String Objects created using new keyword?

		// String Objects are created and stored in the heap memory and referred by the String variable name
		// (here it's s1).

		// String literals are created and stored in a special space allocated in the Heap memory
		// that is called String Constant Pool (SCP). Up to JDK 1.7 SCP was not part of heap
		// But JDK 1.7 onwards SCP is part of Heap only.

		// String reference variables for literals are stored in STACK memory and point towards
		// the actual string value in the SCP which is a part of Heap.

		// String reference variables for new objects are also stored in STACK memory and point towards
		// the actual string value stored directly in the heap.

		// (INTERVIEW)So, How many objects got created after writing below lines?
		// String s = "testing";
		// String s1 = new String("testing");
		// Ans: 2 objects. One is the typical object created using new keyword and other
		// one is a bit different object than created using new keyword. So declaring
		// and initializing strings using either String literals or new keyword creates separate
		// String objects in the memory.

		// Now, if I write:
		String s2 = "testing";

		// How many String objects are now created after lines:
//		String s = "testing";
//		String s1 = new String("testing");
//		String s2 = "testing";  ?
		// Ans: 2 String objects only. Why ? Because SCP cannot have duplicate string values
		// So every time user tries to create a String literal object JAVA internally
		// checks that whether the same value exists or not in the SCP. If it is already
		// present JAVA will just create a new reference (s2 in this case) and start pointing
		// the reference to the same String value i.e, "testing".

		System.out.println(s==s2); // true. Because JAVA compares the memory addresses to which the
        // string reference variables are pointing to i.e, the actual string values, to
        // check for equality. Now, String literals'
        // VALUES are stored at some memory addresses
        // to which the respective reference variables point.

        // Meaning s will be pointing at the memory address in SCP
        // where "testing" (created using s) is stored.

        // s2 will be pointing at the same memory address in SCP
        // where "testing" (created using s2) is stored. Because SCP
		// can't hold duplicate values.
		// That is why the answer is true.

		System.out.println(s==s1); // false. Because JAVA compares the memory addresses to which the
		                           // string reference variables are pointing to i.e, the actual string values, to
		                           // check for equality. Now, String literals'
		                           // and new objects' values are stored at different memory addresses
		                           // to which the respective reference variables point

		                           // Meaning s will be pointing at the memory address in SCP
		                           // where "testing" (created using s) is stored.

		                           // s1 will be pointing at the memory address in Heap
        // where "testing" (created using new keyword) is stored. Both will be different
		// that is why the answer is false.

		System.out.println(s1==s2); // false (FOR THE SAME REASON ABOVE).

	    // For the same reasons provided above (for false and true)
		// we should ALWAYS compare Strings using equals method not == operator
		// which will always compare Strings using actual values
		// not the memory addresses.
		// We should ONLY use == operator when we want to compare STRING LITERALS

		System.out.println(s.equals(s1)); // true. Because equals compares based
		                                  // on actual string values
		System.out.println(s.equals(s2)); // true (because of the same reason in above line)

		String s3 = "java";
		s3 = null;
		System.out.println(s3); // null.
		// But what happens with the value "java"?
		// Does it remain in memory or removed by GC immediately
		// as s3 reference is pointing to null ?

		// Ans: The GC collector is invoked on it's own or it's
		// called explicitly. But what if we don't call it for sometime
		// and created on more string reference pointing to "java" like this:

		String s4 = "java";

		// Now, will it create a new value "java" in the SCP
		// or point s4 to the same "java" string ?
		// Ans: As SCP cannot hold duplicate values
		// s4 will point to the same "java" string
		// which was released by s3 when it started pointing to null.

		String s5 = "java"; // point to the same "java" string in SCP

		// So, until this point how many objects are there
		// in SCP and heap combined?
		// 2 in SCP (testing, java)
		// 1 in heap (testing)

		String s6 = new String("testing"); // new object will be created

		// So, every time we create a string object using new keyword
		// it will create a separate object in the heap even though it is
		// duplicate.
		// Hence, we can say that duplicate valued objects are allowed in the Heap
		// but not in SCP.

//		String t1 = "Selenium";
//		String t2 = "selenium";

		// After above 2 lines, how many literal objects will be created?
		// 2. Because t1 holds Selenium with an upper case "S"
		// and t2 holds Selenium with a lower case "s".

		String t3 = new String("Selenium"); // create one object inside the main heap.

		// After above line, how many total objects will be created in the main Heap?
		// 3 Heap (Selenium->s1, testing->s6, testing->t3)

		// Does the String object created using new keyword creates
		// an entry inside the SCP also ?
		// No, it will not. It only creates an entry in the main heap memory.

		// How to insert an String Object created using new keyword in the SCP?
		// Ans: Using intern() method.

		t3.intern(); // it will also create one object with the same value
		// as t3 in SCP.

		// So, how many objects will be created after the below lines?
		// String t3 = new String("Selenium");
		// t3.intern();
		// Ans: 2 Objects

		// So, who is pointing to the value "Selenium" created using
		// intern method (t3.intern()) in SCP if I comment the following lines:
		// String t1 = "Selenium";
		// String t2 = "selenium";?
		// Ans: No one at this point. So, how do we point it?

		// Just create another String literal pointing to "Selenium" like this:
		String t4 = "Selenium"; // now t4 will start pointing to "Selenium"
		// created using intern method in SCP.


		String pop = "Selenium";
		String t5 = new String("Selenium");
		t5.intern();
		String t6 = "Selenium";

		// How many total objects will be created using above lines of code only?
		// Ans: 2 Objects
		// SCP - 1 Object (pointed by pop, t6)
		// Heap - 1 object (pointed by t5).
		// No, String value will be created in the SCP named "Selenium"
		// again with the line t5.intern(); in this case
		// because there was already a String named "Selenium" in SCP.
		// pointed by pop. Also, no new String object will be created
		// using t6 in SCP as it was already there named "Selenium"


		String top = "naveen";
		String top1 = "naveen";
		String top3 = new String("naveen");
		top = null;
		top1 = null;
		String top4 = "naveen";

		// How many objects will be there in the memory after above lines of code?
		// After line String top = "naveen" 1 object will be created in SCP and
		// top will be pointing to "naveen"

		// After line String top1 = "naveen"; no new object will be created only top1 will be pointing to
		// same "naveen" object.

		// After line String top3 = new String("naveen"); 1 object will be created in Heap
		// and top3 will be pointing to "naveen"

		// After line top=null, top will be pointing to null and breaks the connection from "naveen"

		// After line top1=null, top1 will be pointing to null and breaks the connection from "naveen"

		// After line String top4 = "naveen", no new object will be created only top4 will be pointing to
		// same "naveen" object in SCP

		// So, in total 2 objects in the memory.

		System.out.println(top == top1); // true, because == operator compares
		// memory addresses at which certain object references are pointing to and
		// they (top and top1) are both pointing to null stored at the same
		// address

		System.out.println("-------");

		//System.out.println(top.equals(top1)); // NPE, because
		// equals operator takes Object class reference
		// variables' values as parameters and it compares
		// based on the actual values those references hold
		// which are currently null. So, equals() throws NPE

		System.out.println(top4 == top3); // false, because == operator compares
		// memory addresses at which certain object references are pointing to and
		// they (top4 and top3) are both pointing to naveen stored at different memory
		// addresses. top4's naveen stored in an address inside SCP and top3's naveen
		// stored in an address inside Heap

		System.out.println(top4.equals(top3)); // true,
		// because equals() method compares based on the
		// actual values the references have stored. In this case,
		// both top4 and top3 are holding same value "naveen".


		String z = "testing";
		z.concat("automation");
		System.out.println(z); //testing. because concat method doesn't change
		                       // the original string. It creates a new string
		                       // having concatenation of passed "string"
		                       // argument + the original string and returns the new string.
		                       // It cannot change the original string because Strings
		                       // are IMMUTABLE in JAVA.
		// So, if we have to return the concatenated string then we have to store
		// the returned string from concat method and store it in a new string like
		// below:

		String a = z.concat("automation");
		System.out.println(a); // testingautomation

		// but what if we write like this:

		z = z.concat("automation");
		System.out.println(z); // testingautomation. concat will create a new string
		                       // testingautomation in the constant pool and z starts pointing to it.
		                       // so, the value z is pointing to now is "testingautomation"
		                       // not testing. so who is pointing testing now?
		                       // no one. It is now hanging around there in the SCP
		                       // without any reference.
		// if I write like this:

		String z1 = "testing";  // As testing was already there in SCP left by z
		                        // z1 will start pointing to the same string.

		String r = "   cypress  ";
		System.out.println(r.trim()); //cypress (spaces trimmed on both left and right ends)
		System.out.println(r); //    cypress   (with spaces). Why?
		                       // Because again for the same reason that Strings are immutable in JAVA
		                       // so, trim method will not change the original string,
		                       // trim the spaces and return. It will create a new String in the SCP
		                       // with spaces trimmed and return it. That is why above print
		                       // statement is a bit confusing to the user that trim
		                       // is actually modifying the original string and return it.

		// So, every time we want to perform a manipulation operation
		// on a string using inbuilt methods of String class they will
		// create a new string entry in the SCP for it and if there
		// are lots of operations like that it will create lots of
		// unnecessary entries in SCP. That is why doing string manipulation operations using
		// inbuilt String class methods is CONSIDERED A BAD APPROACH. Because it creates
		// memory issue
		// So how should we do the String manipulation operations then?
		// There are two classes in JAVA for this purpose:
		// StringBuffer and StringBuilder. Both of these classes make the strings
		// mutable and change the original strings for any manipulation.

		// DIFFERENCES BETWEEN STRING BUFFER AND STRING BUILDER:
		// StringBuffer
		// It is thread safe - let's say if there are multiple users / thread who want
		// to change a string value stored in the memory at the same time. They
		// cannot do it because as soon as a user (user1) starts manipulating a string that string
		// is locked and another user (user2) cannot manipulate it until user1 releases the lock.
		// This is the meaning of thread safe. So, we cannot do parallel operations using stringbuffer.
		// We cannot do Read as write operations in parallel using this class.

		// It is synchronized - Meaning if one thread is doing something with string
		// then other thread can only change it once the original thread completes it's operation.
		// We can do Read as write operations in parallel using this class.

		// It is faster - As we can do parallel operations, it is much faster.

		// It came JAVA 1.0 onwards.


		// StringBuilder
		// It is not thread safe - multiple threads can update the same string value at the same time.
		// Meaning it supports parallel operations on Strings

		// It is synchronized - Meaning if one thread is doing something with string
		// then other thread can also change it in parallel.

		// It is slower - As we cannot do parallel operations, it is much slower.

		// It came JAVA 5.0 onwards.

		// USAGE OF STRINGBUILDER AND STRINGBUFFER:

		StringBuilder sb = new StringBuilder("naveen");
		sb.append("automation");
		System.out.println(sb); // naveenautomation. Because stringbuilders are mutable so append
		                        // will change the original string.


		// So, why this Special treatment is given to Strings in JAVA?
		// Ans:
		// For better memory management as developers are too habitual
		// of creating string variables using literals. So, if
		// they have created 100 variables with the same name using literals
		// and each variable is taking 20 bytes, then all variables will
		// take 2000 bytes just for a single name to be stored. So, to avoid this situation
		// SCP is not allowed to take duplicate String values

		// Because string is the most widely used data type in JAVA (or any
		// other programming language for that matter) while building
		// any app. So, JAVA has to some better memory optimization for them.

	}

}
