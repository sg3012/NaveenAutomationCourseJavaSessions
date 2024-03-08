package javasessions.assignments.loopsassignments;

public class PrintEvenOddUsingLoops {

	public static void main(String[] args) {

		// 1. Print all the even and odd numbers between 1 to 100

		for (int num = 1; num <= 100; num++) {
			if (num % 2 == 0) {
				System.out.println("Even number:" + num);
			} else {
				System.out.println("Odd number:" + num);
			}
		}

	}

}
