package javasessions.fundamentals;

public class TimeComplexityConcept {

	public static void main(String[] args) {

		// The Time Complexity of an algorithm/code is not equal 
		// to the actual time required to execute a particular code, 
		// but the number of times a statement executes.
		
		// Space complexity means How much memory a code has taken or taking?
		// space is of two types in programming:
		// Auxiliary space: Space taken by each and every line of code
		// Variable space : Space taken by variable declarations in the program
		// While calculating space complexity in the modern applications
		// we mostly consider Variable space.
		
		// In Modern Applications we don't need to worry about the space complexity
		// as the code on production is usually running on servers not our system and
		// for that the cloud/server companies like AWS, GoDaddy have already 
		// taken a huge amount of space.
		
		// Time complexity is denoted by Big O - O
		// Space complexity is denoted by Big O - O
		
		int i = 1;
		
		System.out.println(i); // Time complexity is O(1) meaning constant time complexity. 
		                       // Constant time complexity meaning the algorithm will take
		                       // same amount of time to execute regardless of input data.
		
		                       // Above 2 lines in the program will be executed only once in each execution
		                       // and will take same amount of time regardless of input data
		                       // there are no conditions, loops etc. involved. Each statements
		                       // will be executed only once per execution
		
		String s = "Selenium";
		System.out.println(s); // Time Complexity - O(1), same reason as above
		
		// If we run above 4 statements combined then also the time complexity will O(1)
		// because all these 4 statements will be executed only once per execution.
		
		// Print 1 to 10:
		for(int k= 1; k<=10; k++) {
			System.out.println(k);
		}
		
		// Time complexity of above loop:
		// k=1, will be executed only 1 time. So, time complexity 1
		
		// k<=10 , this condition will be dependent on the size of upper limit passed.
		           // If 10 it will execute 10 times, if 100 it will execute 100 times and so on.
		           // if n then n times. So, Time complexity = n
		
		// k++ , this line will be dependent on the size of upper limit passed.
                 // If 10 it will execute 10 times, if 100 it will execute 100 times and so on.
                  // if n then n times. So, Time complexity = n 
		
		// System.out.println(k), this line will be dependent on the size of upper limit passed.
                                  // If 10 it will execute 10 times, if 100 it will execute 100 times and so on.
                                  // if n then n times. So, Time complexity = n 
		
		// Time complexity = 1+n+n+n = 3n+1 ---> LINEAR EQUATION
		// 3n+1 - we will remove 1 as it's constant time complexity and will almost be negligible
		// 3n - Ignore 3 as well as it is constant number
		// Final time complexity - O(n)
		
		// Time complexity of the loop and assignment line below:
		int p = 1;
		while(p<=100) {
			System.out.println(p);
				if(p==30) {
					System.out.println("Hi");
				}
			p++;
		}
		
		// p=1, Time complexity = 1
		// p<=100, Time complexity = n (Dependent on the size of upper limit for loop execution)
		// System.out.println(p); Time complexity = n (Dependent on the size of upper limit for loop execution)
		// if(p==30); Time complexity = n (This condition will be checked in each iteration of the loop, no matter
		                                     // it is true or false)
		// System.out.println("Hi"); Time complexity = 1 (It will be executed only once, when
		                                                  // the condition is true)
		// p++; Time complexity = n (Dependent on the size of upper limit for loop execution and will be
		                             // executed in each iteration)
		
		// Combined time complexity = 1+n+n+1+n = 4n+2 = 2(2n+1)
		// 2(2n+1) = Ignoring 1 as it's constant time complexity 
		// 4n = Ignoring 4 as it is constant and it could be anything 4 or 5 or 10 etc.
		// Generalized Final time complexity = O(n)
		
		// NOTE: For single loops (without having any nested loops) the time complexity
		// will be O(n) most of the time.
		
		// TIME COMPLEXITY OF NESTED LOOPS:
		
		// for loop:
		// Print the pattern:
		// 00  01 02 03 04 05
		// 10  11 12 13 14 15
		// 20  21 22 23 24 25
		// 30  31 32 33 34 35
		// 40  41 42 43 44 45
		// 50  51 52 53 54 55
		
		System.out.println("-------");
		for(int m = 0; m<=9; m++) {
			for(int n = 0; n<=9; n++) {
				System.out.print(m+""+n+" ");
			}
			System.out.println();
		}
		
		// Space Complexity:
		// int m = 0; // It will take 4 bytes only once
		// int n = 0; // It will take 4 bytes only once
		// Final space complexity = O(1) // as all the space by variables will be taken 
		                                 // only once after running the code
		
		// Time complexity (outer loop):
		// m=0; Time complexity=1 (constant)
		// m<=9; Time complexity = n
		// m++; Time complexity = n
		// System.out.println(); Time complexity = n


		
		// Time complexity (Inner loop):
		// n=0; Time complexity=1 (constant)
		// n<=9; Time complexity = n
		// System.out.print(m+""+n+" "); Time complexity = n
		// n++; Time complexity = n
		
		// FINAL TIME COMPLEXITY:
		// (1+n+n+n) (1+n+n+n) = (1+3n) (1+3n) = 1+3n+3n+9n^2
		// 9n^2+6n+1 - QUADRATIC EQUATION - Ignore 1
		// 9n^2+6n - 3n(3n+2) - Ignore 2
		// 9n^2 - Ignore 9
		// Generalized Time complexity = O(n^2)
		
		// TIME COMPLEXITY OF BINARY SEARCH
		// Array elements = 1-30
		// Size = 30
		// Element to find - 25
		
		// low = 0
		// high = 29
		// mid = 29/2 = 14.5 = 15
		// first set - 1-15
		// second set - 17-30 - We will take this set as 25 will be in this set only
		
		// 17-30 -> Size = 14 = 0-13
		// 13/2 = 6.5 = 7 
		// first set = 17-23
		// second set = 25-30 - We will take this set as 25 will be in this set only
		
		// 25-30 -> size = 6 = 0-5
		// 5/2 -> 2.5 = 3
		// first set = 25-27 - We will take this set as 25 will be in this set only
		// second set = 29-30
		
		// 25-27 - size = 3 = 0-2
		// 2/2 -> 1
		// first set = 25 - We will take this (ELEMENT FOUND)
		// second set = 27	
		
		// Following is the approach / algo for Binary Search for 'n' elements:
		// step 1: n/2
		// step 2: n/4
		// step 3: n/8 and so on.
		// TIME COMPLEXITY FORMULA FOR BINARY SEARCH:
		// Let's say number of elements are k at every step. So,
		// k = n/2
		// Taking log base 2 both sides
		// log(k) = log(n/2)
		// log(k) = log(n) - log(2) {log(m/n) = log(m) - log(n)}
		// log(k) = log(n) - 1 = Ignore 1              {log base n of n = 1}
		// log(k) = log(n)
		// Generalized time complexity : log(n)
		// NOTE: For any algorithm, if we are dividing the input data into halves, one thirds and so on,
		// then the time complexity will always be log(n)
		
		// if we divide by 2 then we get log base 2
		// if we divide by 3 then we get log base 3
		// if we divide by 9 then we get log base 9 and so on
		
		// NOTE: While optimizing the code's time complexity always try to optimize it
		// in minus 1 complexity. Meaning, If a code is running in O(n^3) time try to
		// optimize it in O(n^2) time, If a code is running in O(n^2) time try to
		// optimize it in O(n) time and so on. 
		
	}

}
