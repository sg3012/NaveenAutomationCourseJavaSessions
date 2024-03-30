package javasessions.fundamentals;

public class IncrementAndDecrementOperators {
	public static void main(String[] args) {

		// Following are the incremental and decremental operators:
		// ++ = Incremental
		// -- = Decremental

		// 1.Post increment : first assign then increase by 1
		int a =1;
		int b = a++;
		System.out.println("a: "+a); // 2 (as a result of a++, value of a will be increased by 1 and stored in a again)
		System.out.println("b: "+b); // 1 (b has the old value of 'a' because post increment will increase the value
		                                 // of any variable when it is used in a line apart from the one in which it is increased. so,
		                                 // a's value was written to be increased in line int b = a++ but it will actually be increased
		                                  // when it's used in any statement after it i.e, the print statement to print the value of a).

		int c=10;
		int d = c++;
		System.out.println("c: "+c); //11
		System.out.println("d: "+d); //10

		int f = -99;
		int g = f++;
		System.out.println(f); // -98
		System.out.println(g); // -99

		// 2.Pre-increment: first increase then assign

		int x=1;
		int y = ++x;

		System.out.println("x: "+x); // 2 (as a result of x++, value of x will be increased by 1 and stored in x again)
		System.out.println("y: "+y); // 2 (y has the incremented value of 'x' because pre increment will increase the value
        // of any variable immediately in the line in which it is written to be increased. so,
        // x's value was written to be increased in line int y = x++ and it will actually be increased
         // in the same line. So, x and y both have increased values now.

		int t1 = -999;
		int t2 = ++t1;
		System.out.println(t1); // -998
		System.out.println(t2); // -998

		//Applying increment on double values
		double d1 = 1.1;
		double d2 = d1++;

		System.out.println(d1); // 2.1
		System.out.println(d2); //1.1

		// Applying increment on characters

		char c1 = 'a';
		char c2 = ++c1;

		System.out.println(c1); //b  (print the character value and not ASCII because we neither casted c1 to int nor stored it's
		                                             // value inside an int variable )
		System.out.println(c2); //b  (print the character value and not ASCII because we neither casted c2 to int nor stored it's
                                                  // value inside an int variable )

		//3. Post-decrement: -- (first assign then decrease)
		int p=2;
		int q = p--;
		System.out.println("p: "+p); //1
		System.out.println("q: "+q); //2

		int u1 = 10;
		int u2 = u1--;
		System.out.println(u1); //9
		System.out.println(u2); //10

		int p1 = -99;
		int p2 = p1--;
		System.out.println("p1: "+p1); // -100
		System.out.println("p2: "+p2); // -99

		// Pre-Decrement: -- (first decrease then assign)
		int h1 = 2;
		int h2 = --h1;
		System.out.println("h1: "+h1); // 1
		System.out.println("h2: "+h2); // 1

		int v1 = -96;
		int v2 = --v1;
		System.out.println("v1: "+v1); // -97
		System.out.println("v2: "+v2); // -97

		//Miscellaneous:
		int test = 5;
		System.out.println("value of test: "+test++); //5 (Because, in this line the print statement itself consumes the original
		                                                                // value of test i.e, 5 as we are not using a second variable to consume it's value)
		System.out.println("value of test: "+test); //6

		int pop = 8;
		System.out.println(++pop); // 9
		System.out.println(pop); //9

		char ch = '0';
		System.out.println(++ch); //1

		char ch1 = '$';
		System.out.println(++ch1); // % (ASCII value of $ + 1 = 36 +1 = 37 ->%)

//		System.out.println('c'++); // error, wrong syntax if using the operator on character values.
		                                      // If you want to increase the value of character using the post/pre increment
		                                      // Operator then first store it in some variable and then print it.
		                                      // Same rule applies for other data types (int, float etc) as well.
		char ch2 = 'a';
		System.out.println("ch2: "+ch2++); //ASCII - 97 -> a
		System.out.println("ch2: "+ch2); //ASCII - 98 -> b

	 // If we want to print the ASCII values itself for characters with these operators then cast to int in the print statement:

		System.out.println("ASCII ch2: "+(byte)ch2++);// 98 (because ch2's value was already increased in the lines above)
		System.out.println("ASCII ch2: "+(byte)ch2); // 99

		// pre and post increment and decrement operators are applicable to all primitive data types except
		// booleans
		// pre and post increment and decrement operators are not applicable to Strings

		int e1 = 2;
		int e2 = e1++ + ++e1;
		System.out.println(e1); //4
		System.out.println(e2); //6

		int l1=2;
		int l2 = l1++ - l1++ + l1--;
		System.out.println(l1); //3
		System.out.println(l2); //3

		int s1 = 1;
		int s2 = 2;
		System.out.println(--s2 - ++s1 + ++s2  - --s1); //0
		System.out.println(s1); //1
		System.out.println(s2); //2

		int i=19, j = 29, k;

		k = i-- - i++ + --j - ++j + --i - j-- + ++i -j++;

		System.out.println("i: "+i); //19
		System.out.println("j: "+j); // 29
		System.out.println("k: "+k); //-20

		// Different ways of increasing the value of a variable:
		int sos = 10;
		// Method 1:
		int dos = sos+1; // dos = 11, sos = 10 (sos value is still 10 because in JAVA applying an arithmetic calculation
//		                                                      on variables using basic arithmetic operators doesn't change their value itself.
//		                                                      instead, we could the calculation to change the values of other variables like in this line)
		int dos1 = sos++; // dos1 = 10, sos = 11 (sos value will be 11 because the increment and decrement operators in JAVA
//		                                                          Actually change the value of the variable)
		int dos2 = ++sos; // dos2 = 12, sos = 12 (sos value will be 12 because the increment and decrement operators in JAVA
//        Actually change the value of the variable)
		sos+=2; // (sos value will be 14 as this method of increasing or decreasing the value of a variable will also
//		                change it's value inside the memory)

		System.out.println("sos: "+sos); // 14

		int m=0, n=0;
		int ppp = --m * --n * n-- * m--;
		System.out.println(ppp); //1
		System.out.println(m); //-2
		System.out.println(n); //-2

		int xx=111;
		int cx = 120;
		short res = (short)(xx+cx);
		System.out.println(res);











	}

}
