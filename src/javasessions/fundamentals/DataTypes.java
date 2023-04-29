package javasessions.fundamentals;

public class DataTypes {
	
	public static void main(String[] args) {
		// JAVA is a strictly typed language. Meaning. we have to define
		// the data types of variables at the time of declaration only.

		// There are 2 types of data types in JAVA:
		// 1. Primitive data types: They will just take some space in the memory
		// No need to create any object to use these data types
		// Numeric:
		// Integral:
		// a. Integer - byte, short, int, long
		// b. Floating-point - float, double
		// Character: char
		// 2. Non-primitive data types: String, Class, Interface, Arrays, Abstract class

		// byte - Use to store very small values that come in it's range. For e.g. Age,
		// no of months in a year, no of days in a week etc
		// Size: 1 byte = 8 bits
		// Range: -128 to 127 = -2^7 to 2^7-1
		byte b = 10;
		byte b1 = 20;
		b = 40;
		System.out.println(b); // O/P = 40
		byte c = -10;
		byte v = 0;
		// byte n=130; error we couldn't write this as byte's range is
		// -128 to 127. So, the max positive value is 127.
		System.out.println(b + b1); // O/P = 30

		// short
		// Size: 2 bytes = 2x8 = 16 bits
		// Range: -32768 to 32767 = -2^15 to 2^15-1
		short s = 1000;
		short s1 = 25000;

		// int
		// Size: 4 bytes = 4 x 8 = 32 bits
		// Range: -2147483648 to 2147483647 = -2^31 to 2^31-1
		int i = 10000;
		int j = 1;
		int l = 0;
		int k = -989;

		// long
		// Size: 8 bytes = 8 x 8 = 64 bits
		// Range: -2^63 to 2^63-1
		long l1 = 123456789; // This number is still falling in the range of int so long will definitely
								// accommodate it.
//		long l2 = 12345678901; // This number goes out of range for int but fall in range for long
		// but still giving error because JAVA considers this as int.
		long l2 = 12345678901L; // To remove the error we have to declare the actual long variables
								// by appending them with letter "L" as shown in above line.
		System.out.println(l2); // O/P = 12345678901

		// The numbers which are too long for any
		// integer data type to be stored should be stored inside the String
		// For e.g.: accNumber / SSN / Aadhar Card Number/ Phone number/ Credit Card
		// Number
		// 4556677333345
		// 99898776540
		// long ssn = 10101010101L

		// float
		// Size: 4 bytes = 4x 8 = 32 bits
		// Range: after decimal (.) it could take up to 6-7 digits
		float f1 = 10.99f; // We can declare the float number like this or like in the below line
		float f2 = (float) 12.56;
		System.out.println(f1); // O/P: 10.99
		System.out.println(f2); // O/P: 12.56

		float p = 100;
		System.out.println(p); // O/P: 100.0

		// double
		// Size: 8 bytes = 64 bits
		// Range: after decimal (.) it could take up to 15 digits
		double d = 12.4567892;
		System.out.println(d);
		double buildVersion = 1.0;

		// char
		// Size: 2 bytes = 16 bits
		// Unicode characters : ASCII + Special Symbols (Chinese, Japanese, Symbols)
		// Range:
		// a-z: 97 to 122
		// A-Z: 65-90
		// 0-9: 48 to 57
		char c1 = 'a';
		char c11 = 'b';
		char c2 = 'A';
		char c3 = '1';
		char c33 = '2';
		char c4 = '$'; // can store special symbols also
		char gender = 'M';
		char execution = 'Y';

		System.out.println(c1); // O/P: a
		System.out.println(c11); // O/P: b
		System.out.println(c1 + c11); // will add the ASCII values of a and b. O/P: 97+98 = 195
		System.out.println(c11 - c1); // O/P: 98-97 = 1
		System.out.println(c2); // O/P: A

		System.out.println(c3 + c33);// O/P: 49+50 = 99
		System.out.println((int) c1); // 97
		System.out.println((int) '@'); // ASCII value of @
		System.out.println((byte) '$'); // ASCII value of $ i.e, 36
		System.out.println((byte) ' '); // ASCII value of space i.e, 32

		int go = 100;
		char pop = 'a';
		System.out.println(go + pop); // O/P - 197
		System.out.println(c1 + "" + c11); // O/P - ab (Values of the characters will be concatenated because there is
											// a String
											// in between)
		System.out.println('a' + '1'); // O/P - 97+49 = 146
		System.out.println(12.33 + 'a'); // O/P = 12.33+97 = 109.33

		// boolean:
		// Size - ~(Approx.) 1 Bit
		// Range = true/false
		boolean flag = true;
		boolean flag1 = false;

		int totalBillAmount = 9000;
		int total_fee_amout = 1000; // We don't follow this type of format in the nomenclature for
									// Variables in JAVA. We follow the format as mentioned in the above line (Camel
									// Casing).
									// The underscore format is followed in other programming languages like c, c++;
		int kk = 100;
		int pp = 100;
		System.out.println(kk);
		int result = kk + pp;
		System.out.println(result); // 200

		double dd = 9.45678901234567864008d; // We could also declare a double variable like this.
		System.out.println(dd); //  9.456789012345679 (86 after 7 would be rounded of to 9).
		                                  // So, double will only store max 15 digits after decimal
		float ff = 9.45678901234567864008f;
		System.out.println(ff); // 9.456789 (float will only store max 6 digits after decimal)
		
		

	}

}
