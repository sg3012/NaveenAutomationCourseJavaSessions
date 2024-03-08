package javasessions.assignments.numberassignments;

public class ReverseANumber {
	
	// This class shows logic of how to reverse a number
	// for e.g. 123 will be reversed as 321
	
	public static long reverseNumber(long num) {
		long rev=0;
		
		while(num!=0) {
			rev = rev * 10 + num%10;
			num = num/10;
		} 
		return rev;
	}

	public static void main(String[] args) {

		System.out.println(reverseNumber(123));
	}

}
