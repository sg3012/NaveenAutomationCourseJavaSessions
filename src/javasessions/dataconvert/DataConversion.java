package javasessions.dataconvert;

public class DataConversion {

	// This class shows how some data can be converted from one data type
	// to another

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x+20); // 10020. But is this correct O/P ?
		                          // From JAVA point of view it is correct.
		// but from requirement / Business point of view it is not
		// we want the O/P as 120 and assume that we are getting
		// the value 100 as String 100 not integer 100 in our automation
		// framework. For e.g : There are some inbuilt methods in selenium like
		// getText(), getInnerText() etc. which always values in String format
		// be they are numerical or actual strings.

		// Then how will we convert String to int ?
		// Answer: We will use wrapper classes for data conversion purposes where
		// we want to convert one type of data to the other type of data
		// in test automation.
		// Generally we will convert all PRIMITIVE types to Wrapper class (NON-PRIMITIVE) types

		// String to int (Using wrapper class):
		int i = Integer.parseInt(x);
		System.out.println(i); // 100
		System.out.println(i+20); // 120

		// But there is catch using parseInt(x)
		// method. That is if while converting
		// from string to number JAVA finds that
		// string is not in a pure number format
		// and contains some alphabets also like
		// "100A", "120B" etc. i.e., this is an alphanumeric
		// String, JAVA will throw numberFormatException.
		// So, keep in mind to pass string in pure numeric format only.
		// Moreover, if there is anything apart from integer in the String
		// it will always throw numberFormatException.

//		String test = "100A";
//		int k = Integer.parseInt(test) ; //  java.lang.NumberFormatException
//		System.out.println(k);

		// String to double (Using wrapper class):
		String s = "12.33";
		System.out.println(s+10); // 12.3310
		double d = Double.parseDouble(s);
		System.out.println(d); // 12.33
		System.out.println(d+10); // 22.33

		// String to Boolean (Using wrapper class):
		String headless = "true";
//		if(headless) { // if we try to apply if condition
//			           // directly to String formatted boolean
//			           // then we will get the following error:
//			           // Type mismatch: cannot convert from String to boolean.
//			           // So, we have to convert this String format boolean
//			           // to only boolean.
//		}

		boolean headlessflag = Boolean.parseBoolean(headless); // boolean true

		if(headlessflag) {

		}

		// We can also print the max and min value
		// for all the primitive types that are allowed to be
		// stored in them in JAVA i.e, THEIR RANGE using Wrapper class
		// For e.g. Byte's range is -128 to 127. So, we can print this using
		// Max_Value and Min_value parameters

	    System.out.println(Byte.MIN_VALUE); // -128
	    System.out.println(Byte.MAX_VALUE); // 127

	    // Similarly we can print the range for long data type:
	    System.out.println(Long.MIN_VALUE); // -9223372036854775808
	    System.out.println(Long.MAX_VALUE); // 9223372036854775807

	    // int to String:
	    int u = 100;
	    System.out.println(u+20); // 120. But this O/P is also not correct. We want to be pure String
	                              // and it should be 10020
	                              // How will we convert int to string?
	    // Is there a method like parseString() in String class ?
	    // No, we will convert it to String using valueOf() method of String class like this:

	   String u1 = String.valueOf(u); // "100"
	   System.out.println(u1+20); // 10020. Now the O/P is correct.

	}
}
